package com.example.apple.pocketlife.app.ui.news.newsweb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.blankj.utilcode.utils.ToastUtils;
import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.bmobbean.WebLikeBean;
import com.example.apple.pocketlife.lib.base.App;
import com.orhanobut.logger.Logger;
import com.sackcentury.shinebuttonlib.ShineButton;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

/**
 * 新闻页面详情
 */
public class NewWebActivity extends AppCompatActivity {

    @BindView(R.id.wv_news)
    WebView webview;
    @BindView(R.id.shinebutton_web)
    ShineButton shinebuttonWeb;
    private String url;
    private String title;
    WebLikeBean temp = new WebLikeBean();
    String objectId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_web);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        url = intent.getStringExtra("webview");
        title = intent.getStringExtra("title");
        initBUtton();
        initWeb(url);
        initShineButton();
    }

    private void initBUtton() {
        BmobQuery<WebLikeBean> query = new BmobQuery<WebLikeBean>();
        //查询playerName叫“比目”的数据
        query.addWhereEqualTo("url", url);
        query.addWhereEqualTo("name", App.useName);
        query.addWhereEqualTo("title", title);
        //返回50条数据，如果不加上这条语句，默认返回10条数据
        query.setLimit(50);
        //执行查询方法
        query.findObjects(new FindListener<WebLikeBean>() {
            @Override
            public void done(List<WebLikeBean> object, BmobException e) {
                if (e == null) {
                    if (object.size() == 0) {
                        Logger.e(object.toString());
                        shinebuttonWeb.setChecked(false);

                    } else {
                        shinebuttonWeb.setChecked(true);

                    }
                } else {
                    Log.i("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                }
            }
        });
    }

    private void initShineButton() {
        shinebuttonWeb.setOnCheckStateChangeListener(new ShineButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View view, boolean checked) {

                if (!App.useName.equals("admin")) {
                    if (checked) {
                        WebLikeBean p2 = new WebLikeBean();
                        p2.setTitle(title);
                        p2.setUrl(url);
                        p2.setName(App.useName);
                        p2.save(new SaveListener<String>() {
                            @Override
                            public void done(String objectId, BmobException e) {
                                if (e == null) {
                                    ToastUtils.showShortToast("收藏成功");
                                } else {
                                    ToastUtils.showShortToast("已经收藏过了哦~");
                                }
                            }
                        });
                    } else {
                        BmobQuery<WebLikeBean> query = new BmobQuery<WebLikeBean>();
                        //查询playerName叫“比目”的数据
                        query.addWhereEqualTo("name", App.useName);
                        query.addWhereEqualTo("url", url);
                        query.addWhereEqualTo("title", title);
                        //返回50条数据，如果不加上这条语句，默认返回10条数据
                        query.setLimit(50);
                        //执行查询方法
                        query.findObjects(new FindListener<WebLikeBean>() {
                            @Override
                            public void done(List<WebLikeBean> object, BmobException e) {
                                if (e == null) {
                                    objectId = object.get(0).getObjectId();
                                    WebLikeBean webLikeBean = new WebLikeBean();
                                    webLikeBean.setName(App.useName);
                                    webLikeBean.setObjectId(objectId);
                                    webLikeBean.setUrl(url);
                                    webLikeBean.setTitle(title);
                                    webLikeBean.delete(new UpdateListener() {
                                        @Override
                                        public void done(BmobException e) {
                                            if (e == null) {
                                                Log.i("bmob", "成功");
                                                ToastUtils.showShortToast("取消收藏");
                                            } else {
                                                Log.i("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                                            }
                                        }
                                    });
                                } else {
                                    Log.i("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                                }
                            }
                        });
                    }
                } else {
                    ToastUtils.showShortToast("请先登录哦~");
                }
            }
        });
    }

    private void initWeb(String url) {
        //加载Url
        webview.loadUrl(url);
        //取消滚动条
        webview.setVerticalScrollBarEnabled(false);
        webview.setHorizontalScrollBarEnabled(false);
        //设置网页显示的比例
        WebSettings webSettings = webview.getSettings();
        //设置是否支持JavaScript
        webSettings.setJavaScriptEnabled(true);
        //是否支持缩放
        webSettings.setSupportZoom(true);
        //是否现在缩放控制-加减号
        webSettings.setBuiltInZoomControls(true);
        //WebView双击变大，再双击后变小
        webSettings.setUseWideViewPort(true);
        //网页打开监听
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        webview.stopLoading(); //停止加载
        ((ViewGroup) webview.getParent()).removeView(webview); //把webview从视图中移除
        webview.removeAllViews(); //移除webview上子view
        webview.clearCache(true); //清除缓存
        webview.clearHistory(); //清除历史
        webview.destroy(); //销毁webview自身

    }
}

package com.example.apple.pocketlife.app.ui.everyday.basketball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.apple.pocketlife.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * NBA信息详情
 */
public class BBNorSkipActivity extends AppCompatActivity {

    @BindView(R.id.wv_bbnor)
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbnor_skip);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        initWeb(url);
    }

    /**
     * WebView 初始化
     *
     * @param url
     */
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

    //    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) { //按下返回键
//            if (webview.canGoBack()) { //webview可以返回的时候，也就是进入了内部链接
//                webview.goBack(); //返回上一级画面
//                return true;
//            }
//        }
//        return super.onKeyDown(keyCode, event);
//    }
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

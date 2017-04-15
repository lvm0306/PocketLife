package com.example.apple.pocketlife.app.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.blankj.utilcode.utils.ToastUtils;
import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.bmobbean.LoginBean;
import com.example.apple.pocketlife.app.ui.regist.RegistActivity;
import com.example.apple.pocketlife.lib.base.App;
import com.example.apple.pocketlife.lib.utils.PrefrefencesUtil;
import com.example.apple.pocketlife.lib.utils.UIManager;
import com.orhanobut.logger.Logger;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;

/**
 * 登录页
 */
public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.tv_login_title)
    TextView tvLoginTitle;
    @BindView(R.id.et_uesName_flo)
    EditText etUesNameFlo;
    @BindView(R.id.et_password_flo)
    EditText etPasswordFlo;
    @BindView(R.id.tv_login_)
    TextView tvLogin;
    @BindView(R.id.tv_login_regist)
    TextView tvLoginRegist;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        context = this;
    }


    @OnClick({R.id.tv_login_title, R.id.et_uesName_flo, R.id.et_password_flo, R.id.tv_login_, R.id.tv_login_regist})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_login_title:
                break;
            case R.id.et_uesName_flo:
                break;
            case R.id.et_password_flo:
                break;
            case R.id.tv_login_regist:
                Intent intent = new Intent();
                intent.setClass(context, RegistActivity.class);
                startActivityForResult(intent, 1);
                break;
            case R.id.tv_login_:

                final String name = etUesNameFlo.getEditableText().toString();
                final String psw = etPasswordFlo.getEditableText().toString();
                if (check()) {
                    BmobQuery<LoginBean> query = new BmobQuery<LoginBean>();
                    //查询playerName叫“比目”的数据
                    query.addWhereEqualTo("name", name);
                    //返回50条数据，如果不加上这条语句，默认返回10条数据
                    query.setLimit(10);
                    //执行查询方法
                    query.findObjects(new FindListener<LoginBean>() {
                        @Override
                        public void done(List<LoginBean> object, BmobException e) {
                            if (e == null) {
                                if (object.size() == 0) {
                                    ToastUtils.showShortToast("登录失败:此用户名没有注册");
                                } else {
//                                toast("查询成功：共" + object.size() + "条数据。");
                                    for (LoginBean gameScore : object) {
                                        if (gameScore.getName().equals(name)) {
                                            App.useName = name;
                                            PrefrefencesUtil.put(context, "login", name);
                                            PrefrefencesUtil.put(context, "login_psw", psw);
                                            ToastUtils.showShortToast("登录成功");
                                            Logger.d(App.useName);
                                            finish();
                                        }

                                    }
                                }
                            } else {
//                                Log.i("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                                Logger.e(e.getMessage());
                            }

                        }
                    });
                } else {

                }
                break;
        }
    }

    /**
     * 用户名 检测
     *
     * @return
     */
    private boolean check() {
        String name = etUesNameFlo.getEditableText().toString();
        String psw = etPasswordFlo.getEditableText().toString();
        if (name.length() < 6) {
            ToastUtils.showShortToast("用户名长度要大于6位哦~");
            return false;
        } else if (name.length() > 12) {
            ToastUtils.showShortToast("用户名长度不能超过12位哦~");
            return false;
        } else if (psw.length() < 8) {
            ToastUtils.showShortToast("密码位数不能小于8位哦");
            return false;
        } else if (psw.length() > 20) {
            ToastUtils.showShortToast("密码不能超过20位哦~");
            return false;
        } else {
            return true;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 1) {
            String name = data.getStringExtra("name");
            String psw = data.getStringExtra("psw");
            etPasswordFlo.setText(psw);
            etUesNameFlo.setText(name);
        }
    }
}

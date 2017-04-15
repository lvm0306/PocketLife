package com.example.apple.pocketlife.app.ui.regist;

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
import com.example.apple.pocketlife.lib.base.App;
import com.example.apple.pocketlife.lib.utils.PrefrefencesUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * 注册页面
 */
public class RegistActivity extends AppCompatActivity {

    @BindView(R.id.tv_login_title)
    TextView tvLoginTitle;
    @BindView(R.id.et_regist_name)
    EditText etRegistName;
    @BindView(R.id.et_regist_psw)
    EditText etRegistPsw;
    @BindView(R.id.et_regist_psw_again)
    EditText etRegistPswAgain;
    @BindView(R.id.tv_regist)
    TextView tvRegist;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        ButterKnife.bind(this);
        context = this;
    }

    @OnClick({R.id.tv_login_title, R.id.tv_regist})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_login_title:
                break;
            case R.id.tv_regist:
                final String name = etRegistName.getEditableText().toString();
                final String psw = etRegistPsw.getEditableText().toString();
                String pswagain = etRegistPswAgain.getEditableText().toString();
                if (check()) {
                    LoginBean loginBean = new LoginBean();
                    loginBean.setName(name);
                    loginBean.setPsw(psw);
                    loginBean.save(new SaveListener<String>() {
                        @Override
                        public void done(String objectId, BmobException e) {
                            if (e == null) {
                                App.useName = name;
                                PrefrefencesUtil.put(context, "login", name);
                                PrefrefencesUtil.put(context, "login_psw", psw);
                                ToastUtils.showShortToast("注册成功");
                                Intent intent = new Intent();
                                intent.putExtra("name", name);
                                intent.putExtra("psw", psw);
                                setResult(1, intent); //intent为A传来的带有Bundle的intent，当然也可以自己定义新的Bundle
                                finish();//此处一定要调用finish()方法
                            } else {
                                ToastUtils.showShortToast("注册失败:" + e.getMessage());
                            }
                        }
                    });
                }
                break;
        }
    }

    private boolean check() {

        String name = etRegistName.getEditableText().toString();
        String psw = etRegistPsw.getEditableText().toString();
        String pswagain = etRegistPswAgain.getEditableText().toString();
        if (name.length() < 6) {
            ToastUtils.showShortToast("用户名长度要大于6位哦~");
            return false;
        } else if (name.length() > 12) {
            ToastUtils.showShortToast("用户名长度不能超过12位哦~");
            return false;
        } else if (!psw.equals(pswagain)) {
            ToastUtils.showShortToast("两次密码不一致哦~");
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
}

package com.example.apple.pocketlife.app.ui.everyday.phoneadress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.utils.ToastUtils;
import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.constant.UrlConstant;
import com.example.apple.pocketlife.app.ui.everyday.bean.PhoneBean;
import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 电话归属地查询
 */
public class PhoneAdressActivity extends AppCompatActivity implements PhoneContract.PhoneView {
    PhoneBean.ResultBean resultBean;

    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.btn_phonenum)
    Button btnPhonenum;
    @BindView(R.id.tv_phone_privence)
    TextView tvPhonePrivence;
    @BindView(R.id.tv_phone_city)
    TextView tvPhoneCity;
    @BindView(R.id.tv_phone_company)
    TextView tvPhoneCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_adress);
        ButterKnife.bind(this);
    }

    private void initData() {
        PhonePresenter presenter = new PhonePresenter(this);
        Map<String, Object> map = new HashMap<>();
        map.put(UrlConstant.Param.phone, 1854515);
        map.put(UrlConstant.Param.dtype, "json");
        map.put(UrlConstant.Param.key, "f2980ea72d63f7294326c02ee983fa84");
        String url = "http://apis.juhe.cn/mobile/get?phone=" + Integer.valueOf(etPhone.getEditableText().toString().substring(0, 7)) + "&dtype=json&key=f2980ea72d63f7294326c02ee983fa84";
        presenter.loadNetworkData(url);
    }


    @Override
    public void showErrorInfo(Exception ex) {

    }

    @Override
    public void loadNetworkData(PhoneBean phoneBean) {
        resultBean = phoneBean.getResult();
        tvPhonePrivence.setText("省份：" + resultBean.getProvince());
        tvPhoneCity.setText("城市:：" + resultBean.getCity());
        tvPhoneCompany.setText("运营商：" + resultBean.getCompany());
    }

    @OnClick({R.id.btn_phonenum, R.id.tv_phone_privence})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_phonenum:
                if (etPhone.getEditableText().toString().length() != 11) {
                    Toast.makeText(PhoneAdressActivity.this, "手机号位数不对哦", Toast.LENGTH_SHORT).show();
                    break;
                } else {
                    initData();
                }
                break;
            case R.id.tv_phone_privence:
                break;
        }
    }
}

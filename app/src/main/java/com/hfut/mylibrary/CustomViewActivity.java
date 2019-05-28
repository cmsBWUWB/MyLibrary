package com.hfut.mylibrary;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hfut.customview.BloodView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomViewActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.bv_blood)
    BloodView bvBlood;
    @BindView(R.id.bt_add_blood)
    Button btAddBlood;
    @BindView(R.id.bt_cut_blood)
    Button btCutBlood;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
        ButterKnife.bind(this);

        setListener();
    }

    private void setListener() {
        btAddBlood.setOnClickListener(this);
        btCutBlood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_add_blood:
                bvBlood.setCurrentBlood(bvBlood.getCurrentBlood() + 1);
                break;
            case R.id.bt_cut_blood:
                bvBlood.setCurrentBlood(bvBlood.getCurrentBlood() - 1);
                break;
        }
    }
}

package com.example.chailei.chllibrary.activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.chailei.chllibrary.R;
import com.example.chailei.chllibrary.utils.ToastUtils;
import com.example.cllibrary.widget.IosBottomDialog;

public class IosBottomDialogActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ios_bottom_dialog);
        findViewById(R.id.fragment_ios_bottom_dialog_btn1).setOnClickListener(this);
        findViewById(R.id.fragment_ios_bottom_dialog_btn2).setOnClickListener(this);
        findViewById(R.id.fragment_ios_bottom_dialog_btn3).setOnClickListener(this);
        findViewById(R.id.fragment_ios_bottom_dialog_btn4).setOnClickListener(this);
        findViewById(R.id.fragment_ios_bottom_dialog_btn5).setOnClickListener(this);
        findViewById(R.id.fragment_ios_bottom_dialog_btn6).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final IosBottomDialog.Builder builder = new IosBottomDialog.Builder(this);
        switch (v.getId()) {
            case R.id.fragment_ios_bottom_dialog_btn1:
                //无标题，只有操作
                builder.addOption("操作1", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                    @Override
                    public void onOptionClick() {
                        ToastUtils.show(IosBottomDialogActivity.this,"操作1");
                    }
                }).create().show();
                break;
            case R.id.fragment_ios_bottom_dialog_btn2:
                //无操作，只有标题
                builder.setTitle("标题", Color.RED).create().show();
                break;
            case R.id.fragment_ios_bottom_dialog_btn3:
                //标题＋1个操作
                builder.setTitle("标题", Color.RED)
                        .addOption("操作1", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                            @Override
                            public void onOptionClick() {
                                ToastUtils.show(IosBottomDialogActivity.this,"操作1");
                            }
                        }).create().show();
                break;
            case R.id.fragment_ios_bottom_dialog_btn4:
                //标题＋2个操作
                builder.setTitle("标题", Color.RED)
                        .addOption("操作1", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                            @Override
                            public void onOptionClick() {
                                ToastUtils.show(IosBottomDialogActivity.this,"操作1");
                            }
                        })
                        .addOption("操作2", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                            @Override
                            public void onOptionClick() {
                                ToastUtils.show(IosBottomDialogActivity.this,"操作2");
                            }
                        }).create().show();
                break;
            case R.id.fragment_ios_bottom_dialog_btn5:
                //无标题，3个操作
                builder.addOption("操作1", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                    @Override
                    public void onOptionClick() {
                        ToastUtils.show(IosBottomDialogActivity.this,"操作1");
                    }
                }).addOption("操作2", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                    @Override
                    public void onOptionClick() {
                        ToastUtils.show(IosBottomDialogActivity.this,"操作2");
                    }
                }).addOption("操作3", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                    @Override
                    public void onOptionClick() {
                        ToastUtils.show(IosBottomDialogActivity.this,"操作3");
                    }
                }).create().show();
                break;
            case R.id.fragment_ios_bottom_dialog_btn6:
                //无标题，4个操作
                builder.addOption("操作1", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                    @Override
                    public void onOptionClick() {
                        ToastUtils.show(IosBottomDialogActivity.this,"操作1");
                    }
                }).addOption("操作2", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                    @Override
                    public void onOptionClick() {
                        ToastUtils.show(IosBottomDialogActivity.this,"操作2");
                    }
                }).addOption("操作3", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                    @Override
                    public void onOptionClick() {
                        ToastUtils.show(IosBottomDialogActivity.this,"操作3");
                    }
                }).addOption("操作4", Color.DKGRAY, new IosBottomDialog.OnOptionClickListener() {
                    @Override
                    public void onOptionClick() {
                        ToastUtils.show(IosBottomDialogActivity.this,"操作4");
                    }
                }).create().show();
                break;
        }
    }
}

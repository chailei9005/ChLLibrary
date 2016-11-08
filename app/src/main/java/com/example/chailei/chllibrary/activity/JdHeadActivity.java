package com.example.chailei.chllibrary.activity;

import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.chailei.chllibrary.R;
import com.example.cllibrary.bean.HeadlineBean;
import com.example.cllibrary.widget.TaobaoHeadline;

import java.util.ArrayList;
import java.util.List;

public class JdHeadActivity extends AppCompatActivity {

    private TaobaoHeadline mTaobaoHeadline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jd_head);
        initView();
    }

    private void initView() {
        mTaobaoHeadline = (TaobaoHeadline) findViewById(R.id.headline);
        List<HeadlineBean> data = new ArrayList<>();
        data.add(new HeadlineBean("热门", "袜子裤子只要998～只要998～"));
        data.add(new HeadlineBean("推荐", "秋冬上心，韩流服饰，一折起"));
        data.add(new HeadlineBean("好货", "品牌二手车"));
        data.add(new HeadlineBean("省钱", "MadCatz MMO7 游戏鼠标键盘套装"));
        mTaobaoHeadline.setData(data);
        mTaobaoHeadline.setHeadlineClickListener(new TaobaoHeadline.HeadlineClickListener() {
            @Override
            public void onHeadlineClick(HeadlineBean bean) {
                Toast.makeText(JdHeadActivity.this,bean.getTitle() + ":" + bean.getContent(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onMoreClick() {
                Toast.makeText(JdHeadActivity.this,"更多", Toast.LENGTH_LONG).show();
            }
        });
    }
}

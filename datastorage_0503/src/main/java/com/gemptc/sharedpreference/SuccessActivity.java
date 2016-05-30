package com.gemptc.sharedpreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.gemptc.datastorage.R;

public class SuccessActivity extends AppCompatActivity {
    TextView mTextView;
    String mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        initData();
        initViews();
    }

    private void initData() {
        Intent intent = getIntent();
        mName = intent.getStringExtra("name");
    }

    private void initViews() {
        mTextView = (TextView) findViewById(R.id.success);
        mTextView.setText(mName);
    }
}

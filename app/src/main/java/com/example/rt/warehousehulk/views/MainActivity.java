package com.example.rt.warehousehulk.views;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.rt.warehousehulk.R;

public class MainActivity extends BaseDrawerActivity {

    public static final long IDENTIFIER = 1;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.drawer_toolbar);
    }

    @Override
    protected long getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    protected Toolbar getDrawerToolbar() {
        return mToolbar;
    }
}

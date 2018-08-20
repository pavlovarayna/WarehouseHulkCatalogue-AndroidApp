package com.example.rt.warehousehulk.views.promotions;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.rt.warehousehulk.R;
import com.example.rt.warehousehulk.views.BaseDrawerActivity;
import com.github.chrisbanes.photoview.PhotoView;

public class PromotionActivity extends BaseDrawerActivity {

    public static final long IDENTIFIER = 3;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion);

        mToolbar = findViewById(R.id.drawer_toolbar);

        PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.promotion1);
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

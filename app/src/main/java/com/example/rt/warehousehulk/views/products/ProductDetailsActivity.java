package com.example.rt.warehousehulk.views.products;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.rt.warehousehulk.R;
import com.pavlovarayna.warehousehulkapplication.R;

public class ProductDetailsActivity extends Activity {
    private ProductDetailsFragment mProductDetailsFragment;

    // private ProductDetailsFragment mProductDetailsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Intent intent = getIntent();
        String product = intent.getStringExtra("PRUDUCT_NAME");

        mProductDetailsFragment = ProductDetailsFragment.newInstance();
        mProductDetailsFragment.setProduct(product);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mProductDetailsFragment)
                .commit();
    }


        /*TextView tv = findViewById(R.id.tv_productDetails);
        tv.setText(product);*/

        /*mProductDetailsFragment = ProductDetailsFragment.newInstance();
        mProductDetailsFragment.setProduct(product);*/

       /* getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mProductDetailsFragment)
                .commit();*/
    }





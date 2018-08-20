package com.example.rt.warehousehulk.views.products;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.rt.warehousehulk.R;
import com.example.rt.warehousehulk.uiutils.Navigator;
import com.example.rt.warehousehulk.views.BaseDrawerActivity;


public class ProductListActivity extends BaseDrawerActivity implements Navigator {

    private ProductListFragment mProductListFragment;

    public static final long IDENTIFIER = 2;
    private Toolbar mToolbar;
   // private ProductListFragment mProductFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        mToolbar = findViewById(R.id.drawer_toolbar);
        mProductListFragment = ProductListFragment.newInstance();
        mProductListFragment.setmNavigator(this);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mProductListFragment)
                .commit();

       /*
        mDrinksButton = findViewById(R.id.btn_listdrinks);
        mDrinksButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProductListActivity.this,
                        DrinksListActivity.class);
                startActivity(intent);
            }
        });

        mFoodButton = findViewById(R.id.btn_listfood);
        mFoodButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProductListActivity.this,
                        FoodListActivity.class);
                startActivity(intent);
            }
        });

        mDomesticsButton = findViewById(R.id.btn_listdomestic);
        mDomesticsButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProductListActivity.this,
                        FoodListActivity.class);
                startActivity(intent);
            }
        });*/


   /*     ProductListFragment mProductListFragment = ProductListFragment.newInstance();
        //mProductListFragment.setmNavigator(this);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mProductListFragment)
                .commit();
    }*/


      /* OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                Fragment mFragment = null;
                if(view == findViewById(R.id.btn_listdrinks)){
                    mFragment = new DrinksListFragment();
                } else if(view == findViewById(R.id.btn_listfood)){
                    mFragment = new FoodListFragment();
                } else {
                    mFragment = new DomesticListFragment();
                }

                //mProductFragment.setmNavigator(this);
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content, mFragment)
                        .commit();



            }
        };*/




    }
    @Override
    protected long getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    protected Toolbar getDrawerToolbar() {
        return mToolbar;
    }


    @Override
    public void navigateWith(String product) {
        Intent intent = new Intent(
                this,
                ProductDetailsActivity.class
        );

        intent.putExtra("PRUDUCT_NAME", product);
        startActivity(intent);
    }

    }
}


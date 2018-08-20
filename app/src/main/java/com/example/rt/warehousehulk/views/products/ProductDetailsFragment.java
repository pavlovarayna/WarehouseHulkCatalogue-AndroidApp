package com.example.rt.warehousehulk.views.products;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rt.warehousehulk.R;
import com.pavlovarayna.warehousehulkapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductDetailsFragment extends Fragment {


    private String mProduct;
    private TextView mProductTextView;

    public ProductDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_details, container, false);

        mProductTextView = view.findViewById(R.id.tv_productDetails);
        mProductTextView.setText(mProduct);
        return view;
    }

    public static ProductDetailsFragment newInstance() {
            return new ProductDetailsFragment();
    }

    public void setProduct(String product) {
        mProduct = product;
        if (mProductTextView == null){
            return;
        }
        mProductTextView.setText(product);
    }
}

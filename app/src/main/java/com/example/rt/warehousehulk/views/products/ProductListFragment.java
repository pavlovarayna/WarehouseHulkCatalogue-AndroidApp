package com.example.rt.warehousehulk.views.products;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rt.warehousehulk.R;
import com.example.rt.warehousehulk.models.HulkProducts;
import com.example.rt.warehousehulk.repositories.FirebaseRepository;
import com.example.rt.warehousehulk.repositories.base.Repository;
import com.example.rt.warehousehulk.uiutils.Navigator;
import com.google.firebase.firestore.FirebaseFirestore;

public class ProductListFragment extends Fragment implements AdapterView.OnItemClickListener {

private Navigator mNavigator;
private ListView mProductListView;
private ArrayAdapter<String> mProductListAdapter;
private FirebaseFirestore mdb;
private Repository<HulkProducts> mProductsRepository;


    public ProductListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_list, container, false);

        mdb = FirebaseFirestore.getInstance();

        mProductListView = view.findViewById(R.id.lv_products);
        mProductListAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1);

        mProductListView.setAdapter(mProductListAdapter);
        mProductListView.setOnItemClickListener(this);


        mProductsRepository = new FirebaseRepository<>(HulkProducts.class);

        mProductsRepository.add(new HulkProducts("milk", "food"),
                newHulkProducts -> {
                    mProductsRepository.getAll( hulkproducts ->{
                        for (HulkProducts product: hulkproducts) {
                            mProductListAdapter.add(product.name);
                        }
                    });

                });

        return view;
    }

    public static ProductListFragment newInstance() {
        return new ProductListFragment();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String product = mProductListAdapter.getItem(position);
        mNavigator.navigateWith(product);

    }

    public void setmNavigator(Navigator navigator) {
        mNavigator = navigator;
    }
}

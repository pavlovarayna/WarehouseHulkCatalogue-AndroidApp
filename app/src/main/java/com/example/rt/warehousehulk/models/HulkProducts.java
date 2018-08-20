package com.example.rt.warehousehulk.models;

public class HulkProducts {
    public String name;
    public String type;

    public HulkProducts() {
        // empty constructor for Firebase connection
    }
    public HulkProducts(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

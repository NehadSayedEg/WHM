package com.example.whm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class StockRecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_rec);
        Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(StockRecActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.select_receive_type));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(myAdapter3);
        Spinner spinner4 = (Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<String> myAdapter4 = new ArrayAdapter<String>(StockRecActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.select_store));
        myAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(myAdapter4);
        Spinner spinner5 = (Spinner)findViewById(R.id.spinner5);
        ArrayAdapter<String> myAdapter5 = new ArrayAdapter<String>(StockRecActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.select_Bin));
        myAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(myAdapter5);

    }
}
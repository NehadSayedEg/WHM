package com.example.whm.UI.StockTranActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.whm.R;

public class StockTranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_tran);

        Spinner spinner6 = (Spinner)findViewById(R.id.spinner6);
        ArrayAdapter<String> myAdapter6 = new ArrayAdapter<String>(StockTranActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.select_transfer_type));
        myAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(myAdapter6);
        Spinner spinner7 = (Spinner)findViewById(R.id.spinner7);
        ArrayAdapter<String> myAdapter7 = new ArrayAdapter<String>(StockTranActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.select_store_from));
        myAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(myAdapter7);
        Spinner spinner8 = (Spinner)findViewById(R.id.spinner8);
        ArrayAdapter<String> myAdapter8 = new ArrayAdapter<String>(StockTranActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.select_bin_from));
        myAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(myAdapter8);
        Spinner spinner9 = (Spinner)findViewById(R.id.spinner9);
        ArrayAdapter<String> myAdapter9 = new ArrayAdapter<String>(StockTranActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.select_store));
        myAdapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(myAdapter9);
        Spinner spinner10 = (Spinner)findViewById(R.id.spinner10);
        ArrayAdapter<String> myAdapter10 = new ArrayAdapter<String>(StockTranActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.select_bin_to));
        myAdapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10.setAdapter(myAdapter10);
    }
}
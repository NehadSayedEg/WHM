package com.example.whm.UI.HomeActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.whm.UI.ItemsActivity.ItemsActivity;
import com.example.whm.UI.LoginActivity.LoginActivity;
import com.example.whm.R;
import com.example.whm.StockIssueActivity;
import com.example.whm.StockRecActivity;
import com.example.whm.UI.StockTranActivity.StockTranActivity;
import com.example.whm.UI.StoresActivity.StoresActivity;

public class HomeActivity extends AppCompatActivity {
    TextView user_name ,stores_tv , items_tv,balances_tv, stock_issues_tv, stock_receive_tv, stock_transfer_tv, reports_tv;
    ImageButton items, balances, stock_issues, stock_receive, stock_transfer, reports , stores;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        user_name = findViewById(R.id.user_name);
        stores_tv = findViewById(R.id.stores_tv);
        items_tv = findViewById(R.id.items_tv) ;
        balances_tv = findViewById(R.id.balances_tv);
        stock_issues_tv = findViewById(R.id.stock_issues_tv);
        stock_receive_tv = findViewById(R.id.stock_receive_tv);
        stock_transfer_tv = findViewById(R.id.stock_transfer_tv);
        reports_tv = findViewById(R.id.reports_tv);

        items = findViewById(R.id.items);
        balances = findViewById(R.id.balances);
        stock_issues = findViewById(R.id.stock_issues) ;
        stock_receive = findViewById(R.id.stock_receive);
        stock_transfer = findViewById(R.id.stock_tansfer);
        reports = findViewById(R.id.reports);
        stores = findViewById(R.id.stores);

    }
    public void to_stores(View view) {
        Intent myIntent = new Intent(HomeActivity.this, StoresActivity.class);

        startActivity(myIntent);
    }
    public void to_items(View view) {
        Intent myIntent = new Intent(HomeActivity.this, ItemsActivity.class);

        startActivity(myIntent);
    }
    public void to_balances(View view) {
        Intent myIntent = new Intent(HomeActivity.this, LoginActivity.class);

        startActivity(myIntent);
    }

    public void to_store_issues(View view) {
        Intent myIntent = new Intent(HomeActivity.this, StockIssueActivity.class);

        startActivity(myIntent);
    }
    public void to_stock_rec(View view) {
        Intent myIntent = new Intent(HomeActivity.this, StockRecActivity.class);

        startActivity(myIntent);
    }

    public void to_stock_tran(View view) {
        Intent myIntent = new Intent(HomeActivity.this, StockTranActivity.class);

        startActivity(myIntent);
    }
    }

package com.example.whm.UI.BalancesActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Model.Item;
import com.example.whm.R;
import com.example.whm.UI.ItemsActivity.ItemsAdapter;
import com.example.whm.UI.ItemsActivity.ItemsViewModel;

import java.util.List;

public class BalanceActivity extends AppCompatActivity {
    RecyclerView itemRecyclerView;
    BalanceViewModel itemsViewModel;
    BalanceAdapter balanceAdapter;
    DataRepository dataRepository;
    List<Item> itemsList;
    UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        itemRecyclerView = findViewById(R.id.rv_balances);
        itemsViewModel = new ViewModelProvider(this, new BalanceViewModel.Factory(this.getApplication(), userDao)).get(BalanceViewModel.class);
        itemRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemRecyclerView.setItemAnimator(new DefaultItemAnimator());
        itemRecyclerView.setHasFixedSize(true);
        balanceAdapter = new BalanceAdapter(itemsList, this);
        itemRecyclerView.setAdapter(balanceAdapter);


        itemsViewModel.getAllItems().observe(this, new Observer<List<Item>>() {
            @Override
            public void onChanged(List<Item> items) {
                Log.e(" Item ", items.size() + "itemsize");
                balanceAdapter.setItemList(items);

            }
        });


    }}

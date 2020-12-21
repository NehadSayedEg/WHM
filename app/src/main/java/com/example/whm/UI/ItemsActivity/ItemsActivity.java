package com.example.whm.UI.ItemsActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Database.Repository.StoresRepository;
import com.example.whm.Model.Item;
import com.example.whm.Model.Store;
import com.example.whm.UI.StoresActivity.StoresAdapter;
import com.example.whm.R;
import com.example.whm.UI.StoresActivity.StoresViewModel;
import com.example.whm.UI.StoresActivity.StoresViewModel1;

import java.util.ArrayList;
import java.util.List;

public class ItemsActivity extends AppCompatActivity {
    RecyclerView itemRecyclerView;
    ItemsViewModel itemsViewModel ;
    ItemsAdapter itemsAdapter ;
    DataRepository dataRepository ;
    List<Item> itemsList ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        itemRecyclerView = findViewById(R.id.rv_items);


        //  storesAdapter = new StoresAdapter(this);
        itemRecyclerView.setAdapter(itemsAdapter);
        itemRecyclerView.setLayoutManager(new LinearLayoutManager(this));



        itemRecyclerView.setItemAnimator(new DefaultItemAnimator());
        itemRecyclerView.setHasFixedSize(true);
        itemsList = new ArrayList<>();

        itemsAdapter = new ItemsAdapter(itemsList, this);
        // storesViewModel1 = ViewModelProviders.of(this ).get(StoresViewModel1.class);
        itemsViewModel  = new ViewModelProvider(this).get(ItemsViewModel.class);



        itemsViewModel.getAllItems().observe(this, new Observer<List<Item>>() {
            @Override
            public void onChanged(List<Item> items) {
                itemsAdapter.setItemList(items);

            }
        });



    }




}






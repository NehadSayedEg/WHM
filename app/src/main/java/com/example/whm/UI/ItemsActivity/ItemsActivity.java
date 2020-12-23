package com.example.whm.UI.ItemsActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

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
    UserDao userDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        itemRecyclerView = findViewById(R.id.rv_items);
        itemsViewModel = new ViewModelProvider(this, new ItemsViewModel.Factory(this.getApplication(), userDao)).get(ItemsViewModel.class);
        itemRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemRecyclerView.setItemAnimator(new DefaultItemAnimator());
        itemRecyclerView.setHasFixedSize(true);
       // itemsList = new ArrayList<>();
        itemsAdapter = new ItemsAdapter(itemsList, this);
        itemRecyclerView.setAdapter(itemsAdapter);



        itemsViewModel.getAllItems().observe(this, new Observer<List<Item>>() {
            @Override
            public void onChanged(List<Item> items) {
                Log.e(" Item " ,items.size()+ "itemsize");
                itemsAdapter.setItemList(items);

            }
        });



    }




}






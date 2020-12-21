package com.example.whm.UI.StoresActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.whm.Database.Repository.StoresRepository;
import com.example.whm.Model.Store;
import com.example.whm.Model.Users;
import com.example.whm.Network.ApiService;
import com.example.whm.R;
import com.example.whm.UI.LoginActivity.LoginViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StoresActivity extends AppCompatActivity {
   StoresViewModel1 storesViewModel1 ;

    StoresViewModel storesViewModel ;
    StoresRepository storesRepository ;
    RecyclerView recyclerView ;
    StoresAdapter storesAdapter ;
    List<Store> storesList ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);
        recyclerView = findViewById(R.id.stores_recyclerView);
      //  storesAdapter = new StoresAdapter(this);
        recyclerView.setAdapter(storesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        storesList = new ArrayList<>();

        storesAdapter = new StoresAdapter(storesList, this);
       // storesViewModel1 = ViewModelProviders.of(this ).get(StoresViewModel1.class);
        storesViewModel1  = new ViewModelProvider(this).get(StoresViewModel1.class);



        storesViewModel1.getAllStores().observe(this, new Observer<List<Store>>() {
          @Override
          public void onChanged(List<Store> stores) {
              storesAdapter.setStoresList(storesList);

          }
      });



    }



}
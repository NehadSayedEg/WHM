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
import com.example.whm.Model.Stores;
import com.example.whm.Network.ApiService;
import com.example.whm.R;

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
    List<Stores> storesList ;
    public static final String  BaseUrl ="http://whm.signaturegypt.com/api/sync/synctophone/";
    private ApiService apiService ;



    String s1[] ,s2[];
    int images[] = {R.drawable.stores,R.drawable.store2 ,R.drawable.stores};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);
           recyclerView = findViewById(R.id.stores_recyclerView);
           recyclerView.setLayoutManager(new LinearLayoutManager(this ));
           //recyclerView.setAdapter(storesAdapter);
           recyclerView.setItemAnimator(new DefaultItemAnimator());
           recyclerView.setHasFixedSize(true);
           storesList =  new ArrayList<>();

           storesRepository = new StoresRepository(getApplication());
        storesAdapter = new StoresAdapter(storesList , this);


        storesViewModel1  = ViewModelProviders.of(this).get(StoresViewModel1.class);




//        storesViewModel1  = new ViewModelProvider(this).get(StoresViewModel1.class);
        storesViewModel1.getAllStores().observe(this, new Observer<List<Stores>>() {
            @Override
            public void onChanged(List<Stores> storesList) {
                 storesAdapter.setStoresList(storesList);
//                Toast.makeText(StoresActivity.this, " sss ", Toast.LENGTH_LONG).show();
                recyclerView.setAdapter( storesAdapter);
                Log.d("Stores Activity" , "Data reached" + storesList);
            }
        });
        
        networkRequest();


//        storesViewModel = ViewModelProviders.of(this).get(StoresViewModel.class);
//        storesViewModel.getStores();
//
//       recyclerView = findViewById(R.id.stores_recyclerView);
//       StoresAdapter storesAdapter = new StoresAdapter();
//        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
//        recyclerView.setAdapter(storesAdapter);
//        storesViewModel.storesMutableLiveData.observe(this, new Observer<List<Stores>>() {
//            @Override
//            public void onChanged(List<Stores> stores) {
//                storesAdapter.setStoresList((ArrayList<Stores>) stores);
//            }
//        });










    }

    private void networkRequest() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);

         Call<List<Stores>> callstores = apiService.getStores();
        callstores.enqueue(new Callback<List<Stores>>() {
            @Override
            public void onResponse(Call<List<Stores>> call, Response<List<Stores>> response) {
                if(response.isSuccessful()){
                    Log.d("In the Response_______" ," @@@@@@@@@@@");
                    storesRepository.insert(response.body());

                }

            }

            @Override
            public void onFailure(Call<List<Stores>> call, Throwable t) {
                     Toast.makeText(StoresActivity.this , "some thing went wrong   in the failure ",Toast.LENGTH_LONG).show();
                Log.d("In the Failure _______" ," @@@@@@@@@@@");


            }
        });


    }
}
package com.example.whm.UI.StoresActivity;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.whm.Model.Stores;
import com.example.whm.Network.Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

 public  class StoresViewModel extends ViewModel {
    MutableLiveData<List<Stores>> storesMutableLiveData = new MutableLiveData<>();

     public void getStores(){
         Client.getINSTANCE().getStores().enqueue(new Callback<List<Stores>>() {
             @Override
             public void onResponse(Call<List<Stores>> call, Response<List<Stores>> response) {
                 storesMutableLiveData.setValue(response.body());
                 Log.d(" vewmodel Stores", " responsssssssssssssssse");

             }

             @Override
             public void onFailure(Call<List<Stores>> call, Throwable t) {
                 Log.d(" viewmodel Stores", " Failure--------");

             }
         });

     }
}

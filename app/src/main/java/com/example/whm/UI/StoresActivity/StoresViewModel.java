package com.example.whm.UI.StoresActivity;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.whm.Model.Users;
import com.example.whm.Network.Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

 public  class StoresViewModel extends ViewModel {
//    MutableLiveData<List<Users>> storesMutableLiveData = new MutableLiveData<>();
//
//     public void getStores(){
//         Client.getINSTANCE().getUsers().enqueue(new Callback<List<Users>>() {
//             @Override
//             public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
//                 storesMutableLiveData.setValue(response.body());
//                 Log.d(" vewmodel Stores", " responsssssssssssssssse");
//
//
//             }
//
//             @Override
//             public void onFailure(Call<List<Users>> call, Throwable t) {
//                 Log.e(" viewmodel Stores", " Failure--------" + t.toString());
//
//             }
//         });
//
//     }
}

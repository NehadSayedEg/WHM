package com.example.whm.UI.LoginActivity;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Database.Repository.StoresRepository;
import com.example.whm.Model.AllData;
import com.example.whm.Model.Data;
import com.example.whm.Model.Item;
import com.example.whm.Model.Store;
import com.example.whm.Model.User;
import com.example.whm.Model.Users;
import com.example.whm.Network.Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginViewModel  extends AndroidViewModel {
    DataRepository dataRepository ;

    MutableLiveData<AllData> storesMutableLiveData = new MutableLiveData<>();


    private LiveData<List<Data>> getAllData ;
    private LiveData<AllData> getAll;


    public LoginViewModel(@NonNull Application application) {
        super(application);

        dataRepository = new DataRepository(application);
        getAllData = dataRepository.getGetAllData();


    }

    public void insert(Data dataList) {
        dataRepository.insert(dataList);
    }

    public void insertAll(AllData dataList) {
        dataRepository.insertAllData(dataList);
    }


    public LiveData<List<Data>>getdata(){
        return getAllData;

    }

    public LiveData<AllData>getAllData(){
        return getAll;

    }


    public void getData(){
        Client.getINSTANCE().getAllData().enqueue(new Callback<AllData>() {
            @Override
            public void onResponse(Call<AllData> call, Response<AllData> response) {
                Log.e(" Hi From Response ", response.body().getData().getUsers().get(0).getUserNameAr().toString());
                dataRepository.insertAllData(response.body());
//                dataRepository.insert(response.body().getData());

                Log.e(" Hi From Response ", response.body().getData().getStores().get(1).getStoreNameEn().toString());
                Log.e("data_table", dataRepository.getGetAllData().toString());
//                Log.e("data_table", getAllData.getValue());
                //   Toast.makeText(getApplicationContext(),  " Hi From Response",  Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<AllData> call, Throwable t) {
                Log.e(" Login Activity ", " Failure--------" + t.toString());



            }
        });
    }
}

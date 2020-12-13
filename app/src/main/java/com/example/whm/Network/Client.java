package com.example.whm.Network;

import com.example.whm.Model.AllData;
import com.example.whm.Model.Data;
import com.example.whm.Model.Users;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
    //http://whm.signaturegypt.com/api/sync/synctophone/synctophone.php
    public static final String BaseUrl = "https://whm.signaturegypt.com/api/sync/synctophone/";


    private ApiService apiService;
    private static Client INSTANCE;

    public Client() {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();


        Retrofit retrofit = new Retrofit.Builder().baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();


        apiService = retrofit.create(ApiService.class);
    }

    public static Client getINSTANCE() {
        if (null == INSTANCE) {
            INSTANCE = new Client();
        }
        return INSTANCE;
    }


    public Call<AllData> getAllData() {
        return apiService.getAllData();
    }


}
package com.example.whm.Network;

import com.example.whm.Model.Items;
import com.example.whm.Model.Stores;
import com.example.whm.Model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
    public static final String  BaseUrl ="http://whm.signaturegypt.com/";
          //  "http://whm.signaturegypt.com/api/sync/synctophone/";
    private ApiService  apiService ;
    private  static  Client INSTANCE ;

    public Client() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);
    }

    public static Client getINSTANCE() {
        if(null == INSTANCE){
            INSTANCE =  new Client();
        }
        return INSTANCE;
    }

    public Call<List<Stores>> getStores(){
        return  apiService.getStores();
    }

//    public Call<Items> getItems(){
//        return  apiService.getItems();
//    }
//
//    public Call<Users> getUsers(){
//        return  apiService.getUsers();
//    }
}

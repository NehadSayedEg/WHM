package com.example.whm.Network;

import com.example.whm.Model.AllData;
import com.example.whm.Model.Data;
import com.example.whm.Model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("synctophone.php")
    public Call<AllData> getAllData();



    //http://whm.signaturegypt.com/api/sync/synctophone/newusersync.php
   @GET("newusersync.php")
   public Call<List<Users>> getUsers();

    //    public static final String  BaseUrl ="http://whm.signaturegypt.com/api/sync/synctophone/";
    // http://whm.signaturegypt.com/api/sync/synctophone/syncstores.php

//    @GET("syncstores.php")
//     Call<List<Stores>> getStores();

//    //http://whm.signaturegypt.com/api/sync/synctophone/syncitems.php
//    @GET("syncitems.php")
//    public Call<Items> getItems();
//
}

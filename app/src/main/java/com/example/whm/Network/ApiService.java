package com.example.whm.Network;

import com.example.whm.Model.Items;
import com.example.whm.Model.Stores;
import com.example.whm.Model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
//    //http://whm.signaturegypt.com/api/sync/synctophone/newusersync.php
//    @GET("newusersync.php")
//    public Call<Users> getUsers();

    //    public static final String  BaseUrl ="http://whm.signaturegypt.com/api/sync/synctophone/";
    // http://whm.signaturegypt.com/api/sync/synctophone/syncstores.php

    @GET("syncstores.php")
     Call<List<Stores>> getStores();

//    //http://whm.signaturegypt.com/api/sync/synctophone/syncitems.php
//    @GET("syncitems.php")
//    public Call<Items> getItems();
//
}

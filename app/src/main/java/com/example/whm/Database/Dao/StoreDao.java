package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.Store;
import com.example.whm.Model.Users;

import java.util.List;
@Dao
public interface StoreDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<Store> storeList);

    @Query("SELECT * FROM  store_table")
    LiveData<List<Store>> getAllStores();


    @Query("DELETE  FROM  store_table")
    void deleteAllStores();
}




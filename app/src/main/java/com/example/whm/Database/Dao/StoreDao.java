package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.whm.Model.Shelf;
import com.example.whm.Model.Store;
import com.example.whm.Model.Users;

import java.util.List;
@Dao
public interface StoreDao {

    @Transaction

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<Store> storeList);

    long insertOneStore(Store store);
    @Insert
    void insertShelf(List<Shelf> shelfList);

    @Query("SELECT * FROM  store_table")
    LiveData<List<Store>> getAllStores();


    @Query("DELETE  FROM  store_table")
    void deleteAllStores();
}




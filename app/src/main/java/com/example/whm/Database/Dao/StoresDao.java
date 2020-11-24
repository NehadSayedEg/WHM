package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.Stores;

import java.util.List;
@Dao
  public interface StoresDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<Stores> storesList);

    @Query("SELECT * FROM  stores_table")
    LiveData<List<Stores>> getAllStores();


    @Query("DELETE  FROM  stores_table")
    void deleteAllStores();

}

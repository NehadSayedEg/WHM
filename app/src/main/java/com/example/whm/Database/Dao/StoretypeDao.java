package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.StoreType;

import java.util.List;

@Dao
public interface StoretypeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertStoreType(List<StoreType> storeTypeList);


    @Query("SELECT * FROM  store_type_table")
    LiveData<List<StoreType>> getAllStoreType();


    @Query("DELETE  FROM  store_type_table")
    void deleteAllStoreType();

}

package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.Data;
import com.example.whm.Model.Users;

import java.util.List;
@Dao
public interface DataDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Data dataList);

    @Query("SELECT * FROM  data_table")
    LiveData<List<Data>> getAllData();


    @Query("DELETE  FROM  data_table")
    void deleteAllStores();

}








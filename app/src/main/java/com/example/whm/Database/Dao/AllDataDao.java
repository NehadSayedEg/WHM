package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.AllData;
import com.example.whm.Model.User;

import java.util.List;

@Dao
public
interface AllDataDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
        void insertAllData(AllData dataList);


    @Query("SELECT * FROM allData_table ")
    LiveData<AllData> getAll();



}

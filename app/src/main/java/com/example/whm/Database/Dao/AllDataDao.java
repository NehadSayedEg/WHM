package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.AllData;
import com.example.whm.Model.User;

@Dao
public
interface AllDataDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
        Long[] insertAllData(AllData[] dataList);


    @Query("SELECT  * FROM  user_table WHERE user_name_en =  :username  and user_password = :password ")
    User loginUser(String username , String password);


    @Query("SELECT  * FROM  user_table WHERE user_id = :id ")
    LiveData<User>  getOneUser(String id);



//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void insertAllData(AllData dataList);

//
//    @Query("SELECT * FROM allData_table ")
//    LiveData<AllData> getAll();

    @Query("SELECT * FROM allData_table ")
    LiveData<AllData> getAll();




}

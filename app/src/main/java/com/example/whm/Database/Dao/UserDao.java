package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.User;
import com.example.whm.Model.Users;

import java.util.List;
@Dao
public interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<User> userList);




    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long[]  insertUser(List<User> itemsList);

    @Query("SELECT * FROM  user_table")
    LiveData<List<User>> getAllUsers();


    @Query("SELECT  * FROM  user_table WHERE user_id = :id ")
    LiveData<User>  getOneUser(String id);

//    @Query("SELECT  * FROM  user_table ")
//    LiveData<User>  getOneUser();



    @Query("DELETE  FROM  user_table")
    void deleteAllUsers();


    @Query("SELECT  * FROM  user_table WHERE user_name_en =(:username)  and user_password =(:password)")
   User loginUser(String username , String password);

    @Query("SELECT * FROM user_table WHERE user_table.user_name_en LIKE :username")
    User getAccount(String username);



}
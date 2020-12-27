package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.Shelf;
import com.example.whm.Model.UserGroup;

import java.util.List;
@Dao
public interface UserGroupDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUserGroup(List<UserGroup> userGroupList );


    @Query("SELECT * FROM  user_group_table")
    LiveData<List<UserGroup>> getAllUserGroup();


    @Query("DELETE  FROM  user_group_table")
    void deleteAllUserGroup();
}


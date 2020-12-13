package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.Item;
import com.example.whm.Model.Users;

import java.util.List;
@Dao
public interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<Item> itemsList);

    @Query("SELECT * FROM  item_table")
    LiveData<List<Item>> getAllitems();


    @Query("DELETE  FROM  item_table")
    void deleteAllItems();

}
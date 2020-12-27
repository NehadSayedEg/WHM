package com.example.whm.Database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.whm.Model.Item;
import com.example.whm.Model.Shelf;

import java.util.List;

@Dao
public interface ShelfDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertShelf(List<Shelf> shelfList);


    @Query("SELECT * FROM  shelf_table")
    LiveData<List<Shelf>> getAllShelf();


    @Query("DELETE  FROM  shelf_table")
    void deleteAllShelf();
}

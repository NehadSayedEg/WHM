package com.example.whm.Model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class StoreWithShlefs {
    @Embedded
    public Store store;
    @Relation(
            parentColumn = "store_id",
            entityColumn = "shelf_id"
    )
    public List<Shelf> shelfList;

    public StoreWithShlefs(Store store, List<Shelf> shelfList) {
        this.store = store;
        this.shelfList = shelfList;
    }

}

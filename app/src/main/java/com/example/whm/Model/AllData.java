package com.example.whm.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "allData_table")
public class AllData {

    @SerializedName("data")
    @Expose
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name ="data")
    @NonNull

    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
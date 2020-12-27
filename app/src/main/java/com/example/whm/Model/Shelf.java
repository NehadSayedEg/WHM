package com.example.whm.Model;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "shelf_table")

public class Shelf {
    @ColumnInfo(name = "shelf_id")
    @SerializedName("shelf_id")
    @Expose
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private String shelfId;


    @ForeignKey
            (entity = Store.class,
                    parentColumns = "store_id",
                    childColumns = "shelf_id")

    @ColumnInfo(name = "shelf_name_en")
    @SerializedName("shelf_name_en")
    @Expose
    private String shelfNameEn;

    @ColumnInfo(name = "shelf_name_ar")
    @SerializedName("shelf_name_ar")
    @Expose
    private String shelfNameAr;


    @ColumnInfo(name = "store_id")
    @SerializedName("store_id")
    @Expose
    private String storeId;

    @ColumnInfo(name = "created_by")
    @SerializedName("created_by")
    @Expose
    private String createdBy;

    @ColumnInfo(name = "created_date")
    @SerializedName("created_date")
    @Expose
    private String createdDate;



    @ColumnInfo(name = "sync_status")
    @SerializedName("sync_status")
    @Expose
    private String syncStatus;


    @ColumnInfo(name = "sync_update_status")
    @SerializedName("sync_update_status")
    @Expose
    private String syncUpdateStatus;


    public Shelf() {
    }

    public Shelf(@NonNull String shelfId, String shelfNameEn,
                 String shelfNameAr, String storeId, String createdBy,
                 String createdDate, String syncStatus, String syncUpdateStatus) {
        this.shelfId = shelfId;
        this.shelfNameEn = shelfNameEn;
        this.shelfNameAr = shelfNameAr;
        this.storeId = storeId;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.syncStatus = syncStatus;
        this.syncUpdateStatus = syncUpdateStatus;
    }

    @NonNull
    public String getShelfId() {
        return shelfId;
    }

    public void setShelfId(@NonNull long shelfId) {
        this.shelfId = shelfId;
    }

    public String getShelfNameEn() {
        return shelfNameEn;
    }

    public void setShelfNameEn(String shelfNameEn) {
        this.shelfNameEn = shelfNameEn;
    }

    public String getShelfNameAr() {
        return shelfNameAr;
    }

    public void setShelfNameAr(String shelfNameAr) {
        this.shelfNameAr = shelfNameAr;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public String getSyncUpdateStatus() {
        return syncUpdateStatus;
    }

    public void setSyncUpdateStatus(String syncUpdateStatus) {
        this.syncUpdateStatus = syncUpdateStatus;
    }
}
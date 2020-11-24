package com.example.whm.Model;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "stores_table")
public class Stores {

    @PrimaryKey(autoGenerate = false)
    @SerializedName("store_id")
    @ColumnInfo(name ="store_id")
    @Expose
    private int storeId;


    @SerializedName("store_name_en")
    @ColumnInfo(name ="store_name_en")
    @Expose
    private String storeNameEn;


    @SerializedName("store_name_ar")
    @ColumnInfo(name ="store_name_ar")
    @Expose
    private String storeNameAr;

    @SerializedName("store_type_id")
    @ColumnInfo(name ="store_type_id")
    @Expose
    private int storeTypeId;


//    @SerializedName("store_location")
//    @ColumnInfo(name ="store_location")
//    @Expose
//    private String storeLocation;
//
//
//    @SerializedName("store_gps_location")
//    @ColumnInfo(name ="store_gps_location")
//    @Expose
//    private String storeGpsLocation;
//
//
//    @SerializedName("created_by")
//    @ColumnInfo(name ="created_by")
//    @Expose
//    private String createdBy;
//
//    @SerializedName("created_date")
//    @ColumnInfo(name ="created_date")
//    @Expose
//    private String createdDate;
//
//    @SerializedName("sync_status")
//    @ColumnInfo(name ="sync_status")
//    @Expose
//    private String syncStatus;
//
//    @SerializedName("sync_update_status")
//    @ColumnInfo(name ="sync_update_status")
//    @Expose
   // private String syncUpdateStatus;


    public Stores(int storeId, String storeNameEn, String storeNameAr, int storeTypeId) {
        this.storeId = storeId;
        this.storeNameEn = storeNameEn;
        this.storeNameAr = storeNameAr;
        this.storeTypeId = storeTypeId;
    }

    public Stores() {
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreNameEn() {
        return storeNameEn;
    }

    public void setStoreNameEn(String storeNameEn) {
        this.storeNameEn = storeNameEn;
    }

    public String getStoreNameAr() {
        return storeNameAr;
    }

    public void setStoreNameAr(String storeNameAr) {
        this.storeNameAr = storeNameAr;
    }

    public int getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(int storeTypeId) {
        this.storeTypeId = storeTypeId;
    }
}
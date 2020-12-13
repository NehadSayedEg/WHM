package com.example.whm.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "store_table")
public class Store {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name ="store_id")
    @SerializedName("store_id")
    @Expose
    @NonNull
    private String storeId;

    @ColumnInfo(name ="store_name_en")
    @SerializedName("store_name_en")
    @Expose
    private String storeNameEn;

    @ColumnInfo(name ="store_name_ar")
    @SerializedName("store_name_ar")
    @Expose
    private String storeNameAr;

    @ColumnInfo(name ="store_type_id")
    @SerializedName("store_type_id")
    @Expose
    private String storeTypeId;

    @ColumnInfo(name ="store_location")
    @SerializedName("store_location")
    @Expose
    private String storeLocation;

    @ColumnInfo(name ="store_gps_location")
    @SerializedName("store_gps_location")
    @Expose
    private String storeGpsLocation;

    @ColumnInfo(name ="created_by")
    @SerializedName("created_by")
    @Expose
    private String createdBy;

    @ColumnInfo(name ="created_date")
    @SerializedName("created_date")
    @Expose
    private String createdDate;

    @ColumnInfo(name ="sync_status")
    @SerializedName("sync_status")
    @Expose
    private String syncStatus;

    @ColumnInfo(name ="sync_update_status")
    @SerializedName("sync_update_status")
    @Expose
    private String syncUpdateStatus;


    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
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

    public String getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(String storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getStoreGpsLocation() {
        return storeGpsLocation;
    }

    public void setStoreGpsLocation(String storeGpsLocation) {
        this.storeGpsLocation = storeGpsLocation;
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

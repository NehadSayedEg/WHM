package com.example.whm.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "store_type_table")
public class StoreType {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name ="store_type_id")
    @SerializedName("store_type_id")
    @Expose
    @NonNull
    private String storeTypeId;

    @ColumnInfo(name ="store_name_en")
    @SerializedName("store_name_en")
    @Expose
    private String storeNameEn;


    @ColumnInfo(name ="store_name_ar")
    @SerializedName("store_name_ar")
    @Expose
    private String storeNameAr;

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

    public StoreType() {
    }

    public StoreType(@NonNull String storeTypeId, String storeNameEn, String storeNameAr,
                     String createdBy, String createdDate, String syncStatus, String syncUpdateStatus) {
        this.storeTypeId = storeTypeId;
        this.storeNameEn = storeNameEn;
        this.storeNameAr = storeNameAr;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.syncStatus = syncStatus;
        this.syncUpdateStatus = syncUpdateStatus;
    }

    @NonNull
    public String getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(@NonNull String storeTypeId) {
        this.storeTypeId = storeTypeId;
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



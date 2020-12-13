package com.example.whm.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "item_table")
public class Item {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name ="item_id")
    @SerializedName("item_id")
    @Expose
    @NonNull
    private String itemId;

    @ColumnInfo(name ="item_name_en")
    @SerializedName("item_name_en")
    @Expose
    private String itemNameEn;

    @ColumnInfo(name ="item_name_ar")
    @SerializedName("item_name_ar")
    @Expose
    private String itemNameAr;

    @ColumnInfo(name ="item_type_id")
    @SerializedName("item_type_id")
    @Expose
    private String itemTypeId;

    @ColumnInfo(name ="item_category")
    @SerializedName("item_category")
    @Expose
    private String itemCategory;

    @ColumnInfo(name ="item_class")
    @SerializedName("item_class")
    @Expose
    private String itemClass;


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


    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemNameEn() {
        return itemNameEn;
    }

    public void setItemNameEn(String itemNameEn) {
        this.itemNameEn = itemNameEn;
    }

    public String getItemNameAr() {
        return itemNameAr;
    }

    public void setItemNameAr(String itemNameAr) {
        this.itemNameAr = itemNameAr;
    }

    public String getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(String itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
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
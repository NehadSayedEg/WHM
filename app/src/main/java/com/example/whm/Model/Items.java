package com.example.whm.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Items {

    @SerializedName("item_id")
    @Expose
    private String itemId;
    @SerializedName("item_name_en")
    @Expose
    private String itemNameEn;
    @SerializedName("item_name_ar")
    @Expose
    private String itemNameAr;
    @SerializedName("item_type_id")
    @Expose
    private String itemTypeId;
    @SerializedName("item_category")
    @Expose
    private String itemCategory;
    @SerializedName("item_class")
    @Expose
    private String itemClass;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("sync_status")
    @Expose
    private String syncStatus;
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
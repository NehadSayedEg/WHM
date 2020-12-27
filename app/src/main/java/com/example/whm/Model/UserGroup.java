package com.example.whm.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "user_group_table")
    public class UserGroup {

        @PrimaryKey(autoGenerate = false)
        @ColumnInfo(name ="user_group_id")
        @SerializedName("user_group_id")
        @Expose
        @NonNull
        private String userGroupId;

    @ColumnInfo(name ="user_group_name_en")
    @SerializedName("user_group_name_en")
    @Expose
    private String userGroupNameEn;

    @ColumnInfo(name ="user_group_name_ar")
    @SerializedName("user_group_name_ar")
    @Expose
    private String userGroupNameAr;

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
    private String sync_update_status;


    public UserGroup() {
    }

    public UserGroup(@NonNull String userGroupId, String userGroupNameEn, String userGroupNameAr,
                     String createdBy, String createdDate, String syncStatus, String sync_update_status) {
        this.userGroupId = userGroupId;
        this.userGroupNameEn = userGroupNameEn;
        this.userGroupNameAr = userGroupNameAr;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.syncStatus = syncStatus;
        this.sync_update_status = sync_update_status;
    }

    @NonNull
    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(@NonNull String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getUserGroupNameEn() {
        return userGroupNameEn;
    }

    public void setUserGroupNameEn(String userGroupNameEn) {
        this.userGroupNameEn = userGroupNameEn;
    }

    public String getUserGroupNameAr() {
        return userGroupNameAr;
    }

    public void setUserGroupNameAr(String userGroupNameAr) {
        this.userGroupNameAr = userGroupNameAr;
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

    public String getSync_update_status() {
        return sync_update_status;
    }

    public void setSync_update_status(String sync_update_status) {
        this.sync_update_status = sync_update_status;
    }
}


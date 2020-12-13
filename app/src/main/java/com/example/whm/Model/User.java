package com.example.whm.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "user_table")
public class User {
    @ColumnInfo(name ="user_id")
    @SerializedName("user_id")
    @Expose
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private String userId;

    @ColumnInfo(name ="user_name_en")
    @SerializedName("user_name_en")
    @Expose
    private String userNameEn;


    @ColumnInfo(name ="user_name_ar")
    @SerializedName("user_name_ar")
    @Expose
    private String userNameAr;

    @ColumnInfo(name ="user_password")
    @SerializedName("user_password")
    @Expose
    private String userPassword;

    @ColumnInfo(name ="user_group_id")
    @SerializedName("user_group_id")
    @Expose
    private String userGroupId;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNameEn() {
        return userNameEn;
    }

    public void setUserNameEn(String userNameEn) {
        this.userNameEn = userNameEn;
    }

    public String getUserNameAr() {
        return userNameAr;
    }

    public void setUserNameAr(String userNameAr) {
        this.userNameAr = userNameAr;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
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

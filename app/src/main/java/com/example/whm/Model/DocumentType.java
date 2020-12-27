package com.example.whm.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "document_types_table")
    public class DocumentType {
        @ColumnInfo(name = "document_type_id")
        @SerializedName("document_type_id")
        @Expose
        @PrimaryKey(autoGenerate = false)
        @NonNull
        private String documentTypeId;


    @ColumnInfo(name = "document_type_name_en")
    @SerializedName("document_type_name_en")
    @Expose
    private String documentTypeNameEn;



    @ColumnInfo(name = "document_type_name_ar")
    @SerializedName("document_type_name_ar")
    @Expose
    private String documentTypeNameAr;


    @ColumnInfo(name = "document_subtype_name_en")
    @SerializedName("document_subtype_name_en")
    @Expose
    private String documentSubtypeNameEn;

    @ColumnInfo(name = "document_subtype_name_ar")
    @SerializedName("document_subtype_name_ar")
    @Expose
    private String documentSubtypeNameAr;


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


    public DocumentType() {

    }

    public DocumentType(@NonNull String documentTypeId, String documentTypeNameEn, String documentTypeNameAr, String documentSubtypeNameEn,
                        String documentSubtypeNameAr, String createdBy, String createdDate, String syncStatus, String syncUpdateStatus) {
        this.documentTypeId = documentTypeId;
        this.documentTypeNameEn = documentTypeNameEn;
        this.documentTypeNameAr = documentTypeNameAr;
        this.documentSubtypeNameEn = documentSubtypeNameEn;
        this.documentSubtypeNameAr = documentSubtypeNameAr;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.syncStatus = syncStatus;
        this.syncUpdateStatus = syncUpdateStatus;
    }

    @NonNull
    public String getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(@NonNull String documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public String getDocumentTypeNameEn() {
        return documentTypeNameEn;
    }

    public void setDocumentTypeNameEn(String documentTypeNameEn) {
        this.documentTypeNameEn = documentTypeNameEn;
    }

    public String getDocumentTypeNameAr() {
        return documentTypeNameAr;
    }

    public void setDocumentTypeNameAr(String documentTypeNameAr) {
        this.documentTypeNameAr = documentTypeNameAr;
    }

    public String getDocumentSubtypeNameEn() {
        return documentSubtypeNameEn;
    }

    public void setDocumentSubtypeNameEn(String documentSubtypeNameEn) {
        this.documentSubtypeNameEn = documentSubtypeNameEn;
    }

    public String getDocumentSubtypeNameAr() {
        return documentSubtypeNameAr;
    }

    public void setDocumentSubtypeNameAr(String documentSubtypeNameAr) {
        this.documentSubtypeNameAr = documentSubtypeNameAr;
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



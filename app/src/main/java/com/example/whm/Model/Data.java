package com.example.whm.Model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

import com.example.whm.Database.Converters;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
@Entity(tableName = "data_table")

public class Data {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="id")
    private  int id;

    @ColumnInfo(name ="Users")
    @SerializedName("Users")
    @Expose

   private List<User>  users  = null;

    @ColumnInfo(name ="Items" )
    @SerializedName("Items")
    @Expose
    private List<Item> items = null;

    @ColumnInfo(name ="Stores")
    @SerializedName("Stores")
    @Expose
    private List<Store> stores = null;


    @ColumnInfo(name ="Shelfs")
    @SerializedName("Shelfs")
    @Expose
    private List<Shelf> shelfs = null;


    @ColumnInfo(name ="store_types")
    @SerializedName("store_types")
    @Expose
    private List<StoreType> storeTypes = null;


    @ColumnInfo(name ="user_group")
    @SerializedName("user_group")
    @Expose
    private List<UserGroup> userGroupList = null;

    @ColumnInfo(name ="document_types")
    @SerializedName("document_types")
    @Expose
    private List<DocumentType> documentTypeList = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public List<Shelf> getShelfs() {
        return shelfs;
    }

    public void setShelfs(List<Shelf> shelfs) {
        this.shelfs = shelfs;
    }

    public List<StoreType> getStoreTypes() {
        return storeTypes;
    }

    public void setStoreTypes(List<StoreType> storeTypes) {
        this.storeTypes = storeTypes;
    }

    public List<UserGroup> getUserGroupList() {
        return userGroupList;
    }

    public void setUserGroupList(List<UserGroup> userGroupList) {
        this.userGroupList = userGroupList;
    }

    public List<DocumentType> getDocumentTypeList() {
        return documentTypeList;
    }

    public void setDocumentTypeList(List<DocumentType> documentTypeList) {
        this.documentTypeList = documentTypeList;
    }
}

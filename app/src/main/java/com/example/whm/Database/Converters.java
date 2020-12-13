package com.example.whm.Database;

import androidx.room.TypeConverter;

import com.example.whm.Model.Data;
import com.example.whm.Model.Item;
import com.example.whm.Model.Store;
import com.example.whm.Model.User;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.List;

public class Converters {

    @TypeConverter
    public String fromDataToString( Data data){
        return new Gson().toJson(data);

    }

    @TypeConverter
    public Data  fromStringToData (String stringData){
        return new Gson().fromJson(stringData , Data.class);

    }
   @TypeConverter
    public String fromUserToString( List<User> user){
        return new Gson().toJson(user);

    }

    @TypeConverter
    public List<User>  fromStringToUser (String stringUser){
        return new Gson().fromJson(stringUser , (Type) User.class);

    }


    @TypeConverter
    public String fromItemToString( List<Item> items){
        return new Gson().toJson(items);

    }

//    @TypeConverter
//    public Item fromStringToItem (String stringItem){
//        return new Gson().fromJson(stringItem , Item.class);
//
//    }


    @TypeConverter
    public List<Item>  fromStringToItem (String stringItem){
        return (List<Item>) new Gson().fromJson(stringItem ,Item.class );

    }

    @TypeConverter
    public String fromStoreToString( List<Store> user){
        return new Gson().toJson(user);

    }

    @TypeConverter
    public List<Store>  fromStringToStore (String stringStore){
        return (List<Store>) new Gson().fromJson(stringStore ,Store.class );

    }
}

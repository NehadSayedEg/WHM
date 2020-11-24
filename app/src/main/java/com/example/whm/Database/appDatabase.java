package com.example.whm.Database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.whm.Database.Dao.StoresDao;
import com.example.whm.Model.Stores;


@Database( entities ={Stores.class} , version = 1)
public  abstract  class appDatabase extends RoomDatabase {

    public static final String  Database_Name= "WHMDatabase";
     public  abstract  StoresDao storesDao();

     private static volatile appDatabase INSTANCE ;

     public  static appDatabase getINSTANCE(Context context){
         if(INSTANCE == null){
             synchronized (appDatabase.class){
                 if(INSTANCE == null){
                     INSTANCE = Room.databaseBuilder(context ,appDatabase.class, Database_Name)
                             .addCallback(callback)
                             .fallbackToDestructiveMigration()
                             .build();

                 }
             }
         }
         return INSTANCE ;

     }

     static  Callback callback = new Callback() {
         @Override
         public void onCreate(@NonNull SupportSQLiteDatabase db) {
             super.onCreate(db);
             new PopulateAsyncTask(INSTANCE);

         }
     };
     static class PopulateAsyncTask extends AsyncTask<Void ,Void,Void>{
           private  StoresDao storesDao ;
         PopulateAsyncTask(appDatabase appDatabase){
                   storesDao = appDatabase.storesDao();

         }
         @Override
         protected Void doInBackground(Void... voids) {
             storesDao.deleteAllStores();
             return null;
         }
     }


}

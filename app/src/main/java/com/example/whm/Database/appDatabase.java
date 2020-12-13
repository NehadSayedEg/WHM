package com.example.whm.Database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.bumptech.glide.load.model.ByteArrayLoader;
import com.example.whm.Database.Dao.AllDataDao;
import com.example.whm.Database.Dao.DataDao;
import com.example.whm.Database.Dao.ItemDao;
import com.example.whm.Database.Dao.StoreDao;
import com.example.whm.Database.Dao.StoresDao;
import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Model.AllData;
import com.example.whm.Model.Data;
import com.example.whm.Model.Item;
import com.example.whm.Model.Store;
import com.example.whm.Model.User;


@Database( entities ={User.class , Data.class , Item.class , Store.class , AllData.class} , version = 4 )
@TypeConverters(Converters.class)
public  abstract  class appDatabase extends RoomDatabase {

    public static final String  Database_Name= "WHMDatabase";
    public  abstract  DataDao dataDao();
    public  abstract ItemDao itemDao();
    public  abstract StoreDao storeDao();
    public  abstract UserDao userDao();
    public  abstract AllDataDao allDataDao();






    // public  abstract  StoresDao storesDao();

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

//    public abstract DataDao dataDao();

    static class PopulateAsyncTask extends AsyncTask<Void ,Void,Void>{
        private AllDataDao allDataDao ;
        private DataDao dataDao ;
        private UserDao userDao  ;
        private ItemDao itemDao  ;
        private StoreDao storeDao  ;


        PopulateAsyncTask(appDatabase appDatabase){
            allDataDao  = appDatabase.allDataDao();
             dataDao =appDatabase.dataDao();
            itemDao  =appDatabase.itemDao();
            userDao =appDatabase.userDao();
            storeDao= appDatabase.storeDao();



         }
         @Override
         protected Void doInBackground(Void... voids) {
             dataDao.deleteAllStores();
             return null;
         }
     }


}

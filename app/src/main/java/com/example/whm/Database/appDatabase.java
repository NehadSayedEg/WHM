package com.example.whm.Database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.whm.Database.Dao.DocumentTypeDao;
import com.example.whm.Database.Dao.ItemDao;
import com.example.whm.Database.Dao.ShelfDao;
import com.example.whm.Database.Dao.StoreDao;
import com.example.whm.Database.Dao.StoretypeDao;
import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Dao.UserGroupDao;
import com.example.whm.Model.AllData;
import com.example.whm.Model.Data;
import com.example.whm.Model.DocumentType;
import com.example.whm.Model.Item;
import com.example.whm.Model.Shelf;
import com.example.whm.Model.Store;
import com.example.whm.Model.StoreType;
import com.example.whm.Model.User;
import com.example.whm.Model.UserGroup;


@Database( entities ={User.class , Data.class , Item.class , Store.class , AllData.class ,
        DocumentType.class , Shelf.class  , StoreType.class , UserGroup.class} , version = 5 )
@TypeConverters(Converters.class)
public  abstract  class appDatabase extends RoomDatabase {

    public static final String  Database_Name= "WHMDatabase";
    public  abstract ItemDao itemDao();
    public  abstract StoreDao storeDao();
    public  abstract UserDao userDao();
    public  abstract StoretypeDao storetypeDao();
    public  abstract UserGroupDao userGroupDao();
    public  abstract ShelfDao shelfDao();
    public  abstract DocumentTypeDao documentTypeDao();



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
        private UserDao userDao  ;
        private ItemDao itemDao  ;
        private StoreDao storeDao  ;
        private ShelfDao shelfDao  ;
        private StoretypeDao storetypeDao  ;
        private DocumentTypeDao documentTypeDao  ;
        private UserGroupDao userGroupDao  ;






        PopulateAsyncTask(appDatabase appDatabase){
            itemDao  =appDatabase.itemDao();
            userDao =appDatabase.userDao();
            storeDao= appDatabase.storeDao();
            shelfDao = appDatabase.shelfDao();
            userGroupDao = appDatabase.userGroupDao();
            documentTypeDao = appDatabase.documentTypeDao();
            storetypeDao = appDatabase.storetypeDao();

         }

         @Override
         protected Void doInBackground(Void... voids) {
             itemDao.deleteAllItems();
             userDao.deleteAllUsers();
             storeDao.deleteAllStores();
             storetypeDao.deleteAllStoreType();
             shelfDao.deleteAllShelf();
             documentTypeDao.deleteAllDocumentType();
             userGroupDao.deleteAllUserGroup();
             return null;
         }
     }


}

package com.example.whm.Database.Repository;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.lifecycle.LiveData;

import com.example.whm.Database.Dao.AllDataDao;
import com.example.whm.Database.Dao.DataDao;
import com.example.whm.Database.Dao.ItemDao;
import com.example.whm.Database.Dao.StoreDao;
import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.appDatabase;
import com.example.whm.Model.AllData;
import com.example.whm.Model.Data;
import com.example.whm.Model.Item;
import com.example.whm.Model.Store;
import com.example.whm.Model.User;

import java.util.List;

public class DataRepository {

    private appDatabase database ;
    private LiveData<List<User>> getAllUser;
    private LiveData<List<Item>> getAllitems;
    private LiveData<List<Store>> getAllStores;


    private final UserDao userDao;
    private static DataRepository  instance;
    private LiveData<User> userAccountLiveData;


//    public DataRepository(Application application){
//        database = appDatabase.getINSTANCE(application);
//        getAllUser = database.userDao().getAllUsers();
//        getAllitems = database.itemDao().getAllitems();
//        getAllStores = database.storeDao().getAllStores();
//
//    }


    public DataRepository(Application application, UserDao userDao){
        database = appDatabase.getINSTANCE(application);
        this.userDao = userDao;
        getAllUser = database.userDao().getAllUsers();
        getAllitems = database.itemDao().getAllitems();
        getAllStores = database.storeDao().getAllStores();

    }


    public boolean isValidAccount(String username, final String password)
    {
        User user = userDao.getAccount(username);
        return user.getUserPassword().equals(password);
    }

    public   void insertUsers(List<User> userList){
        new InsertUserAsyncTask(database).execute(userList);
    }

    public   void insertItem(List<Item> itemList){
        new InsertItemAsyncTask(database).execute(itemList);
    }


    public   void insertStore(List<Store> storeList){
        new InsertStoreAsyncTask(database).execute(storeList);
    }


    public LiveData<List<User>> getGetAllUser(){
        return  getAllUser ;
    }


    public LiveData<List<Item>> getGetAllitem(){
        return  getAllitems ;
    }

    public LiveData<List<Store>> getGetAllstore(){
        return  getAllStores ;
    }



    static  class InsertUserAsyncTask extends AsyncTask<List<User> , Void , Void > {
        private UserDao userDao ;

        InsertUserAsyncTask( appDatabase appDatabase) {
            userDao = appDatabase.userDao();
        }

        @Override
        protected Void doInBackground(List<User>... lists) {
            userDao.insert(lists[0]);
            userDao.getAllUsers();
            int ids=userDao.insertUser(lists[0]).length ;
            Log.e("data repo", ids + "user length");
            return null;
        }
    }

    static  class InsertItemAsyncTask extends AsyncTask<List<Item> , Void , Void > {
        private ItemDao itemDao ;

        InsertItemAsyncTask( appDatabase appDatabase) {
            itemDao = appDatabase.itemDao();
        }

        @Override
        protected Void doInBackground(List<Item>... lists) {
            itemDao.insertItem(lists[0]);
//            int ids=itemDao.insertItem(lists[0]).length ;
//            Log.e("data repo", ids + "items length");
            return null;
        }
    }

    static  class InsertStoreAsyncTask extends AsyncTask<List<Store> , Void , Void > {
        private StoreDao storeDao ;

        InsertStoreAsyncTask( appDatabase appDatabase) {
            storeDao = appDatabase.storeDao();
        }

        @Override
        protected Void doInBackground(List<Store>... lists) {
            storeDao.insert(lists[0]);
            return null;
        }
    }




}

package com.example.whm.Database.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.whm.Database.Dao.AllDataDao;
import com.example.whm.Database.Dao.DataDao;
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
    private LiveData<List<Data>> getAllData;
//    private LiveData<List<User>> getAllUser;
//    private LiveData<List<Item>> getAllitems;
//    private LiveData<List<Store>> getAllStores;

    private LiveData<AllData> getData;






    public DataRepository(Application application){
        database = appDatabase.getINSTANCE(application);
        getData = database.allDataDao().getAll();
        getAllData = database.dataDao().getAllData();
//        getAllUser = database.userDao().getAllUsers();
//        getAllitems = database.itemDao().getAllitems();
//        getAllStores = database.storeDao().getAllStores();

    }

    public   void insert(Data dataList){
        new InsertAsyncTask(database).execute(dataList);

    }

    public   void insertAllData(AllData allData){
        new InsertAllAsyncTask(database).execute(allData);

    }




    public LiveData<List<Data>> getGetAllData(){
        return  getAllData ;
        //  return getGetAllStores();

    }

//    public LiveData<List<User>> getGetAllUser(){
//        return  getAllUser ;
//
//    }
//
//    public LiveData<List<Item>> getGetAllitems(){
//        return  getAllitems ;
//
//    }
//
//    public LiveData<List<Store>> getGetAllStores(){
//        return  getAllStores ;
//
//    }

    static  class InsertAsyncTask extends AsyncTask<Data , Void , Void > {
        private DataDao dataDao ;




        InsertAsyncTask( appDatabase appDatabase) {
            dataDao = appDatabase.dataDao();

        }

        @Override
        protected Void doInBackground(Data... lists) {
            dataDao.insert(lists[0]);
            return null;
        }
    }


    static  class InsertAllAsyncTask extends AsyncTask< AllData, Void , Void > {
        private AllDataDao allDataDao  ;



        InsertAllAsyncTask(appDatabase appDatabase) {
            allDataDao = appDatabase.allDataDao();




        }

        @Override
        protected Void doInBackground(AllData... lists) {
            allDataDao.insertAllData(lists[0]);
            return null;
        }
    }
}

package com.example.whm.Database.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.whm.Database.Dao.StoreDao;
import com.example.whm.Database.Dao.StoresDao;
import com.example.whm.Database.appDatabase;
import com.example.whm.Model.Store;
import com.example.whm.Model.Users;

import java.util.List;

public class StoresRepository {
    private appDatabase  database ;
    private LiveData<List<Store>> getAllStores;

    public StoresRepository(Application application){
        database = appDatabase.getINSTANCE(application);
        getAllStores = database.storeDao().getAllStores();
    }

   public   void insert(List<Store> storesList){
         new InsertAsyncTask(database).execute(storesList);

    }

   public LiveData<List<Store>> getGetAllStores(){
       return  getAllStores ;
      //  return getGetAllStores();

    }
    static  class InsertAsyncTask extends AsyncTask<List<Store> , Void , Void > {
        private StoreDao storeDao ;
        InsertAsyncTask( appDatabase appDatabase) {
            storeDao = appDatabase.storeDao();

        }

        @Override
        protected Void doInBackground(List<Store>... lists) {
            storeDao.insert(lists[0]);
            return null;
        }
    }
}

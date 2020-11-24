package com.example.whm.Database.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.whm.Database.Dao.StoresDao;
import com.example.whm.Database.appDatabase;
import com.example.whm.Model.Stores;

import java.util.List;

public class StoresRepository {
    private appDatabase  database ;
    private LiveData<List<Stores>> getAllStores;

    public StoresRepository(Application application){
        database = appDatabase.getINSTANCE(application);
        getAllStores = database.storesDao().getAllStores();
    }

   public   void insert(List<Stores> storesList){
         new InsertAsyncTask(database).execute(storesList);

    }

   public LiveData<List<Stores>> getGetAllStores(){
       return  getAllStores ;
      //  return getGetAllStores();

    }
    static  class InsertAsyncTask extends AsyncTask<List<Stores> , Void , Void > {
        private StoresDao storesDao ;
        InsertAsyncTask( appDatabase appDatabase) {
            storesDao = appDatabase.storesDao();

        }

        @Override
        protected Void doInBackground(List<Stores>... lists) {
            storesDao.insert(lists[0]);
            return null;
        }
    }
}

package com.example.whm.UI.StoresActivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.whm.Database.Dao.StoreDao;
import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Database.Repository.StoresRepository;
import com.example.whm.Database.appDatabase;
import com.example.whm.Model.Store;
import com.example.whm.Model.Users;
import com.example.whm.UI.LoginActivity.LoginViewModel;

import java.util.List;

public class StoresViewModel1 extends AndroidViewModel {
    private DataRepository dataRepository ;
    private LiveData<List<Store>> getAllStores ;
    private StoreDao storeDao ;
    private appDatabase appDatabase ;



    public StoresViewModel1(@NonNull Application application ,UserDao userDao) {
        super(application);

        dataRepository = new DataRepository(application ,  userDao);
        getAllStores = dataRepository.getGetAllstore();

    }

    public LiveData<List<Store>>getAllStores(){
        return getAllStores;

    }
    public static class Factory implements ViewModelProvider.Factory {
        Application application;
        UserDao userDao;

        public Factory( Application application, UserDao userDao) {
            this.application = application;
            this.userDao = userDao;
        }


        @NonNull
        @Override
        public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
            return ((T) new StoresViewModel1(application, userDao));
        }


    }
}

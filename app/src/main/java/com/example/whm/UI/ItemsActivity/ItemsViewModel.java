package com.example.whm.UI.ItemsActivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.whm.Database.Dao.ItemDao;
import com.example.whm.Database.Dao.StoreDao;
import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Database.appDatabase;
import com.example.whm.Model.Item;
import com.example.whm.Model.Store;
import com.example.whm.UI.LoginActivity.LoginViewModel;

import java.util.List;


public class ItemsViewModel extends AndroidViewModel {
    private DataRepository dataRepository ;
     LiveData<List<Item>> getAllItems ;
    private ItemDao itemDao ;
    private appDatabase appDatabase ;



    public ItemsViewModel(@NonNull Application application , UserDao userDao) {
        super(application);

        dataRepository = new DataRepository(application ,  userDao);
        getAllItems = dataRepository.getGetAllitem();

    }


    public LiveData<List<Item>>getAllItems(){
        return getAllItems;

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
            return ((T) new ItemsViewModel(application, userDao));
        }


    }
}
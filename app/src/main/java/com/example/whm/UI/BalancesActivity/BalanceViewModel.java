package com.example.whm.UI.BalancesActivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.whm.Database.Dao.ItemDao;
import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Database.appDatabase;
import com.example.whm.Model.Item;

import java.util.List;

public class BalanceViewModel extends AndroidViewModel {
    private DataRepository dataRepository ;
    LiveData<List<Item>> getAllItems ;
    private ItemDao itemDao ;
    private com.example.whm.Database.appDatabase appDatabase ;



    public BalanceViewModel(@NonNull Application application , UserDao userDao) {
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
            return ((T) new BalanceViewModel(application, userDao));
        }


    }
}
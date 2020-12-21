package com.example.whm.UI.ItemsActivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.whm.Database.Dao.StoreDao;
import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Database.appDatabase;
import com.example.whm.Model.Item;
import com.example.whm.Model.Store;

import java.util.List;


public class ItemsViewModel extends AndroidViewModel {
    private DataRepository dataRepository ;
     LiveData<List<Item>> getAllItems ;
    private StoreDao storeDao ;
    private appDatabase appDatabase ;



    public ItemsViewModel(@NonNull Application application , UserDao userDao) {
        super(application);

        dataRepository = new DataRepository(application ,  userDao);
        getAllItems = dataRepository.getGetAllitem();

    }


    public LiveData<List<Item>>getAllItems(){
        return getAllItems;

    }
}
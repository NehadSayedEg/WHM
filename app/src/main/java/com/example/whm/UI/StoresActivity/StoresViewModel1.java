package com.example.whm.UI.StoresActivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.whm.Database.Repository.StoresRepository;
import com.example.whm.Model.Store;
import com.example.whm.Model.Users;

import java.util.List;

public class StoresViewModel1 extends AndroidViewModel {
    private StoresRepository storesRepository ;
    private LiveData<List<Store>> getAllStores ;

    public StoresViewModel1(@NonNull Application application) {
        super(application);

        storesRepository = new StoresRepository(application);
        getAllStores = storesRepository.getGetAllStores();

    }

    public void insert(List<Store> storesList) {
        storesRepository.insert(storesList);
    }
    public LiveData<List<Store>>getAllStores(){
        return getAllStores;

    }
}

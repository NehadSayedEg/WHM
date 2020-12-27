package com.example.whm.UI.StockIssueActivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.whm.Database.Dao.StoreDao;
import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Model.Store;

public class StockIssueViewModel extends AndroidViewModel {

     DataRepository dataRepository;
     StoreDao storeDao ;
     

    public StockIssueViewModel(@NonNull Application application) {
        super(application);
    }
}

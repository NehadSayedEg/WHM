package com.example.whm.UI.LoginActivity;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.whm.Database.Dao.AllDataDao;
import com.example.whm.Database.Dao.ItemDao;
import com.example.whm.Database.Dao.StoreDao;
import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Database.Repository.StoresRepository;
import com.example.whm.Model.AllData;
import com.example.whm.Model.Data;
import com.example.whm.Model.Item;
import com.example.whm.Model.Store;
import com.example.whm.Model.StoreType;
import com.example.whm.Model.StoreWithShlefs;
import com.example.whm.Model.User;
import com.example.whm.Model.Users;
import com.example.whm.Network.Client;
import com.google.gson.Gson;

import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginViewModel  extends AndroidViewModel {
    DataRepository dataRepository;
    LiveData<List<User>> getAllUsers;

   //MutableLiveData<AllData> storesMutableLiveData = new MutableLiveData<>();
//    MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();

    public LoginViewModel(@NonNull Application application, UserDao userDao) {
        super(application);

        dataRepository = new DataRepository(application, userDao);
        getAllUsers = dataRepository.getGetAllUser();
    }

//    boolean checkValidLogin(String username, String password) {
//        return dataRepository.isValidAccount();
//    }
    public LiveData<Boolean>getUserLogin(){
         return dataRepository.getAllUser();
    }


public void insertStoresWithShelfs(StoreWithShlefs storeWithShlefs){
    dataRepository.insert(storeWithShlefs);
}

    public void getData() {
        Client.getINSTANCE().getAllData().enqueue(new Callback<AllData>() {
            @Override
            public void onResponse(Call<AllData> call, Response<AllData> response) {

                Log.e(" Hi From Response ", response.body().getData().getUsers().get(0).getUserNameAr().toString());
                Log.e(" Hi From Response ", response.body().getData().getShelfs().get(1).getShelfNameAr());



                dataRepository.insertUsers(response.body().getData().getUsers());
                dataRepository.insertItem(response.body().getData().getItems());
                dataRepository.insertStore(response.body().getData().getStores());
                dataRepository.insert(response.body().getData().getStores());

                //   Toast.makeText(getApplicationContext(),  " Hi From Response",  Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<AllData> call, Throwable t) {
                Log.e(" Login Activity ", " Failure--------" + t.toString());
            }
        });
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
            return ((T) new LoginViewModel(application, userDao));
        }


    }
}
//                if(response.isSuccessful()) {
//
//                    List<User> userLists = response.body().getData().getUsers();
//
//                    SharedPreferences sharedPref = getApplication().getSharedPreferences(
//                            "UsersPref", Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPref.edit();
//                    Gson gson = new Gson();
//                    String usersList = gson.toJson(response.body().getData().getUsers());
//                    editor.putString("users",usersList );
//
//                    String itemsList = gson.toJson(response.body().getData().getItems());
//                    editor.putString("items",itemsList );
//
//
//                    String storesList = gson.toJson(response.body().getData().getStores());
//                    editor.putString("stores",storesList );
//
//
//                    editor.apply();
//                }

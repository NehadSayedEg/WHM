package com.example.whm.UI.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Repository.DataRepository;
import com.example.whm.Database.appDatabase;
import com.example.whm.Model.AllData;
import com.example.whm.Model.User;
import com.example.whm.Model.Users;
import com.example.whm.UI.StoresActivity.StoresAdapter;
import com.example.whm.R;
import com.example.whm.UI.HomeActivity.HomeActivity;
import com.example.whm.UI.StoresActivity.StoresViewModel;

import java.util.ArrayList;
import java.util.List;


public class LoginActivity extends AppCompatActivity {
    EditText editTextUserName, editTextPassword;
    Button buttonLogin;
    TextView textViewRegister;
    DataRepository dataRepository ;
    UserDao userDao ;
    LoginViewModel loginViewModel ;
    private LiveData<List<User>> getAllUsers ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextUserName = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        textViewRegister = findViewById(R.id.textViewRegister);

        //loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        //  loginViewModel  = new ViewModelProvider(this).get(LoginViewModel.class);

        userDao = appDatabase.getINSTANCE(getApplication()).userDao();
        loginViewModel = new ViewModelProvider(this, new LoginViewModel.Factory(this.getApplication(), userDao)).get(LoginViewModel.class);


        loginViewModel.getData();
//        buttonLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
//
//            }
//        });
        loginViewModel.getUserLogin().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {

                buttonLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String username = editTextUserName.getText().toString();
                        String password = editTextPassword.getText().toString();
                        if(username.isEmpty() || password.isEmpty()){
                            Toast.makeText(getApplicationContext() , "Fill all the fields" , Toast.LENGTH_LONG).show();
                        }else {
                            startActivity(new Intent(LoginActivity.this, HomeActivity.class));

                        }


                    }
                });
            }
        });



    }


}



        //                String username = editTextUserName.getText().toString();
//                String password = editTextPassword.getText().toString();
//                if(username.isEmpty() || password.isEmpty()){
//                    Toast.makeText(getApplicationContext() , "Fill all the fields" , Toast.LENGTH_LONG).show();
//                }else {
//                startActivity(new Intent(LoginActivity.this, HomeActivity.class));


//                        boolean isValid = loginViewModel.checkValidLogin(editTextUserName.getText().toString(), editTextPassword.getText().toString());
//                        if (isValid) {
//                            Toast.makeText(getBaseContext(), "Successfully Logged In!", Toast.LENGTH_LONG).show();
//                            Log.i("Successful_Login", "Login was successful");
//                        } else {
//                            Toast.makeText(getBaseContext(), "Invalid Login!", Toast.LENGTH_SHORT).show();
//                            Log.i("Unsuccessful_Login", "Login was not successful");
//                        }








//        loginViewModel.storesMutableLiveData.observe(this, new Observer<AllData>() {
//            @Override
//            public void onChanged(AllData allData) {
//                Toast.makeText(LoginActivity.this, " Data reached", Toast.LENGTH_LONG).show();
//            }
//        });

//        buttonLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
//
//                String username = editTextUserName.getText().toString();
//                String password = editTextPassword.getText().toString();
//
//                if(username.isEmpty() || password.isEmpty()){
//                    Toast.makeText(getApplicationContext() , "Fill all the fields" , Toast.LENGTH_LONG).show();
//                }else {
//
//                    userDao.loginUser(username ,password );
//                      startActivity(new Intent(LoginActivity.this, HomeActivity.class));
//
//
//                }
//
//
//            }
//        });








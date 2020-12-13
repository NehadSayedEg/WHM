package com.example.whm.UI.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.whm.Database.Dao.UserDao;
import com.example.whm.Database.Repository.DataRepository;
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


        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        loginViewModel.getData();


        loginViewModel.storesMutableLiveData.observe(this, new Observer<AllData>() {
            @Override
            public void onChanged(AllData allData) {
                Toast.makeText(LoginActivity.this, " Data reached", Toast.LENGTH_LONG).show();
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUserName.getText().toString();
                String password = editTextPassword.getText().toString();

                if(username.isEmpty() || password.isEmpty()){
                    Toast.makeText(getApplicationContext() , "Fill all the fields" , Toast.LENGTH_LONG).show();
                }else {
                    userDao.loginUser(username ,password );
                      startActivity(new Intent(LoginActivity.this, HomeActivity.class));










                }


            }
        });
    }



//
//    public void to_home(View view) {
//
//        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
//    }

//    public static class BalancesActivity extends AppCompatActivity {
//        RecyclerView recyclerView2;
//
//        String s5[] ,s6[];
//        int images3[] = {R.drawable.items ,R.drawable.items  ,R.drawable.items};
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_balances);
//            recyclerView2 = findViewById(R.id.recyclerView2);
//
//            s5= getResources().getStringArray(R.array.Weights);
//            s6 = getResources().getStringArray(R.array.dates);
//
//          //  StoresAdapter myAdapter3 = new StoresAdapter(this,s5 ,s6, images3);
//          //  recyclerView2.setAdapter(myAdapter3);
//           // recyclerView2.setLayoutManager(new LinearLayoutManager(this ));
//        }
//    }
}
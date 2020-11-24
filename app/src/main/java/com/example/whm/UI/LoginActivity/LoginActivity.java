package com.example.whm.UI.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.whm.UI.StoresActivity.StoresAdapter;
import com.example.whm.R;
import com.example.whm.UI.HomeActivity.HomeActivity;


public class LoginActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;
    Button buttonLogin;
    TextView textViewRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        textViewRegister = findViewById(R.id.textViewRegister);
    }

    public void to_home(View view) {
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
    }

    public static class BalancesActivity extends AppCompatActivity {
        RecyclerView recyclerView2;

        String s5[] ,s6[];
        int images3[] = {R.drawable.items ,R.drawable.items  ,R.drawable.items};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_balances);
            recyclerView2 = findViewById(R.id.recyclerView2);

            s5= getResources().getStringArray(R.array.Weights);
            s6 = getResources().getStringArray(R.array.dates);

          //  StoresAdapter myAdapter3 = new StoresAdapter(this,s5 ,s6, images3);
          //  recyclerView2.setAdapter(myAdapter3);
           // recyclerView2.setLayoutManager(new LinearLayoutManager(this ));
        }
    }
}
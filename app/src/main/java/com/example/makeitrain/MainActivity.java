package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btnMTR;
    private Button showInfo;
    private TextView txtViewMoney;
    private int moneyCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMTR = findViewById(R.id.btnMTR);
        showInfo = findViewById(R.id.showInfo);
        txtViewMoney = findViewById(R.id.txtViewMoney);


    }

    public void addMoney(View view) {
        moneyCounter+=1000;
        txtViewMoney.setText(String.valueOf(moneyCounter));
    }


    public void showLog(View view) {
        //Toast.makeText(MainActivity.this,R.string.app_info,Toast.LENGTH_LONG).show();
        Snackbar.make(txtViewMoney,R.string.app_info,Snackbar.LENGTH_LONG).show();
    }
}
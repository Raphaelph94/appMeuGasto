package com.example.raphael.app_meugasto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //mudar para tela principal sem login
    public void Irtelaprincipal(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaPrincipal.class);
        startActivity(intent1);
    }

}

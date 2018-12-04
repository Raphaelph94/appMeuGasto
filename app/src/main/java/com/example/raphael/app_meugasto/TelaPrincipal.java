package com.example.raphael.app_meugasto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }
    //mudar para tela principal sem login
    public void IrparaCadgastos(View view){
        Intent intent2 = new Intent(getApplicationContext(), CadastroGasto.class);
        startActivity(intent2);
    }
}

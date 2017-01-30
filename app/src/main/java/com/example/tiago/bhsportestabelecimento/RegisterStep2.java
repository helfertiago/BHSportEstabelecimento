package com.example.tiago.bhsportestabelecimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tiago.bhsportestabelecimento.Classes.DataRegister;

public class RegisterStep2 extends AppCompatActivity {

    DataRegister dataRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step2);

        Intent intent = getIntent();
        dataRegister = intent.getParcelableExtra("dataRegister");

        if (intent != null){

        }
    }

    public void btnAnterior(View view){
        Intent intent = new Intent(this, RegisterStep1.class);
        intent.putExtra("dataRegister", dataRegister);
        startActivity(intent);
    }
}

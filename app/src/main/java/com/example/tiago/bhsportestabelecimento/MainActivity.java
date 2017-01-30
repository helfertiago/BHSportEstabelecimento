package com.example.tiago.bhsportestabelecimento;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    protected void btnRegistrar(View view)
    {
        Intent intent = new Intent(MainActivity.this, RegisterStep1.class);
        startActivity(intent);
    }
}

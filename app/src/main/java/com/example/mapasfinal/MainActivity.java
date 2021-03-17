package com.example.mapasfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText cajalati;
    EditText cajalongi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajalati=(EditText)findViewById(R.id.et_latitud);
        cajalongi=(EditText)findViewById((R.id.et_longitud));
    }

    public void irA(View view){

        Double latiD = Double.parseDouble(cajalongi.getText().toString());
        Double longiD= Double.parseDouble(cajalongi.getText().toString());

        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra("latitud",latiD);
        intent.putExtra("longitud",longiD);
        startActivity(intent);


    }

}
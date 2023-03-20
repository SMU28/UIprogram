package com.example.uiprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class secondInterface extends AppCompatActivity {

    private Button botonactividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_interface);

        botonactividad = (Button) findViewById(R.id.button5);

    }

    public void enviarnewactividad(View v){
        Intent intentUno = new Intent(this,thirdInterface.class);
        startActivity(intentUno);
    }


}
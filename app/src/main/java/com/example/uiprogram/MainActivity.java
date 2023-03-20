package com.example.uiprogram;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textoprueba;
    private Button botoncolor;
    private EditText textoentrada1;
    private Switch Switchbloqueo;
    private RadioGroup dimensionletra;
    private Button botonactividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoprueba = (TextView) findViewById(R.id.texto);
        botoncolor = (Button) findViewById(R.id.button2);
        botoncolor.setOnClickListener( this);
        textoentrada1 = (EditText) findViewById(R.id.editTexPersonName);
        textoentrada1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                textoprueba.setText(textoentrada1.getText());
            }
        });

        Switchbloqueo = (Switch) findViewById(R.id.switch1);
        Switchbloqueo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Switchbloqueo.isChecked()){
                    botoncolor.setEnabled(false);
                }else{
                    botoncolor.setEnabled(true);
                }
            }
        });

        dimensionletra = (RadioGroup) findViewById(R.id.dimensionletra);
        dimensionletra.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButtonnormal:
                        textoprueba.setTextSize(1,24);
                        break;
                    case R.id.radioButtonmediano:
                        textoprueba.setTextSize(1,35);
                        break;
                }
            }
        });
        botonactividad = (Button) findViewById(R.id.button3);
    }
    public void enviarnewactividad(View v){
        Intent intentUno = new Intent(this,secondInterface.class);
        startActivity(intentUno);
    }

    public void accionarBoton(View v){
        textoprueba.setTextSize(1,50);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button2:
                textoprueba.setTextColor(Color.parseColor("#80CBC4"));
                break;
        }
    }

}
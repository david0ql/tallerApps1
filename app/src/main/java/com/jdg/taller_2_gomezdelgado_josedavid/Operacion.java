package com.jdg.taller_2_gomezdelgado_josedavid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Operacion extends AppCompatActivity {
TextView namePlayer;
int cantidad = 0, count = 0;
boolean isFirstTime = true;
ArrayList <String> datosEvaluar = new ArrayList<>();
Jugadores[] players = new Jugadores[2];
String[] posibilidades = {"piedra", "papel", "tijera"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion);
        namePlayer = findViewById(R.id.namePlayer);
        Intent i = getIntent();
        cantidad = (int) i.getSerializableExtra("quantity");
        for (int it = 0; it < cantidad; it++){
            players[it] = (Jugadores) i.getSerializableExtra("playerData"+it);
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, posibilidades);
        Spinner adaptador =  findViewById(R.id.option);
        adaptador.setAdapter(dataAdapter);
        adaptador.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(getItemAtPosition(i);
                }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void recibirDato(String asd){
        if (datosEvaluar.size() < 2){
            datosEvaluar.add(asd);
            for (int i = 0; i < datosEvaluar.size(); i++){
                Log.d("whoami", datosEvaluar.get(i));
            }

        }else{
            ganadorAAA(datosEvaluar);
        }

    }

    public void ganadorAAA(ArrayList myArr){
        String posicion1 = myArr.get(1).toString();
        String posicion2 = myArr.get(2).toString();
        if (posicion1 == posicion2){

        }
    }

}
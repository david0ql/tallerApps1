package com.jdg.taller_2_gomezdelgado_josedavid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnEnviar, btnCerrar;
EditText nombreJugador;
int iter = 0;
Jugadores[] players = new Jugadores[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.enviarDatos);
        btnCerrar = findViewById(R.id.cerrarApp);
        nombreJugador = findViewById(R.id.nombreJugador);

        btnEnviar.setOnClickListener(view -> {
            players[iter] = new Jugadores(nombreJugador.getText().toString());
            nombreJugador.setText("");
            Toast.makeText(this, "Creado el usuario #"+iter, Toast.LENGTH_SHORT).show();
            iter++;
            if (iter > 1){
                Intent i = new Intent(MainActivity.this, Operacion.class);
                for (int it = 0; it< players.length; it++){
                    i.putExtra("playerData"+it,players[it]);
                }
                i.putExtra("quantity", players.length);
                startActivity(i);
            }
        });

        btnCerrar.setOnClickListener(view -> {
            System.exit(0);
        });

    }
}
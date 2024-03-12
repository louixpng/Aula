package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class TelaMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botoes();
    }

    private void botoes(){
        Button somar = (Button) findViewById(R.id.inc);
        Button subtrair = (Button) findViewById(R.id.dec);
        Button telefone = (Button) findViewById(R.id.telefone);
        Button alarm = (Button) findViewById(R.id.alarmButton);
        Button voltar = (Button) findViewById(R.id.backButton);
        Button perfil = (Button) findViewById(R.id.perfil);

        Intent i = new Intent(Intent.ACTION_DIAL);
        Intent i2 = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_DAYS, Calendar.SATURDAY)
                .putExtra(AlarmClock.EXTRA_HOUR, 20)
                .putExtra(AlarmClock.EXTRA_MINUTES, 30);
        Intent i3 = new Intent(this, TelaLogin.class);
        Intent i4 = new Intent(this, TelaPerfil.class);
        TextView texto = (TextView) findViewById(R.id.texto);

        telefone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.setData(Uri.parse("tel:1143252424"));
                startActivity(i);
            }
        });

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String s = texto.getText().toString();
               double result = Double.parseDouble(s);
               result++;
               texto.setText(String.valueOf(result));
            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = texto.getText().toString();
                double result = Double.parseDouble(s);
                result--;
                texto.setText(String.valueOf(result));
            }
        });

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i2);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i3);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i4);
            }
        });


    }
}
package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botoes();
    }

    private void botoes(){
        Button somar = (Button) findViewById(R.id.inc);
        Button subtrair = (Button) findViewById(R.id.dec);
        Button toast = (Button) findViewById(R.id.toast);

        TextView texto = (TextView) findViewById(R.id.texto);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Qual é o preço do medo abundante de todas as verdades?", Toast.LENGTH_LONG).show();
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
    }
}
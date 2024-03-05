package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TelaInicial extends AppCompatActivity {

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
        Intent i = new Intent(Intent.ACTION_DIAL);

        TextView texto = (TextView) findViewById(R.id.texto);

        toast.setOnClickListener(new View.OnClickListener() {
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
    }
}
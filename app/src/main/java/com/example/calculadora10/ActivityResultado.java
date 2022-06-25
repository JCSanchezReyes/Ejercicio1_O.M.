package com.example.calculadora10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculadora10.R;

public class ActivityResultado extends AppCompatActivity {

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = (TextView) findViewById(R.id.txtResultadoR);
        String resultados = getIntent().getStringExtra("resultado");
        resultado.setText(resultados);

        //System.out.println();

    }
}
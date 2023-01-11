package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAltura;
    EditText etPeso;
    Button btCalcular;
    TextView tvImc;
    TextView tvSituacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAltura = findViewById(R.id.etAltura);
        etPeso = findViewById(R.id.etPeso);
        btCalcular = findViewById(R.id.btCalcular);
        tvImc = findViewById(R.id.tvImc);
        tvSituacao = findViewById(R.id.tvSituacao);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double altura = Double.parseDouble(etAltura.getText().toString());
                double peso = Double.parseDouble(etPeso.getText().toString());

                double imc = calcularImc(peso, altura);
                String situacao = situacaoImc(imc);

                tvImc.setText("IMC: " + imc);
                tvSituacao.setText("Situação: " + situacao);
            }
        });

    }

    public double calcularImc( double peso, double altura ) {
        double imc = peso / Math.pow(altura,2);
        return imc;
    }

    public String situacaoImc ( double imc ) {
        String situacao;
        if ( imc < 18.5 ) {
            situacao = "Abaixo do peso";
        } else if ( imc < 25 ) {
            situacao = "Peso normal";
        } else if ( imc < 30 ) {
            situacao = "Sobrepeso";
        } else if ( imc < 35 ) {
            situacao = "Obesidade grau 1";
        } else if ( imc < 40 ) {
            situacao = "Obesidade grau 2";
        } else {
            situacao = "Obesidade grau 3";
        }
        return situacao;
    }
}
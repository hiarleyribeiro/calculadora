package br.com.igor.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CalculadoraActivity extends Activity {

        //Declarando as variaveis
    EditText valor1, valor2, resultado;
    Button bSoma, bSub, bMulti, bDiv;
    double v1, v2, result;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        //Objetos do xml
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        resultado = (EditText) findViewById(R.id.resultado);
        bSoma = (Button) findViewById(R.id.soma);
        bSub = (Button) findViewById(R.id.subtracao);
        bMulti = (Button) findViewById(R.id.multiplicacao);
        bDiv = (Button) findViewById(R.id.divisao);



        //acao dos botoes
        bSoma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v1 = Double.parseDouble(valor1.getText().toString());
                v2 = Double.parseDouble(valor2.getText().toString());
                result = v1+v2;
                resultado.setText(String.valueOf(result));
            }

        });

        bSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v1 = Double.parseDouble(valor1.getText().toString());
                v2 = Double.parseDouble(valor2.getText().toString());
                result = v1-v2;
                resultado.setText(String.valueOf(result));
            }

        });

        bMulti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v1 = Double.parseDouble(valor1.getText().toString());
                v2 = Double.parseDouble(valor2.getText().toString());
                result = v1*v2;
                resultado.setText(String.valueOf(result));
            }

        });


        bDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v1 = Double.parseDouble(valor1.getText().toString());
                v2 = Double.parseDouble(valor2.getText().toString());
                result = v1/v2;
                resultado.setText(String.valueOf(result));
            }

        });




    }




}


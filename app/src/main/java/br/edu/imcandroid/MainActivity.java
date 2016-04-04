package br.edu.imcandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calcularImc (View v){

        // ENTRADA
        double peso = Double.parseDouble(((EditText) findViewById(R.id.editTextPeso)).getText().toString());

        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        String altura_s = editTextAltura.getText().toString();
        double altura = Double.parseDouble(altura_s);

        // PROCESSAMENTO
        double imc = peso / (altura * altura);

        // SAIDA
        EditText editTextResultado = (EditText) findViewById(R.id.editTextResultado);
        editTextResultado.setText(imc+"");
    }

}


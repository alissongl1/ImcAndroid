package br.edu.imcandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextAltura;
    private EditText editTextPeso;
    private EditText editTextResultado;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        editTextResultado = (EditText) findViewById(R.id.editTextResultado);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void calcularImc (View v){
        // ENTRADA
        String s_altura = editTextAltura.getText().toString();
        String s_peso = editTextPeso.getText().toString();

        // CONVERSAO DE STRING PARA DOUBLE
        double altura = Double.parseDouble(s_altura);
        double peso = Double.parseDouble(s_peso);

        // PROCESSAMENTO
        double imc = peso / (altura * altura);

        String mensagem;
        if(imc < 18){
            mensagem = "Você está muito magro.";
            imageView.setImageResource(R.drawable.magro);
        }else if(imc >= 18 && imc <= 25){
            mensagem = "Você está sarado.";
            imageView.setImageResource(R.drawable.sarado);
        }else{
            mensagem = "Você está muito gordo.";
            imageView.setImageResource(R.drawable.gordo);
        }

        // SAIDA
        editTextResultado.setText(imc+"\n"+mensagem);
    }
}


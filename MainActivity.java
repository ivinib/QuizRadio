package com.example.aluno.quizprova;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //TODO declarando as variávies globais

    TextView resultado;
    Integer nota;
    Integer media;
    RadioButton Resp1a;
    RadioButton Resp1b;
    RadioButton Resp1c;

    RadioButton Resp2a;
    RadioButton Resp2b;
    RadioButton Resp2c;

    RadioButton Resp3a;
    RadioButton Resp3b;
    RadioButton Resp3c;

    RadioButton Resp4a;
    RadioButton Resp4b;
    RadioButton Resp4c;

    RadioButton Resp5a;
    RadioButton Resp5b;
    RadioButton Resp5c;

    RadioButton Resp6a;
    RadioButton Resp6b;
    RadioButton Resp6c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resp1a = (RadioButton)findViewById(R.id.Resp1A);
        Resp1b = (RadioButton)findViewById(R.id.Resp1B);
        Resp1c = (RadioButton)findViewById(R.id.Resp1C);

        Resp2a = (RadioButton)findViewById(R.id.Resp2A);
        Resp2b = (RadioButton)findViewById(R.id.Resp2B);
        Resp2c = (RadioButton)findViewById(R.id.Resp2C);

        Resp3a = (RadioButton)findViewById(R.id.Resp3A);
        Resp3b = (RadioButton)findViewById(R.id.Resp3B);
        Resp3c = (RadioButton)findViewById(R.id.Resp3C);

        Resp4a = (RadioButton)findViewById(R.id.Resp4A);
        Resp4b = (RadioButton)findViewById(R.id.Resp4B);
        Resp4c = (RadioButton)findViewById(R.id.Resp4C);

        Resp5a = (RadioButton)findViewById(R.id.Resp5A);
        Resp5b = (RadioButton)findViewById(R.id.Resp5B);
        Resp5c = (RadioButton)findViewById(R.id.Resp5C);

        Resp6a = (RadioButton)findViewById(R.id.Resp6A);
        Resp6b = (RadioButton)findViewById(R.id.Resp6B);
        Resp1c = (RadioButton)findViewById(R.id.Resp6C);
        //TODO pegando os valores
        /*perg2 = (EditText)findViewById(R.id.edtResp2);
        perg3 = (EditText)findViewById(R.id.edtResp3);
        perg4 = (EditText)findViewById(R.id.edtResp4);
        perg5 = (EditText)findViewById(R.id.edtResp5);
        perg6 = (EditText)findViewById(R.id.edtResp6);*/

    }
    public void btnResposta(View v) {
        nota = 0;
        /*if (Resp1a.isChecked() ||) {
            //TODO verifica se está nulo o campo
            perg1.setError("Preencha esse campo");
            //TODO emite mensagem de erro pedindo para preencher o campo
            perg1.requestFocus();
            //TODO deixa campo selecionado
        }
        if (perg2.getText().toString().trim().isEmpty()) {
            perg2.setError("Preencha esse campo");
            perg2.requestFocus();
        }
        if (perg3.getText().toString().trim().isEmpty()) {
            perg3.setError("Preencha esse campo");
            perg3.requestFocus();
        }
        if (perg4.getText().toString().trim().isEmpty()) {
            perg4.setError("Preencha esse campo");
            perg4.requestFocus();
        }
        if (perg5.getText().toString().trim().isEmpty()) {
            perg5.setError("Preencha esse campo");
            perg5.requestFocus();
        }
        if (perg6.getText().toString().trim().isEmpty()) {
            perg6.setError("Preencha esse campo");
            perg6.requestFocus();
        } else {*/
            if (Resp1a.isChecked()) {
                //TODO compara se o que foi digitado é a resposta certa
                /*Resp1a.setTextColor(Color.GREEN);
                Resp1b.setTextColor(Color.RED);
                Resp1c.setTextColor(Color.RED);*/
                //TODO coloca a cor no campo
                nota++;
                //TODO conta se a resposta estiver certa
            } /*else {
                Resp1a.setTextColor(Color.GREEN);
                Resp1b.setTextColor(Color.RED);
                Resp1c.setTextColor(Color.RED);
            }*/
            if (Resp2b.isChecked()) {
               /* Resp2b.setTextColor(Color.GREEN);
                Resp2a.setTextColor(Color.RED);
                Resp2c.setTextColor(Color.RED);*/
                nota++;
            }/* else {
                Resp2b.setTextColor(Color.GREEN);
                Resp2a.setTextColor(Color.RED);
                Resp2c.setTextColor(Color.RED);
            }*/
            if (Resp4c.isChecked()) {
               /* Resp4c.setTextColor(Color.GREEN);
                Resp4a.setTextColor(Color.RED);
                Resp4b.setTextColor(Color.RED);*/
                nota++;
            }/*else {
                Resp4c.setTextColor(Color.GREEN);
                Resp4a.setTextColor(Color.RED);
                Resp4b.setTextColor(Color.RED);
            }*/
            if (Resp3b.isChecked()) {
                /*Resp3b.setTextColor(Color.GREEN);
                Resp3a.setTextColor(Color.RED);
                Resp3c.setTextColor(Color.RED);*/
                nota++;
            }/* else {
                Resp3b.setTextColor(Color.GREEN);
                Resp3a.setTextColor(Color.RED);
                Resp3c.setTextColor(Color.RED);
            }*/
            if (Resp5a.isChecked()) {
                /*Resp5a.setTextColor(Color.GREEN);
                Resp5b.setTextColor(Color.RED);
                Resp5c.setTextColor(Color.RED);*/
                nota++;
            }/* else {
                Resp5a.setTextColor(Color.GREEN);
                Resp5b.setTextColor(Color.RED);
                Resp5c.setTextColor(Color.RED);
            }*/
            if (Resp6c.isChecked()) {
                /*Resp6c.setTextColor(Color.GREEN);
                Resp6a.setTextColor(Color.RED);
                Resp6b.setTextColor(Color.RED);*/
                nota++;
            }/* else {
                Resp6c.setTextColor(Color.GREEN);
                Resp6a.setTextColor(Color.RED);
                Resp6b.setTextColor(Color.RED);
            }*/
            media = (nota * 100) / 6;
            Toast.makeText(this, "Acertou " + nota.toString() + " questões, Porcentagem " + media.toString() + "%.", Toast.LENGTH_LONG).show();
        }
    }








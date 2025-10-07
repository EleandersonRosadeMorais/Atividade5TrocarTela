package br.com.senacrs.trocadetelas;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;

public class TrocaTelasActivity extends Activity {

    Button btnVoltar, btnConfirmar;
    EditText edtNome, edtIdade;
    String nome;
    int idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        carregarTelaPrincipal();
    }

    private void carregarTelaPrincipal() {
        setContentView(R.layout.tela_principal);

        edtNome = findViewById(R.id.edtNome);
        edtIdade = findViewById(R.id.edtIdade);
        btnConfirmar = findViewById(R.id.btnConfirmar);

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome = edtNome.getText().toString().trim();
                String idadeTexto = edtIdade.getText().toString().trim();
                idade = Integer.parseInt(idadeTexto);
                carregarTela2();
            }
        });
    }

    private void carregarTela2() {
        setContentView(R.layout.tela2);

        TextView txtMensagem = findViewById(R.id.txtMensagem);
        txtMensagem.setText("Olá, " + nome + "! Você tem " + idade + " anos.");

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregarTelaPrincipal();
            }
        });
    }
}

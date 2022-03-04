package com.example.boletimnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        Button btnLimpar = findViewById(R.id.botaoNovoCalculo);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtFaltas = findViewById(R.id.edtFaltas);
                EditText txtNota1 = findViewById(R.id.edtNota1);
                EditText txtNota2 = findViewById(R.id.edtNota2);
                EditText txtMedia = findViewById(R.id.campoMedia);
                EditText txtSituacao = findViewById(R.id.campoSituacao);

                int falta = Integer.parseInt(txtFaltas.getText().toString());
                float nota_1 = Float.parseFloat(txtNota1.getText().toString());
                float nota_2 = Float.parseFloat(txtNota2.getText().toString());

                float media = (nota_1 + nota_2) /2 ;

                txtMedia.setText("A média do aluno é : " + media);

                if (falta <= 20) {
                    if (media > 6)  {
                        txtSituacao.setText("O Aluno está Aprovado");
                    }
                    else if (media < 3){
                        txtSituacao.setText("O Aluno está Reprovado");
                    }
                    else if (media >= 3 && media < 6){
                        txtSituacao.setText("Aluno de DP");
                    }
                }
                else {
                    txtSituacao.setText("O Aluno está reprovado por falta");
                }
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtNome = findViewById(R.id.edtNome);
                EditText txtDisciplina = findViewById(R.id.edtDisciplina);
                EditText txtFaltas = findViewById(R.id.edtFaltas);
                EditText txtNota1 = findViewById(R.id.edtNota1);
                EditText txtNota2 = findViewById(R.id.edtNota2);
                EditText txtMedia = findViewById(R.id.campoMedia);
                EditText txtSituacao = findViewById(R.id.CampoSituacao);

                txtNome.setText("");
                txtDisciplina.setText("");
                txtFaltas.setText("");
                txtNota1.setText("");
                txtNota2.setText("");
                txtMedia.setText("");
                txtSituacao.setText("");

                txtNome.requestFocus();
            }
        });

    }
}
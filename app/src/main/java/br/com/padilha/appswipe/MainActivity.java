package br.com.padilha.appswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout fundoDaTela;
    private TextView tvDirecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fundoDaTela = findViewById(R.id.fundoDaTela);
        tvDirecao = findViewById(R.id.tvDirecao);
    }
}
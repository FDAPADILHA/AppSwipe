package br.com.padilha.appswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
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

        fundoDaTela.setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                tvDirecao.setText("Baixo");
                fundoDaTela.setBackgroundColor(Color.GREEN);
            }

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                tvDirecao.setText("Cima");
                fundoDaTela.setBackgroundColor(Color.BLUE);
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                tvDirecao.setText("Esquerda");
                fundoDaTela.setBackgroundColor(Color.YELLOW);
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                tvDirecao.setText("Direita");
                fundoDaTela.setBackgroundColor(Color.RED);
            }
        });

    }
}
package com.sti.placarbasquete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pontuacaoA, pontuacaoB;
    private Button tresPontosA,doisPontosA,tiroLivreA, tresPontosB, doisPontosB, tiroLivreB, reiniciarPartida;

    private int pontuacaoTotalA = 0, pontuacaoTotalB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarViews();

        tresPontosA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionaTresPontosA();
            }
        });

        doisPontosA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionaDoisPontosA();
            }
        });

        tiroLivreA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiroLivreA();
            }
        });

        tresPontosB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionaTresPontosB();
            }
        });

        doisPontosB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionaDoisPontosB();
            }
        });

        tiroLivreB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiroLivreB();
            }
        });

        reiniciarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciarPartida();
            }
        });


    }

    public void iniciarViews(){

//        RESGATANDO PLACARES
        pontuacaoA = findViewById(R.id.pontuacao_a);
        pontuacaoB = findViewById(R.id.pontuacao_b);

//        RESGATANDO BOTOES A
        tresPontosA = findViewById(R.id.tres_pontos_a);
        doisPontosA = findViewById(R.id.dois_pontos_a);
        tiroLivreA = findViewById(R.id.tiro_livre_a);


        //        RESGATANDO BOTOES B
        tresPontosB = findViewById(R.id.tres_pontos_b);
        doisPontosB = findViewById(R.id.dois_pontos_b);
        tiroLivreB = findViewById(R.id.tiro_livre_b);

//       RESGATANDO VIEW DO BOTAO REINICIAR PARTIDA
        reiniciarPartida = findViewById(R.id.reiniciar_partida);
    }

    public void mostrarPlacarA(){
        pontuacaoA.setText(String.valueOf(pontuacaoTotalA));
    }

    public void mostrarPlacarB(){
        pontuacaoB.setText(String.valueOf(pontuacaoTotalB));
    }

    public void adicionaTresPontosA(){
//        pontuacaoTotalA = pontuacaoTotalA + 3;
        pontuacaoTotalA += 3;
        mostrarPlacarA();
    }

    public void adicionaDoisPontosA(){
        pontuacaoTotalA += 2;
        mostrarPlacarA();
    }

    public void tiroLivreA(){
        pontuacaoTotalA++;
        mostrarPlacarA();
    }

    public void adicionaTresPontosB(){
//        pontuacaoTotalB = pontuacaoTotalB + 3;
        pontuacaoTotalB += 3;
        mostrarPlacarB();
    }

    public void adicionaDoisPontosB(){
        pontuacaoTotalB += 2;
        mostrarPlacarB();
    }

    public void tiroLivreB(){
        pontuacaoTotalB++;
        mostrarPlacarB();
    }

    public void reiniciarPartida(){
        pontuacaoTotalA = 0;
        pontuacaoTotalB = 0;
        mostrarPlacarA();
        mostrarPlacarB();
    }

}

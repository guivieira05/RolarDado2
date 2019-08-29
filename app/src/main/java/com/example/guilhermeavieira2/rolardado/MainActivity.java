package com.example.guilhermeavieira2.rolardado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {


    private TextView textViewResult;

    private ImageView imageViewDado1;

    private ImageView imageViewDado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResultado);

        textViewResult.setText("");

        imageViewDado1 = findViewById(R.id.imageViewDado);
        imageViewDado2 = findViewById(R.id.imageViewDado2);
    }

    public void dado ( View v)
        {
            Random geranum = new Random();
            Random geranum2 = new Random();

            Integer numero = 1 + geranum.nextInt( 6 );
            Integer numero2 = 1 + geranum2.nextInt( 6 );

            Integer resultadosoma = numero + numero2;

            String resultadoDado = (resultadosoma).toString();

            textViewResult.setText(resultadoDado);


            if ((numero) == 1)
            {
                imageViewDado1.setImageResource(R.drawable.dadoum);

            }

            else if ((numero) == 2)
            {
                imageViewDado1.setImageResource(R.drawable.dadodois);

            }

            else if ((numero) == 3)
            {
                imageViewDado1.setImageResource(R.drawable.dadotres);

            }

            else if ((numero) == 4)
            {
                imageViewDado1.setImageResource(R.drawable.dadoquatro);

            }

            else if ((numero) == 5)
            {
                imageViewDado1.setImageResource(R.drawable.dadocinco);

            }


            else if ((numero) == 6)
            {
                imageViewDado1.setImageResource(R.drawable.dadoseis);

            }


            if ((numero2) == 1)
            {
                imageViewDado2.setImageResource(R.drawable.dadoum);

            }


            else if ((numero2) == 2)
            {
                imageViewDado2.setImageResource(R.drawable.dadodois);

            }


            else if ((numero2) == 3)
            {
                imageViewDado2.setImageResource(R.drawable.dadotres);

            }


            else if ((numero2) == 4)
            {
                imageViewDado2.setImageResource(R.drawable.dadoquatro);

            }


            else if ((numero2) == 5)
            {
                imageViewDado2.setImageResource(R.drawable.dadocinco);

            }

            else if ((numero2) == 6)
            {
                imageViewDado2.setImageResource(R.drawable.dadoseis);

            }

        }




}

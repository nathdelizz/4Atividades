package com.example.a4atividades;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button SortearButton;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResultado=findViewById(R.id.tvResultado);
        SortearButton=findViewById(R.id.SortearButton);
        SortearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomNum1 = (int)(Math.random() * 101);  // 0 to 100
                int randomNum2 = (int)(Math.random() * 101);
                int randomNum3 = (int)(Math.random() * 101);
                int randomNum4 = (int)(Math.random() * 101);
                int randomNum5 = (int)(Math.random() * 101);

                boolean igual=true;
                while (igual) {
                    if (randomNum1 == randomNum2 || randomNum1 == randomNum3 || randomNum1 == randomNum4 || randomNum1 == randomNum5) {
                        igual=true;
                        randomNum1 = (int) (Math.random() * 101);
                    }else{
                        igual=false;
                    }
                }
                igual=true;
                while (igual) {
                    if (randomNum2 == randomNum1 || randomNum2 == randomNum3 || randomNum2 == randomNum4 || randomNum2 == randomNum5) {
                        igual=true;
                        randomNum2 = (int) (Math.random() * 101);
                    }else{
                        igual=false;
                    }
                }
                igual=true;
                while (igual) {
                    if (randomNum3 == randomNum1 || randomNum3 == randomNum2 || randomNum3 == randomNum4 || randomNum3 == randomNum5) {
                        igual=true;
                        randomNum3 = (int) (Math.random() * 101);
                    }else{
                        igual=false;
                    }
                }
                igual=true;
                while (igual) {
                    if (randomNum4 == randomNum1 || randomNum4 == randomNum2 || randomNum4 == randomNum3 || randomNum2 == randomNum5) {
                        igual=true;
                        randomNum4 = (int) (Math.random() * 101);
                    }else{
                        igual=false;
                    }
                }
                igual=true;
                while (igual) {
                    if (randomNum5 == randomNum1 || randomNum5 == randomNum2 || randomNum5 == randomNum3 || randomNum2 == randomNum4) {
                        igual=true;
                        randomNum5 = (int) (Math.random() * 101);
                    }else{
                        igual=false;
                    }
                }
                tvResultado.setText(randomNum1+","+randomNum2+","+randomNum3+","+randomNum4+","+randomNum5);
            }

        });


    }
}
package com.example.estudiante.patronobserver;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements DialogoColor.MiListener {

    private LinearLayout padre;
        private Button btn_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        padre= findViewById(R.id.padre);
        btn_color= findViewById(R.id.btn_color);



        btn_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DialogoColor dialogoColor= new DialogoColor();
                dialogoColor.setListener(MainActivity.this);
                dialogoColor.show(getSupportFragmentManager(),"miDialogo");

            }
        });
    }

    @Override
    public void onChangeColor(String color) {
    switch (color){
        case "Blanco":
            padre.setBackgroundColor(Color.WHITE);
            break;
        case "Azul":
            padre.setBackgroundColor(Color.BLUE);
            break;
        case "Negro":
            padre.setBackgroundColor(Color.BLACK);
            break;

    }
    }
}

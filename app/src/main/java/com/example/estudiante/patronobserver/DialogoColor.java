package com.example.estudiante.patronobserver;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

public class DialogoColor extends AppCompatDialogFragment{
    //OBSERVABLE//


    //2. CREAR OBJETO COMO VARIABLE GLOBAL//
    MiListener listener;

    //1. CREAR INTERFACE//
    interface MiListener{
        void onChangeColor(String color);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        builder.setTitle("CAMBIAR COLOR");
        builder.setMessage("Seleccione un color");
        builder.setPositiveButton("Blanco", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Blanco");
            }
        });
        builder.setNeutralButton("Azul", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Azul");

            }
        });
        builder.setNegativeButton("Negro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Negro");
            }
        });

        return builder.create();
    }

    //3. METODO DE SET PARA EL LISTENER//


    public void setListener(MiListener listener) {
        this.listener = listener;
    }


}

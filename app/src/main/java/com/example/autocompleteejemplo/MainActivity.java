package com.example.autocompleteejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    public static String[] SITIOS_MOVIL ={
            "Max Android",
            "Miriado Z",
            "Movil IA",
            "MUX",
            "Masterd en Android",
            "Minimum IOs Shippable",
            "Melody Movil"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AutoCompleteTextView sugerencias = (AutoCompleteTextView) findViewById(R.id.sugerencias);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, SITIOS_MOVIL);

        sugerencias.setAdapter(adaptador);
    }
}
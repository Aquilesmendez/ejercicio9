package com.example.ejercicio9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejercicio9.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        int imagenId = intent.getIntExtra("imagen", 0);
        binding.imageView.setImageResource(imagenId);

        binding.volverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volverAActividadAnterior();
            }
        });

        binding.cerrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrarAplicacion();
            }
        });
    }

    private void volverAActividadAnterior() {
        finish();
    }

    private void cerrarAplicacion() {
        finishAffinity();
    }
}

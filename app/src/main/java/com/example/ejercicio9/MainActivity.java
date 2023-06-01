package com.example.ejercicio9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejercicio9.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.kaido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarImagenSeleccionada(R.drawable.kaido);
            }
        });

        binding.luffy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarImagenSeleccionada(R.drawable.luffy);
            }
        });

        binding.zoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarImagenSeleccionada(R.drawable.zoro);
            }
        });

        binding.image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarImagenSeleccionada(R.drawable.sanji);
            }
        });
    }

    private void enviarImagenSeleccionada(int imagenId) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("imagen", imagenId);
        startActivity(intent);
    }
}

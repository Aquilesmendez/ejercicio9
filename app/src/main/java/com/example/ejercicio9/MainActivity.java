package com.example.ejercicio9;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejercicio9.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int selectedImageId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.kaido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage(R.drawable.kaido);
            }
        });

        binding.luffy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage(R.drawable.luffy);
            }
        });

        binding.zoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage(R.drawable.zoro);
            }
        });

        binding.image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage(R.drawable.sanji);
            }
        });

        binding.buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedImageId != 0) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("imagen", selectedImageId);
                    startActivity(intent);
                }
            }
        });
    }

    private void selectImage(int imageId) {
        // Resaltar la imagen seleccionada o realizar alguna otra acción si deseas
        selectedImageId = imageId;
    }
}

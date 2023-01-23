package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView Dog;
    private ImageView Cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dog = (ImageView) findViewById(R.id.DogId);
        Cat = (ImageView) findViewById(R.id.CatId);
        Dog.setOnClickListener(this);
        Cat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.DogId:
                Intent intent= new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", "Bruno");
                intent.putExtra("bio", "Amazing pitbull with great skin texture");
                startActivity(intent);
                break;
            case R.id.CatId:
                Intent intent1= new Intent(MainActivity.this, MainActivity2.class);
                intent1.putExtra("name", "Jarvis");
                intent1.putExtra("bio", "Good cat, has a ability to dance.");
                startActivity(intent1);
                break;
        }
    }
}
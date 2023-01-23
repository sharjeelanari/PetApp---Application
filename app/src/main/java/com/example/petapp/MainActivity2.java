package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView img;
    private TextView Name;
    private TextView Bio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Name=(TextView) findViewById(R.id.NameId);
        Bio=(TextView) findViewById(R.id.BioId);

        extras=getIntent().getExtras();

        if (extras!=null){
            String name=extras.getString("name");
            String bio = extras.getString("bio");
            setUp(name, bio);
        }

    }
    public void setUp(String name, String bio){
        if (name.equals("Bruno")){
            Name.setText(name);
            Bio.setText(bio);
        }else if (name.equals("Jarvis")){
            Name.setText(name);
            Bio.setText(bio);
        }

    }

}
package com.nuraviatunjanah.hijabstore;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class About extends AppCompatActivity {

    Toolbar back;
    ImageView imgme;
    TextView name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        back = findViewById(R.id.toolbarback);
        setSupportActionBar(back);

        imgme = findViewById(R.id.imgme);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void setSupportActionBar(Toolbar back) {
    }
}

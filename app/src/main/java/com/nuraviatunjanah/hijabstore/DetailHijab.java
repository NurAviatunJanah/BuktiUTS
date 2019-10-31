package com.nuraviatunjanah.hijabstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DetailHijab extends AppCompatActivity {
    Toolbar back;
    ImageView imagehijab;
    TextView namehijab, detailhijab, hargahijab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hijab);

        imagehijab = findViewById(R.id.img_item_photo);
        namehijab = findViewById(R.id.tv_item_name);
        detailhijab = findViewById(R.id.tv_item_detail);
        hargahijab= findViewById(R.id.tv_item_harga);

        back = findViewById(R.id.toolbarback);
        setSupportActionBar(back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int photo = getIntent().getIntExtra("HijabImages", 0);
        String nama = getIntent().getStringExtra("HijabNames");
        String deskripsi = getIntent().getStringExtra("HijabDetails");
        String harga = getIntent().getStringExtra("HijabHarga");
        imagehijab.setImageResource(photo);
        namehijab.setText(nama);
        detailhijab.setText(deskripsi);
        hargahijab.setText(harga);
    }

    private void setSupportActionBar(Toolbar back) {
    }
}

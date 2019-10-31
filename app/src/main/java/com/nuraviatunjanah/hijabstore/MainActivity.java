package com.nuraviatunjanah.hijabstore;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvhijab;
    private ArrayList<Hijab> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvhijab = findViewById(R.id.rv_hijab);
        rvhijab.setHasFixedSize(true);

        list.addAll(DataHijab.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvhijab.setLayoutManager(new LinearLayoutManager(this));
        ListHijab listHijab = new ListHijab(list);
        rvhijab.setAdapter(listHijab);

        listHijab.setOnItemClickCallback(new ListHijab.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hijab data) {
                showSelectedHijab(data);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.activity_main:
                showRecyclerList();
                break;
            case R.id.action_about:
                Intent about = new Intent(MainActivity.this,About.class);
                startActivity(about);

        }
    }

    private void showSelectedHijab(Hijab hijab) {
        Intent detail = new Intent(MainActivity.this,DetailHijab.class);
        detail.putExtra("HijabImages", hijab.getPhoto());
        detail.putExtra("HijabNames", hijab.getName());
        detail.putExtra("HijabDetails", hijab.getDetail());
        detail.putExtra("HijabHarga", hijab.getHarga());
        startActivity(detail);
    }
}

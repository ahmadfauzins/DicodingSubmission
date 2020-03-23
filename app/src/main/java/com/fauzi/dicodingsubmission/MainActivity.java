package com.fauzi.dicodingsubmission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.fauzi.dicodingsubmission.Adapter.BuahAdapter;
import com.fauzi.dicodingsubmission.Adapter.BuahDetail;
import com.fauzi.dicodingsubmission.Model.Buah;
import com.fauzi.dicodingsubmission.Model.BuahContent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlace;
    private ArrayList<Buah> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlace = findViewById(R.id.rv_buah);
        rvPlace.setHasFixedSize(true);

        list.addAll(BuahContent.getListData());
        showRecyclerList();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile:
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList() {
        rvPlace.setLayoutManager(new LinearLayoutManager(this));
        BuahAdapter lishBuahAdapter = new BuahAdapter(list);
        rvPlace.setAdapter(lishBuahAdapter);

        lishBuahAdapter.setOnItemClickCallback(new BuahAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(Buah data) {
                showSelectedPlace(data);
            }
        });
    }

    private void showSelectedPlace(Buah data) {
        Intent intent = new Intent(MainActivity.this, BuahDetail.class);
        intent.putExtra(BuahDetail.EXTRA_NAME, data.getName());
        intent.putExtra(BuahDetail.EXTRA_IMG, data.getPhoto());
        intent.putExtra(BuahDetail.EXTRA_DETAIL, data.getManfaat());
        startActivity(intent);
    }
}

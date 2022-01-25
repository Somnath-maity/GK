package com.example.gkquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button geography = findViewById(R.id.geography);
        geography.setOnClickListener(view -> geo());
        Button history = findViewById(R.id.history);
        history.setOnClickListener(view -> hist());
        Button polity = findViewById(R.id.politics);
        polity.setOnClickListener(view -> Politics());
    }

    public void Politics() {
        Intent politys = new Intent(this, Politics.class);
        startActivity(politys);
    }

    public void geo() {
        Intent geos = new Intent(this, geo.class);
        startActivity(geos);
    }

    public void hist() {
        Intent hists = new Intent(this, hist.class);
        startActivity(hists);
    }



}
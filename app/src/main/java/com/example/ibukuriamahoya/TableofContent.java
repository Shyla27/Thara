package com.example.ibukuriamahoya;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class TableofContent extends AppCompatActivity {

    private static final int MENU_ITEM_1 = 1;
    private static final int MENU_ITEM_2 = 2;
    private static final int MENU_ITEM_3 = 3;

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    private AppCompatButton button, ngwataniro;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tableof_content);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        Toolbar toolbar = findViewById(R.id.main_activity_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("IBUKU RIA MAHOYA ");
        button = findViewById(R.id.morning);
        ngwataniro = findViewById(R.id.ngwataniro);

//        drawerLayout = findViewById(R.id.my_drawer_layout);
//        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
//
//        // pass the Open and Close toggle for the drawer layout listener
//        // to toggle the button
//        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        actionBarDrawerToggle.syncState();
//
//        // to make the Navigation drawer icon always appear on the action bar
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ngwataniro.setOnClickListener(v -> {
            Intent i = new Intent(getBaseContext(), NGWATANIROTHERU.class);
            startActivity(i);
        });
        button.setOnClickListener(v -> {
            Intent i = new Intent(getBaseContext(), GuthathaiyaNgaiKwaRucini.class);
            startActivity(i);
        });
    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected( MenuItem item) {
//        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
//            return true;
//        }
//        switch (item.getItemId()) {
//
//            case MENU_ITEM_1:
//                Toast.makeText(getApplicationContext(), "settings", Toast.LENGTH_SHORT).show();
//                return true;
//
//            case MENU_ITEM_2:
//                Intent intent=new Intent(TableofContent.this,About.class);
//                startActivity(intent);
//                finish();
//                return true;
//
//            default:
//
//        return super.onOptionsItemSelected(item);
//        }
//
//    }
    }

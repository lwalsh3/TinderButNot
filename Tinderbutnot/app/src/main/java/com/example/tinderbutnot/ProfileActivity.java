package com.example.tinderbutnot;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private Menu mMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        mMenu = menu;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.swipe:
            Intent intent = new Intent(ProfileActivity.this, SwipeActivity.class);
            startActivity(intent);
            return(true);
        case R.id.scroll:
            Intent intent2 = new Intent(ProfileActivity.this, ScrollActivity.class);
            startActivity(intent2);
            return(true);
        case R.id.profile:
            return(true);
    }
        return(super.onOptionsItemSelected(item));
    }
}

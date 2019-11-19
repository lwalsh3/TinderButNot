package com.example.tinderbutnot;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ListFragment;

public class ScrollActivity extends AppCompatActivity {

    private Menu mMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.scroll_fragment_container);

        if (fragment == null) {
            fragment = new ListFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.scroll_fragment_container, fragment)
                    .commit();
        }
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
            Intent intent = new Intent(ScrollActivity.this, SwipeActivity.class);
            startActivity(intent);
            return(true);
        case R.id.scroll:
            return(true);
        case R.id.profile:
            startActivity(new Intent(ScrollActivity.this, ProfileActivity.class));
            return(true);
    }
        return(super.onOptionsItemSelected(item));
    }
}

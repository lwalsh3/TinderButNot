package com.example.tinderbutnot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SwipeActivity extends AppCompatActivity {

    private Button dislikeButton;
    private Button likeButton;
    private Button saveImageButton;

    private Menu mMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        dislikeButton = findViewById(R.id.buttonDislike);
        likeButton = findViewById(R.id.buttonLike);
        saveImageButton = findViewById(R.id.buttonSaveImage);

        dislikeButton.setOnClickListener((v -> {
            //TODO decrement current Post score, set current Post userDislike to true, move on to next post
        }));

        likeButton.setOnClickListener((v -> {
            //TODO increment current Post score, set current Post userlike to true, move on to next post
        }));

        saveImageButton.setOnClickListener((v -> {
            //TODO save Image from current post to local storage of device
        }));
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
            //TODO if not already on the swipe page, switch to swipe page (create if necessary)
            return(true);
        case R.id.scroll:
            startActivity(new Intent(this, ScrollActivity.class));
            return(true);
        case R.id.profile:
            startActivity(new Intent(this, ProfileActivity.class));
            return(true);
    }
        return(super.onOptionsItemSelected(item));
    }
}

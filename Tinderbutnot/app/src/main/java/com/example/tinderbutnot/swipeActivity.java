package com.example.tinderbutnot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class swipeActivity extends AppCompatActivity {

    private Button dislikeButton;
    private Button likeButton;
    private Button saveImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        dislikeButton = findViewById(R.id.buttonDislike);
        likeButton = findViewById(R.id.buttonLike);
        saveImageButton = findViewById(R.id.buttonSaveImage);

        dislikeButton.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //TODO decrement current Post score, set current Post userDislike to true, move on to next post
            }
        }));

        likeButton.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //TODO increment current Post score, set current Post userlike to true, move on to next post
            }
        }));

        saveImageButton.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //TODO save Image from current post to local storage of device
            }
        }));
    }




}

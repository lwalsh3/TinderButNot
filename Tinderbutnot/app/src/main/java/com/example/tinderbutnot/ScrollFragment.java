package com.example.tinderbutnot;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import java.util.List;

public class ScrollFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_scroll, container, false);
        LinearLayout layout = (LinearLayout) view;

        // Create the buttons using the band names and ids from BandDatabase
        List<Post> bandList = PostDatabase.getInstance(getContext()).getPosts();
        for (int i = 0; i < bandList.size(); i++) {
            Button button = new Button(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 0, 0, 10);   // 10 px
            button.setLayoutParams(layoutParams);

            // Set the text to the band's name and tag to the band ID
            Post post = PostDatabase.getInstance(getContext()).getPost(i + 1);
            button.setText(post.getPostTitle());
            button.setTag(Integer.toString(post.getId()));

            // All the buttons have the same click listener
            button.setOnClickListener(buttonClickListener);

            // Add the button to the LinearLayout
            layout.addView(button);
        }

        return view;
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Start DetailsActivity
            Intent intent = new Intent(getActivity(), DetailsActivity.class);
            startActivity(intent);
        }
    };
}
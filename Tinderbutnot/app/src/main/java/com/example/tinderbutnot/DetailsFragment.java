package com.example.tinderbutnot;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {

    private Post mPost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the first band
        mPost = PostDatabase.getInstance(getContext()).getPost(1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        TextView nameTextView = (TextView) view.findViewById(R.id.postTitle);
        nameTextView.setText(mPost.getPostTitle());

        TextView descriptionTextView = (TextView) view.findViewById(R.id.imageRef);
        descriptionTextView.setText(mPost.getImageRef());

        return view;
    }
}


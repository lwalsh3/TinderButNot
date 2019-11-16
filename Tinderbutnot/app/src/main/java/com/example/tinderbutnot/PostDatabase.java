package com.example.tinderbutnot;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

public class PostDatabase {
    private static PostDatabase sPostDataBase;
    private List<Post> mPosts;

    public PostDatabase(Context context) {
        mPosts = new ArrayList<>();
        Resources res = context.getResources();
        String[] postTitles = res.getStringArray(R.array.postTitles);
        String[] imageRefs = res.getStringArray(R.array.imageRefs);
        for (int i = 0; i < postTitles.length; i++) {
            mPosts.add(new Post(postTitles[i], imageRefs[i], (int) (Math.random() * 400 + 100), i + 1));
        }
    }

    public static PostDatabase getInstance(Context context) {
        if (sPostDataBase == null) {
            sPostDataBase = new PostDatabase(context);
        }
        return sPostDataBase;
    }

    public List<Post> getPosts() {
        return mPosts;
    }

    public Post getPost(int postId) {
        for (Post post : mPosts) {
            if (post.getId() == postId) {
                return post;
            }
        }
        return null;
    }
}

package com.example.tinderbutnot;

public class Post {
    private boolean userDislike, userLike;
    private int score, id;
    private String imageRef;
    private String postTitle;

    public Post()
    {

    }

    public Post(String imageRef, String postTitle, int score, int id)
    {
        this.imageRef = imageRef;
        this.postTitle = postTitle;
        this.score = score;
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isUserDislike() {
        return userDislike;
    }

    public void setUserDislike(boolean userDislike) {
        this.userDislike = userDislike;
    }

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }

    public String getImageRef() {
        return imageRef;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public int getId() {
        return id;
    }
}

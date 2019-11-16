package com.example.tinderbutnot;

public class Post {
    private boolean userDislike, userLike;
    private int score;
    private String imageRef;
    private String postTitle;

    public Post()
    {

    }

    public Post(String imageRef, String postTitle, int score)
    {
        this.imageRef = imageRef;
        this.postTitle = postTitle;
        this.score = score;
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
}

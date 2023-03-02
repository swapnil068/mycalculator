package com.example.mycalculator;

import android.net.Uri;

public class userModel {
    int albumId;
    int id;
  public static  int image;
    String title;
    String url;
    String thumbnailUrl;

    public userModel(int albumId,int id,String title, String url,  String thumbnailUrl,int image){
        this.albumId=albumId;
        this.id=id;
        this.title=title;
        this.url=url;
        this.thumbnailUrl=thumbnailUrl;
        this.image=image;
    }

    public int getId() {
        return id;

    }

    public int getAlbumId() {
        return albumId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public void setImage(int image) {
        this.image = image;

    }
    public int getImage() {
        return image;
    }
}

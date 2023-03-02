package com.example.mycalculator;

public class userVolleyModel {
    int albumId;
    int id;
    String title;
    String url;
    String thumbnailUrl;



    public userVolleyModel(int albumId,int id,String title, String url,  String thumbnailUrl){
        this.albumId=albumId;
        this.id=id;
        this.title=title;
        this.url=url;
        this.thumbnailUrl=thumbnailUrl;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAlbumId() {
        return albumId;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
}

package com.example.test;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class Song extends LitePalSupport {

    @Column(nullable = false)
    private String name;

    private int duration;
    private  int time;

    private  int  fase;

    private  int  fase1;

    private  int  fase2;

    private  int  fenzhi1;

    private  int  fenzhi2;

    @Column(ignore = true)
    private String uselessField;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUselessField() {
        return uselessField;
    }

    public void setUselessField(String uselessField) {
        this.uselessField = uselessField;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    private Album album;


}

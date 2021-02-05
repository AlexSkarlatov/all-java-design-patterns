package com.skarlatov.adapter;


public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface{
    AdvancedMediaPlayerInterface adaptee;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface adaptee){

        this.adaptee = adaptee;
    }
    @Override
    public void play(String audioType, String fileName) {
        adaptee.loadFilename(fileName);
        adaptee.listen();
    }
}
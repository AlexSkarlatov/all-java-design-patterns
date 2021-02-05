package com.skarlatov.adapter;

public class Client {
    public static void main(String... args){
        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","something.txt");
    }

}
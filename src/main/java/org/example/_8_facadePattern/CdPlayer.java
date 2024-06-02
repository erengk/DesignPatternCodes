package org.example._8_facadePattern;

public class CdPlayer {
    public void on() {
        System.out.println("CD Player on");
    }

    public void off() {
        System.out.println("CD Player off");
    }

    public void play(String title) {
        System.out.println("CD Player playing \"" + title + "\"");
    }

    public void eject() {
        System.out.println("CD Player eject");
    }
}


package com.me;

import java.io.Serializable;

public class Image implements Serializable {

    private Pixel[] pixels;
    private int width, height;

    public Image(Pixel[] pixels, int width, int height){
        this.pixels = pixels;
    }

    public Pixel[] getPixels() {
        return pixels;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        for(Pixel pixel : pixels){
            pixel.getRectangle().setSize(width,pixel.getRectangle().height);
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        for(Pixel pixel : pixels){
            pixel.getRectangle().setSize(pixel.getRectangle().width,height);
        }
    }

}

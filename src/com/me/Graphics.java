package com.me;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.concurrent.CopyOnWriteArrayList;

public class Graphics extends JPanel {

    int iterationX = 0;
    int iterationY = 1;
    int width, height;
    boolean finished = false;
    public static Image convertedImage;
    public static BufferedImage image;
    CopyOnWriteArrayList<Pixel> pixels = new CopyOnWriteArrayList<>();
    Pixel[] convertedPixels;

    @Override
    public void paint(java.awt.Graphics g) {
        super.paint(g);
        if(image!=null){
            g.drawImage(image,image.getWidth()+20,0,this);
            if(iterationX<(width)){
                if(!isTransparent()) {
                    Color color = new Color(image.getRGB(iterationX,iterationY));
                    pixels.add(new Pixel(color, new Point(iterationX, iterationY)));
                }
                iterationX++;
            } else if(iterationY<height-1) {
                iterationX = 0;
                iterationY++;
            } else if(!finished) {
                finished = true;
                System.out.println("Finished!");
                convertedPixels = new Pixel[pixels.size()];
                for(int i = 0; i<convertedPixels.length; i++){
                    convertedPixels[i] = pixels.get(i);
                }
                convertedImage = new Image(convertedPixels,width,height);
                Saver.saveCode();
            }
        }
        if(finished){
            for(Pixel pixel : convertedPixels){
                g.setColor(pixel.getColor());
                g.fillRect(pixel.getLocation().x,pixel.getLocation().y,pixel.getRectangle().width,pixel.getRectangle().height);
            }
        } else {
            for (Pixel pixel : pixels) {
                g.setColor(pixel.getColor());
                g.fillRect(pixel.getLocation().x, pixel.getLocation().y, pixel.getRectangle().width, pixel.getRectangle().height);
            }
        }
        repaint();
    }

    public boolean isTransparent() {
        int pixel = image.getRGB(iterationX,iterationY);
        return (pixel>>24) == 0x00;
    }
}

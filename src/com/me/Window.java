package com.me;


import javax.swing.*;
import java.awt.*;

public class Window extends JPanel {

    JFrame frame = new JFrame();
    static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int screenHeight,screenWidth;
    public static double scaleX,scaleY;
    Graphics graphics = new Graphics();

    public Window(){
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        scaleX = (getSize().width/800.0);
        scaleY = (getSize().height/600.0);
        frame.setTitle("Image to Code");
        frame.setSize(screenWidth,screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(graphics);
        frame.setVisible(true);
    }

    public JFrame getFrame(){
        return frame;
    }

    public void setFrame(JFrame frame){
        this.frame = frame;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        Window.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        Window.screenHeight = screenHeight;
    }

    public Graphics getGraphicsScreen() {
        return graphics;
    }

}

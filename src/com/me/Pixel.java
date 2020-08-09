package com.me;

import java.awt.*;
import java.io.Serializable;

public class Pixel implements Serializable {

    private Color color;
    private Rectangle rectangle;
    private Point location;

    public Pixel(Color color, Point location){
        this.color = color;
        rectangle = new Rectangle(1,1);
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }




}

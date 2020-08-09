package com.me;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static Window window = new Window();
    public static void main(String[] args) {
        Scanner inputPixelSize = new Scanner(System.in);
        System.out.println("Input file URL:");
        try {
            window.getGraphicsScreen().image = ImageIO.read(new File(inputPixelSize.nextLine()));
            window.getGraphicsScreen().width = window.getGraphicsScreen().image.getWidth();
            window.getGraphicsScreen().height = window.getGraphicsScreen().image.getHeight();

        } catch (IOException e) {
            e.printStackTrace();
        }
        inputPixelSize.close();
    }
}

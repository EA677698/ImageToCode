package com.me;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Saver {

    public static void saveCode(){
        try {
            FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\outputs\\" + "output.javaL");
            ObjectOutputStream writer = new ObjectOutputStream(file);
            writer.writeObject(Main.window.getGraphicsScreen().convertedImage);
            writer.close();
            System.out.println("Successfully saved");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

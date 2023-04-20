package esiea.tools.mock;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.*;
import java.io.*;

public class DigitalCameraMock implements IDigitalCamera {
    private boolean flashOn = false;

    public Image takeSnapshot(String fileName) {
        File file= new File(fileName);
        BufferedImage image = null;

        try {
            image = ImageIO.read(file);
        } catch(IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //transform the image according to the value of flashOn before returning it...
        if(flashOn) {
            System.out.println("Image enlightened as the flash is on");
        }

        return image;
    }

    public void flashLightOn() {
        this.flashOn = true;
    }

    public void flashLightOff() {
        this.flashOn = false;
    }

}


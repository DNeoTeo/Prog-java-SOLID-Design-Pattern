package esiea.tools.mock;

import java.awt.*;

public class DigitalPhotographer {
    IDigitalCamera digitalCamera;

    public void setDigitalCamera(IDigitalCamera dc)
    {
        digitalCamera = dc;
    }

    public Image takePictureWithoutFlash(String fileName){
        digitalCamera.flashLightOff();
        return digitalCamera.takeSnapshot(fileName);
    }
    public Image takePictureWithFlash(String fileName){
        digitalCamera.flashLightOn();
        return digitalCamera.takeSnapshot(fileName);
    }
}

package esiea.tools.mock;

import java.awt.*;

public interface IDigitalCamera {
    public Image takeSnapshot(String fileName);

    public void flashLightOn();

    public void flashLightOff();

}
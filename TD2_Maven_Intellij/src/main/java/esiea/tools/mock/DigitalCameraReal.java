package esiea.tools.mock;

import java.awt.Image;

public class DigitalCameraReal implements IDigitalCamera {

	private  boolean flashOn = false;
	@Override
	public Image takeSnapshot(String fileName) {
		// TODO This would connect to the real camera and take a picture
		return null;
	}

	@Override
	public void flashLightOn() {
		// TODO This would connect to the real camera and set the flash light on
		flashOn = true;

	}

	@Override
	public void flashLightOff() {
		// TODO This would connect to the real camera and set the flash light off
		flashOn = false;
	}

}

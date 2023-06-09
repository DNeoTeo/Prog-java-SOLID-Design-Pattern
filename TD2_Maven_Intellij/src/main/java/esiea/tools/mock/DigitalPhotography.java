package esiea.tools.mock;

import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class DigitalPhotography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalPhotographer dp = new DigitalPhotographer();
		IDigitalCamera dc = new DigitalCameraReal();
		dp.setDigitalCamera(dc);
		BufferedImage img = (BufferedImage) dp.takePictureWithFlash("mountains.jpg");
		try {
			ImageIO.write(img, "jpg", new File("output.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

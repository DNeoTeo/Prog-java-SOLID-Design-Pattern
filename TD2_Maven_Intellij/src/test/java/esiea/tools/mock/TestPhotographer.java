package esiea.tools.mock;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;

class TestPhotographer {

	@Test
	void testTakePictureWithoutFlash() {
		System.out.println("testing the camera without flash");
		DigitalPhotographer dp = new DigitalPhotographer();
		IDigitalCamera dc = new DigitalCameraMock();
		dp.setDigitalCamera(dc);
		BufferedImage img = (BufferedImage) dp.takePictureWithoutFlash("mountains.jpg");
		assertNotNull(img);  //other tests may be made here on the image...
		try {
			ImageIO.write(img, "jpg", new File("resources\\outputWithoutFlash.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testTakePictureWithFlash() {
		System.out.println("testing the camera with flash");
		DigitalPhotographer dp = new DigitalPhotographer();
		IDigitalCamera dc = new DigitalCameraMock();
		dp.setDigitalCamera(dc);
		BufferedImage img = (BufferedImage) dp.takePictureWithFlash("mountains.jpg");
		assertNotNull(img);  //other tests may be made here on the image...
		try {
			ImageIO.write(img, "jpg", new File("resources\\outputWithFlash.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testTakePictureException() {
		System.out.println("testing the camera exception");
		DigitalPhotographer dp = new DigitalPhotographer();
		IDigitalCamera dc = new DigitalCameraMock();
		dp.setDigitalCamera(dc);
		try {
			BufferedImage img = (BufferedImage) dp.takePictureWithFlash("");
		} catch (Exception e) {
			assertEquals(e.getClass(), IOException.class);
		}
	}

}

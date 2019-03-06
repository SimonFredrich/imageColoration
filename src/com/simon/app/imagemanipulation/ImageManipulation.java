package com.simon.app.imagemanipulation;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageManipulation {

    private BufferedImage image = null;
    private File file = null;
    private String pathIn, pathOut, format;

    public ImageManipulation(String pathIn, String pathOut, String format) {
        this.pathIn = pathIn;
        this.pathOut = pathOut;
    }

    public void read_image() {
        try {
            file = new File(pathIn);
            image = ImageIO.read(file);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        int width = image.getWidth();
        int height = image.getHeight();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int pixel = image.getRGB(x, y);

                // take a (Alpha) and r (red) from every pixel
                int a = (pixel>>24) & 0xff;
                int r = (pixel>>16) & 0xff;

                // give the pixel the actual red but set green and blue to 0
                pixel = (a << 24) | (r << 16) | (0 << 8) | 0;
                image.setRGB(x, y, pixel);

            }
        }
    }

    public void write_image() {
        try {
            file = new File(pathOut);
            ImageIO.write(image, format ,file);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

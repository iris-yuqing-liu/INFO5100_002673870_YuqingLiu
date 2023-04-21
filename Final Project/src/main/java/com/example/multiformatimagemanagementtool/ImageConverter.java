package com.example.multiformatimagemanagementtool;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageConverter {

    public static void convert(File inputFile, File outputFile, String outputFormat) throws IOException {
        BufferedImage image = ImageIO.read(inputFile);
        ImageIO.write(image, outputFormat, outputFile);
    }
}

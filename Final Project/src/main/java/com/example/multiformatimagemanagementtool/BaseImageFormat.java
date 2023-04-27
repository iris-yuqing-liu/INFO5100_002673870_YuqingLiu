package com.example.multiformatimagemanagementtool;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


// An abstract base class for different image formats that provides common functionality
public abstract class BaseImageFormat implements ImageFormat {

    protected String format;

    // Constructor that sets the format string
    protected BaseImageFormat(String format) {
        this.format = format;
    }

    // A method for converting an input image file to this format and writing the result to an output file
    @Override
    public void convert(File inputFile, File outputFile) throws IOException {
        BufferedImage image = ImageIO.read(inputFile);
        ImageIO.write(image, format, outputFile);
    }
}

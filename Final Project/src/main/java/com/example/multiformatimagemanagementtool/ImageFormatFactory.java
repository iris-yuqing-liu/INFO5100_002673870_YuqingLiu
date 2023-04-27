package com.example.multiformatimagemanagementtool;


// A factory class for creating ImageFormat instances based on a given format string
public class ImageFormatFactory {
    // This method creates and returns an ImageFormat instance based on the given format string
    public static ImageFormat create(String format) {
        switch (format.toLowerCase()) {
            case "jpg":
            case "jpeg":
                return new JPEGImage();
            case "png":
                return new PNGImage();
            case "bmp":
                return new BMPImage();
            case "gif":
                return new GIFImage();
            default:
                throw new IllegalArgumentException("Unsupported format: " + format);
        }
    }
}

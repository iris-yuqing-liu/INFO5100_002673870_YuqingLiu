package com.example.multiformatimagemanagementtool;
import java.io.File;
import java.io.IOException;

// An interface representing different image formats
public interface ImageFormat {

    // A method for converting an input image file to this format and writing the result to an output file
    void convert(File inputFile, File outputFile) throws IOException;
}

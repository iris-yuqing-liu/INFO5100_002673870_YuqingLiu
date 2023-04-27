# Multi-Format Image Management Tool

The Multi-Format Image Management Tool is a JavaFX application that enables users to select an image, convert it to different formats (JPEG, PNG, BMP, GIF), and save the converted image. The user interface is designed using JavaFX's FXML.

## Structure

The project consists of the following Java classes and FXML file:

- `Main.java`: The main class that starts the application.
- `Controller.java`: The controller class responsible for handling user interactions and managing the application's state.
- `ImageFormat.java`: An interface representing different image formats.
- `BaseImageFormat.java`: An abstract base class for different image formats that provides common functionality.
- `JPEGImage.java`, `PNGImage.java`, `BMPImage.java`, `GIFImage.java`: Specific image format classes that  from `BaseImageFormat`.
- `ImageFormatFactory.java`: A factory class for creating `ImageFormat` instances based on a given format string.
- `main.fxml`: The FXML file that defines the user interface layout for the application.

## Usage

To run the application, execute the `main` method in the `Main.java` class. The main window of the Multi-Format Image Management Tool will be displayed, allowing you to select an image, choose a format, convert the image, and save the converted image.

## Requirements

* Java 11 or higher
* JavaFX 11 or higher

## License

This project is licensed under the [MIT License](LICENSE.md).

## Contributor
Zhenhai Peng: Write major features class`Controller.java`, interface, abstract base class and inherit class to implement the major functions of the image format conversion tool.

Yuqing Liu: Write `main.fxml` and `Main.java` to implement the user interface of the image format conversion tool, Write comments to the code to increase the readability of the code, test the code run and update it.



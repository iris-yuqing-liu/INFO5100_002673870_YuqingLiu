package com.example.multiformatimagemanagementtool;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.IOException;

public class Controller {

    @FXML
    private ImageView imageView;

    @FXML
    private Label imageProperties;

    @FXML
    private ComboBox<String> formatComboBox;

    @FXML
    public void initialize() {
        formatComboBox.getItems().addAll("JPEG", "PNG", "BMP", "GIF");
        formatComboBox.getSelectionModel().selectFirst();
    }


    private File selectedImageFile;
    @FXML
    public void selectImage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.bmp", "*.gif")
        );
        File selectedFile = fileChooser.showOpenDialog(imageView.getScene().getWindow());
        if (selectedFile != null) {
            selectedImageFile = selectedFile; // Store the selected file
            Image image = new Image(selectedFile.toURI().toString());
            imageView.setImage(image);
            imageProperties.setText(String.format("Width: %.0f, Height: %.0f", image.getWidth(), image.getHeight()));
        }
    }

    private File convertedImageFile;
    @FXML
    public void convertImage() {
        if (imageView.getImage() == null) {
            System.out.println("Please select an image first.");
            return;
        }
        try {
            File inputFile = selectedImageFile;
            String outputFormat = formatComboBox.getValue().toLowerCase();
            String outputFileExtension = outputFormat;
            convertedImageFile = new File(inputFile.getParent(), "converted_" + inputFile.getName().split("\\.")[0] + "." + outputFileExtension);
            ImageConverter.convert(inputFile, convertedImageFile, outputFormat);
            System.out.println("Image converted successfully.");
        } catch (IOException e) {
            System.out.println("Image conversion failed.");
            e.printStackTrace();
        }
    }

    @FXML
    public void saveImage() {
        if (convertedImageFile == null || !convertedImageFile.exists()) {
            System.out.println("Please convert an image first.");
            return;
        }
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Image");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*." + formatComboBox.getValue().toLowerCase())
        );
        fileChooser.setInitialFileName(convertedImageFile.getName());
        File saveFile = fileChooser.showSaveDialog(imageView.getScene().getWindow());
        if (saveFile != null) {
            convertedImageFile.renameTo(saveFile);
            System.out.println("Image saved successfully.");
        }
    }
}

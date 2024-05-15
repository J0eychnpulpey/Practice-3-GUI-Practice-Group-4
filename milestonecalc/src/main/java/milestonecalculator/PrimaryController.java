package milestonecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML // This annotation is used to inject the FXML fields into the controller
    private TextField milestone1Field;
    @FXML
    private TextField milestone2Field;
    @FXML
    private TextField terminalField;
    @FXML
    private Label resultLabel; 

    @FXML
    private void calculateGrade() { // This method is called when the button is clicked
        try {
            double milestone1 = Double.parseDouble(milestone1Field.getText());
            double milestone2 = Double.parseDouble(milestone2Field.getText());
            double terminal = Double.parseDouble(terminalField.getText());

            if (milestone1 < 0 || milestone1 > 25 || milestone2 < 0 || milestone2 > 40 || terminal < 0 || terminal > 35) { // functions 
                throw new IllegalArgumentException("Invalid input values");
            }

            double totalGrade = milestone1 + milestone2 + terminal; // This is the formula for the total grade
            resultLabel.setText("Total Grade: " + totalGrade);

        } catch (NumberFormatException e) { // This is the exception handling for invalid input
            showAlert("Invalid Input", "Please enter valid numbers.");
        } catch (IllegalArgumentException e) {
            showAlert("Invalid Input", e.getMessage());
        }
    }

    @FXML
    private void showAbout() { // This method is called when the about button is clicked
        showAlert("About", "This is from HOMEWORK #3: GUI Practice of IT103 Programming 2 made by Group 4 from MMDC. by:  John Paul P... Eliakim S... El Chad C... Emersson A... Nesty L...");
    }

    private void showAlert(String title, String content) { // This method is used to show an alert dialog
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

package javafxapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class mainController {

    // FXML fields
    @FXML
    private TextField usernameUsernameField;

    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button cancelButton;

    // Initialize method to set up any initial configurations
    @FXML
    public void initialize() {
        // Optionally, add any initialization code here (e.g., add listeners)
    }

    // Action handler for loginButton
    @FXML
    private void handleLogin() {
        String username = usernameUsernameField.getText();
        String password = passwordPasswordField.getText();

        // Simple validation logic (can be replaced with your logic)
        if (username.isEmpty() || password.isEmpty()) {
            showAlert(AlertType.ERROR, "Login Error", "Please enter both username and password.");
        } else {
            // Handle successful login (e.g., compare with database or hardcoded values)
            if (validateLogin(username, password)) {
                showAlert(AlertType.INFORMATION, "Login Success", "Welcome, " + username + "!");
            } else {
                showAlert(AlertType.ERROR, "Login Failed", "Invalid username or password.");
            }
        }
    }

    // Action handler for cancelButton
    @FXML
    private void handleCancel() {
        // Clear the input fields when "Cancel" is pressed
        usernameUsernameField.clear();
        passwordPasswordField.clear();
    }

    // Method to simulate login validation
    private boolean validateLogin(String username, String password) {
        // Replace this with your actual authentication logic
        return "admin".equals(username) && "password123".equals(password);
    }

    // Utility method to show alert messages
    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
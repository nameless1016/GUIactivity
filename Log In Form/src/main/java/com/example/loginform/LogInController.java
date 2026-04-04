package com.example.loginform;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;

import java.io.IOException;

public class LogInController {
    private String username = "admin";
    private String password = "admin";

    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button loginButton;

    @FXML
    protected void onLogInButtonClicked() {
        if (usernameTextField.getText().equals(username) && passwordTextField.getText().equals(password)) {
            showStatusDialog("Login Successful!");
        } else {
            showStatusDialog("Login Failed!");
        }
    }

    private void showStatusDialog(String message) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("statusDialog.fxml"));
            DialogPane rootPane = loader.load();

            Label label = (Label) rootPane.lookup("#messageLabel");
            label.setText(message);

            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.setDialogPane(rootPane);

            if (rootPane.getButtonTypes().isEmpty()) {
                rootPane.getButtonTypes().add(ButtonType.OK);
            }

            dialog.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

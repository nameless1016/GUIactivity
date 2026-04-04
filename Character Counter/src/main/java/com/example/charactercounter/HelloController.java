package com.example.charactercounter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private TextField characterTextField;
    @FXML
    private TextArea messageTextArea;
    @FXML
    private Button countButton;
    @FXML
    private Label countLabel;

    @FXML
    protected void setCountButtonClick() {
        int count = 0;
        String messsage = messageTextArea.getText();
        char comp = characterTextField.getText().charAt(0);
        for(int i = 0; i < messsage.length(); i++) {
            if(messsage.charAt(i) == comp) {
                count++;
            }
        }

        countLabel.setText("Count:\t" + String.valueOf(count));
    }
}

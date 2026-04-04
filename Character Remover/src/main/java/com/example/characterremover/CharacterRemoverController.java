package com.example.characterremover;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import javax.swing.*;
import java.awt.*;

public class CharacterRemoverController {
    @FXML
    private Label textLabel;
    private final String defaultText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    @FXML
    private CheckBox vowelCheckbox;
    @FXML
    private CheckBox consonantCheckbox;
    @FXML
    private CheckBox numberCheckbox;



    @FXML
    private void initialize() {
        textLabel.setText(defaultText);
    }

    @FXML
    protected void onRemoveButtonClicked(){
        String text = textLabel.getText();

        if(vowelCheckbox.isSelected()){
            text = removeVowels(text);
        }
        if(consonantCheckbox.isSelected()){
            text = removeConsonants(text);
        }
        if(numberCheckbox.isSelected()){
            text = removeNumbers(text);
        }

        textLabel.setText(text);
    }

    @FXML
    protected void onRestoreButtonClicked(){
        textLabel.setText(defaultText);
    }
    private boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    private boolean isConsonant(char ch){
        ch = Character.toLowerCase(ch);
        return !isVowel(ch) && Character.isLetter(ch) ;
    }
    private String removeConsonants(String mes){
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < mes.length(); i++){
            if(!isConsonant(mes.charAt(i))){
                sb.append(mes.charAt(i));
            }
        }
        return sb.toString();
    }

    private String removeVowels(String mes){
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < mes.length(); i++){
            if(!isVowel(mes.charAt(i))){
                sb.append(mes.charAt(i));
            }
        }
        return sb.toString();
    }

    private String removeNumbers(String mes){
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < mes.length(); i++){
            if(!Character.isDigit(mes.charAt(i))){
                sb.append(mes.charAt(i));
            }
        }
        return sb.toString();
    }
}

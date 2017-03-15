package com.ciro.app.controller;

import com.ciro.app.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class MainController {
    private Main main;
    //Views
    @FXML
    Region region;
    @FXML
    Button okButton,cancelButton;
    @FXML
    TextField firstNameField,lastNameField,emailField;
    @FXML
    Label titleLabel,firstNameLabel,lastNameLabel,emailLabel;

    public void setMain(Main main) {
        this.main = main;
    }

    public void handleOk(){
        System.out.println("okay");
        firstNameField.setId("textField");
        lastNameField.setId("textField");
        emailField.setId("textField");
    }

    public void handleCancel(){
        System.out.println("cancel");
    }
}

package com.example.uichat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class HelloController {

    @FXML
    private AnchorPane AP;

    @FXML
    private ScrollPane SP;
    //SP.setVvalue(1.0);


    @FXML
    private TextFlow TFlow;

    @FXML
    private TextField textField;

    @FXML
    private Button button;

    @FXML
    void endMessage(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER) {
            button.fire();
        }
    }

    @FXML
    void writeMes(ActionEvent event) {
        Text text;
        if(TFlow.getChildren().size()==0){
            text = new Text(textField.getText());
        } else {
            // Add new line if not the first child
            text = new Text("\n" + textField.getText());
        }
        TFlow.getChildren().add(text);
        textField.clear();
        textField.requestFocus();
        if (SP.getVvalue() != 1.0) {
            SP.setVvalue(1.0);
        }
    }


}

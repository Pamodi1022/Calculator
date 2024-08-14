package com.iit.calculators;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField txtDisplay;
    Double numberOne;
    Double numberTwo;
    String operator;

    @FXML
    protected void onButtonClick(ActionEvent event) {
        String newText = ((Button)event.getSource()).getText();
        String text = txtDisplay.getText();
        txtDisplay.setText(text + newText);
    }

    @FXML
    protected void onGenButtonClick(ActionEvent event) {
        operator = ((Button)event.getSource()).getText();
        System.out.println(operator);
        switch(operator){
            case "AC" :
                txtDisplay.setText("");
                break;
            case "+" :
                numberOne = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                break;
            default:
                numberOne = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                break;
        }
    }

    @FXML
    protected void onPeriodButtonClick(ActionEvent event) {
        String newText = ((Button) event.getSource()).getText();
        String text = txtDisplay.getText();
        if (!text.contains(".")) {
            txtDisplay.setText(text + newText);
        }
    }

    @FXML
    protected void onButtonEqual(ActionEvent event) {
        numberTwo = Double.parseDouble(txtDisplay.getText());
        switch (operator){
            case"+":
                txtDisplay.setText(Double.toString(numberOne + numberTwo));
                break;
            case"-":
                txtDisplay.setText(Double.toString(numberOne - numberTwo));
                break;
            case"*":
                txtDisplay.setText(Double.toString(numberOne * numberTwo));
                break;
            case"/":
                txtDisplay.setText(Double.toString(numberOne / numberTwo));
                break;
        }
    }
}
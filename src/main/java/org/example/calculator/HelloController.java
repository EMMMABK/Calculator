package org.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    Calculator calc = new Calculator();

    @FXML
    private TextField text;

    @FXML
    private void onClickButton1(){
        String val = text.getText();
        val = val + "1";
        text.setText(val);
    }

    private void onClickButton2(){
        String val = text.getText();
        val = val + "2";
        text.setText(val);
    }

    private void onClickButton3(){
        String val = text.getText();
        val = val + "3";
        text.setText(val);
    }

    private void onClickButton4(){
        String val = text.getText();
        val = val + "4";
        text.setText(val);
    }

    private void onClickButton5(){
        String val = text.getText();
        val = val + "5";
        text.setText(val);
    }

    private void onClickButton6(){
        String val = text.getText();
        val = val + "6";
        text.setText(val);
    }

    private void onClickButton7(){
        String val = text.getText();
        val = val + "7";
        text.setText(val);
    }

    private void onClickButton8(){
        String val = text.getText();
        val = val + "8";
        text.setText(val);
    }

    private void onClickButton9(){
        String val = text.getText();
        val = val + "9";
        text.setText(val);
    }

    private void onClickButton0(){
        String val = text.getText();
        val = val + "0";
        text.setText(val);
    }

    private void onClickButtonPoint(){
        String val = text.getText();
        val = val + ".";
        text.setText(val);
    }


}
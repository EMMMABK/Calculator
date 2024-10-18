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

    @FXML
    private void onPlusClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1(Double.parseDouble(op1));
        calc.setOperator('+');
    }

    @FXML
    private void onMinusClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1(Double.parseDouble(op1));
        calc.setOperator('-');
    }

    @FXML
    private void onMultiplyClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1(Double.parseDouble(op1));
        calc.setOperator('*');
    }

    @FXML
    private void onDivideClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1(Double.parseDouble(op1));
        calc.setOperator('/');
    }

    @FXML
    private void onResetClick(){
        calc.reset();
    }

    @FXML
    private void onEqualClick(){
        String op2 = text.getText();
        calc.setOp2(Double.parseDouble(op2));
        calc.calculate();
        text.setText("" + calc.getResult());
    }
}
package org.example.calculator;

public class Calculator {
    private double op1;
    private double op2;
    private char operator;
    private double result;

    public void calculate(){
        if(this.operator == '+'){
            this.result = this.op1 + this.op2;
        } else if (this.operator == '-') {
            this.result = this.op1 - this.op2;
        } else if (this.operator == '*') {
            this.result = this.op1 * this.op2;
        } else if (this.operator == '/') {
            this.result = this.op1 / this.op2;
        }
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1){
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2){
        this.op2 = op2;
    }

    public char getOperator(){
        return operator;
    }

    public void setOperator(char operator){
        this.operator = operator;
    }

    public double getResult(){
        return result;
    }

    public void setResult(double result){
        this.result = result;
    }
}

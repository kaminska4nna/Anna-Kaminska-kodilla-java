package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main (String [] args){

        Calculator calculator = new Calculator();
        int additionResult = calculator.addition(3,3);
        int substractionResult = calculator.subtraction(6,3);

        if (additionResult == 6){
            System.out.println("Adding is ok !");
        }else {
            System.out.println("Adding is not ok !");
        }

        if (substractionResult==3){
            System.out.println("Substracting works fine !");
        }else{
            System.out.println("There is something wrong with substracting!");
        }

    }
}

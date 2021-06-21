package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstValue;
	    double secondValue;
	    double answer;

	    firstValue = 22;
	    secondValue = 7;
	    answer = 0;

	    String operator = "*";


        System.out.println(doArithmetic(firstValue, secondValue, operator));
    }

    public static double doArithmetic(double firstNumber, double secondNumber, String operator) {
        double answer;
        answer =0;
        switch (operator) {
            case "+":
                answer = firstNumber + secondNumber;
                return answer;
            case "-":
                answer = firstNumber - secondNumber;
                return answer;
            case "*":
                answer = firstNumber * secondNumber;
                return answer;
            case "/":
                answer = firstNumber / secondNumber;
                return answer;
            default:
                System.out.println("Enter a valid operator");
                break;
        }
        return answer;
    }
// Create a method that checks two numbers and uses a switch to return max and min

}

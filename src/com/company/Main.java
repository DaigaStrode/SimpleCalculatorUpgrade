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
	    String operation = "f";


//        System.out.println(doArithmetic(firstValue, secondValue, operator));
          System.out.println(doMinOrMax(firstValue, secondValue, operation));
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

    public static double doMinOrMax(double firstValue, double secondValue, String operation) {
        double answer;
        answer =0;
        switch (operation) {
            case "min":
                System.out.println(Math.min(firstValue, secondValue));
                break;
            case "max":
                System.out.println(Math.max(firstValue, secondValue));
                break;
            default:
                System.out.println("Enter a valid operation");
                break;
        }
        return answer;


    }
}

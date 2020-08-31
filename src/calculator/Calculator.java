package calculator;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("--------CALCULATOR----------");
        System.out.println("Please enter 2 int numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("Choose an operation(+,-,*,/,%) : ");
        char operator = input.next().charAt(0);
        double result = 0.0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;

            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
            default :
                System.out.println("Invalid operator");
                    return;

        }
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}

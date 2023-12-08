package minggu5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double operand1, operand2, result;
        char operator;
        Scanner input05 = new Scanner(System.in);
        System.out.print("Input operand 1: ");
        operand1 = input05.nextDouble();
        System.out.print("Input operand 2: ");
        operand2 = input05.nextDouble();
        System.out.print("Input operator (+ - * /): ");
        operator = input05.next().charAt(0);

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + "=" + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + "=" + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + "=" + result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + "=" + result);
                break;
        }
    }
}

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        double num1, num2, result;
        System.out.println("enter 1st numbers");
        num1 = input.nextDouble();
        System.out.println("Enter the operators + , *, -, /");
        operator = input.next().charAt(0);
        System.out.println("enter 2st numbers");
        num2 = input.nextDouble();
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum is " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("divisible by 0 is not possible");
                    break;
                } else {
                    result = num1 / num2;
                    System.out.println("The result is " + result);
                    break;
                }
            case '*':
                result = num1 * num2;
                System.out.println("The product is " + result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}

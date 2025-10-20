import java.util.*;

public class MiniCalculator{
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);

        System.out.println("Enter in the first number: ");
        double num1 = user.nextDouble();

        System.out.println("Enter in your next operator(+, -, *, /): ");
        char operator = user.next().charAt(0);

        System.out.println("Enter in the second number: ");
        double num2 = user.nextDouble();

        double result;

        switch(operator){
            case '+':
            result = num1 + num2;
            break;

            case '-':
            result = num1 - num2;
            break;

            case '*':
            result = num1 * num2;
            break;

            case'/':
            if( num2 != 0){
                result = num1/ num2;
            }else{
                System.err.println("Error, numbers can't be divisble if one is 0");
                return;
            }
            break;
            default:
                System.out.println("Invalid operator selected");
                return;
        }

        System.out.println("The result is: " +result);

    }
}
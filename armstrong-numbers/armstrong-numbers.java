/*An Armstrong number is a whole number that's equal to the sum of its digits raised to the power of the total number of digits (i.e. 153, 8208). Create an Armstrong number checker that returns a Boolean TRUE if the input number is an Armstrong number.*/

import java.lang.Math;
import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String []args) {

        //declare and initialize scanner
        Scanner inputNumberScanner = new Scanner(System.in);

        //number (int) input
        System.out.println("Enter the number: ");
        int inputNumber = inputNumberScanner.nextInt();

        //print out the result
        System.out.println("Is " + inputNumber + " an Armstrong number? " + armstrongNumberChecker(inputNumber));
        
        //close scanner
        inputNumberScanner.close();
    }
    
    static boolean armstrongNumberChecker(int value) {
        int number = value;
        
        //check the number of digits for the given value
        int length = (int)(Math.log10(value)+1);
        
        //a single digit extracted from value by the loop below
        int digit;
        
        //the sum of digits raised to a power of number of digits
        int result = 0;
        
        //extracting digits using modulo, checking if the Armstrong number condition is met
        while (number > 0) {
            digit = (int)Math.pow(number % 10, length);
            number = number / 10;
            result = result + digit;
        }
        
        //return true if 'value' is an Armstrong number. 
        //If the input value is '0' return false due to forbidden mathematical operation (zero to the power of zero is a mathematical expression with no agreed-upon value).
        if (value == result && value != 0) {
            return true;
        } else {
            return false;
        }
    }
}

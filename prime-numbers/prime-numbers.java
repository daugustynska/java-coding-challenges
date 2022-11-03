/* A prime number is any whole number greater than 1 whose only factors are 1 and itself. For example, 7 is a prime number because it's only divisible by 1 and 7.
Create a function that returns TRUE if an input number is prime. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, and 19. */

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String []args) {

        //declare and initialize scanner
        Scanner inputNumberScanner = new Scanner(System.in);

        //number (int) input
        System.out.println("Enter the number: ");
        int inputNumber = inputNumberScanner.nextInt();

        //call the function to calculate if the input number is a prime number
        boolean isPrime = isPrimeNumber(inputNumber);

        //print the answear
        System.out.println("Is " + inputNumber + " a prime number? " + isPrime);

        //close scanner
        inputNumberScanner.close();
    }

    //define the function to calculate if the given number is a prime number
    static boolean isPrimeNumber(int number) {
        boolean result = false;

        for(int i=2; i<number; i++) {
            if(number%i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}

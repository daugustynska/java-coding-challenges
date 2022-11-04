/* The prime factors of a number are all of the integers below that number that are divisible into the number as well as 1. For example, the prime factors of 12 are 1, 2, 3, 4, 6, and 12. Create a prime factorization calculator for any number. */

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String []args) {

        //declare and initialize scanner
        Scanner inputNumberScanner = new Scanner(System.in);

        //number (int) input
        System.out.println("Enter a number: ");
        int inputNumber = inputNumberScanner.nextInt();

        //call the function to calculate and print prime factors
        findPrimeFactors(inputNumber);

        //close scanner
        inputNumberScanner.close();
    }

    //define the function to calculate and print prime factors
    static void findPrimeFactors(int number) {
        System.out.println("Prime factors of " + number + " are:");

        for(int i=1; i<=number; i++) {
            if(number%i == 0) {
                System.out.print(i +  ", ");
            }
        }
    }
}

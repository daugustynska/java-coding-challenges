/*PART 1: For a given input number, return the number in reverse. So, an input of 3956 should return 6593.
PART 2: Reverse a decimal number. The decimal point should stay in the same place. So, the number 193.56 should output 653.91.*/

public class NumberReversal {

    public static void main(String []args) {

        //PART 1
        System.out.println("PART 1:");

        //input integer
        int intNumber = 123456789;

        //reversing number using modulo and printing out the result
        while (intNumber > 0) {
            System.out.print(intNumber % 10);
            intNumber = intNumber / 10;
        }

        //PART 2
        System.out.println("\nPART 2:");

        //input double
        double doubleNumber = 12345.6789;
        
        //split double into two numbers
        String string = Double.toString(doubleNumber);
        String stringArray[] = string.split("\\.");

        //reversing numbers separately, printing result
        for (int i=0; i<2; i++) {
            int number = Integer.parseInt(stringArray[i]);
            while (number > 0) {
                System.out.print(number % 10);
                number = number / 10;
            }
            if(i == 0) {
                System.out.print(".");
            };
        }
    }
}

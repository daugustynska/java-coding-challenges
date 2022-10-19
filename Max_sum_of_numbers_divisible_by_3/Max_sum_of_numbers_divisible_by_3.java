/*Code that as an input accepts an array consisting of three numbers (integers). 
The code change these numbers to meet the following requirements: 
1. Each number should be divisible by three. 
2. Sum of all three numbers should be as large as possible. 
Changing a number means increasing (decreasing is not allowed) any of its digits. 
Increasing a digit by one means one change, that is increasing a digit by five would mean five changes. 
One can perform up to six changes in total for all three numbers. */

import java.util.*;

public class MaxSumOfThreeNumbers {
    public static void main(String[] args) {

        int[] array = new int[3];
        int changedNumbersCounter = 0;

        //reading array elements from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<3; i++) {
            array[i]=sc.nextInt();
        }

        //check if the number is divisible by 3?
        for (int i=0; i<3; i++) {
            while (array[i]%3 != 0) {

                //splitting number into digits
                String string = Integer.toString(array[i]);
                int[] digits = new int[string.length()];

                for(int j=0; j<string.length(); ++j) {
                    digits[j] = Integer.parseInt(string.substring(j, j+1));
                }

                //check if a digit is equal to 9.
                //if the first digit is 9 move to the next digit, etc.
                int n=0;
                while(digits[n] == 9 && n<string.length()) {
                    n++;
                }

                //changing digits
                digits[n] = digits[n] + 1;
                //updating the change counter
                ++changedNumbersCounter;

                //assembling a number from digits, setting the new value of the element
                array[i] = 0;
                for(int k=0; k<digits.length; k++) {
                    array[i]=array[i]*10+digits[k];
                }
                System.out.println("Element " + i +  " changed (+1): " + array[i]);
            }
            
            //setting the limit of changes to six, then break.
            /*  this part is not necessary if the array is limited to 3 elements. Each element can be changed up to 2 times to get a number divisible by 3, thus the total number of changes done will never exceed 6.*/
            if (changedNumbersCounter == 6) {
                break;
            }
        }

        // printing array elements to console
        System.out.println("Array elements are now: ");
        for (int i=0; i<3; i++) {
            System.out.print(array[i] + ", ");
        }
        //printing number of changes done
        System.out.println("Total number of changes done: " + changedNumbersCounter);
    }
}

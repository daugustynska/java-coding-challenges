/* For a given input array of numbers, find the two that result in the largest product. The output should include the two numbers in the array along with their product. */

import java.util.Arrays;

public class ProductMaximizer {
    public static void main(String []args) {

        //input the elements of array
        int[] inputArray = {0, 3, 9, -5, 10, -12};

        //call the function to calculate two numbers with max product; print the answer to console
        System.out.println(Arrays.toString(findNumbersMaxProduct(inputArray)));
    }

    static int[] findNumbersMaxProduct (int[] array) {
        
        //calculated product
        int result = 0;
        //2-element array to return the answer
        int[] resultArray = new int[2];

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                if (array[i] * array[j] > result && array[i] != array[j]) {
                    //if the result is greater than previous pass of the loop, write numbers to resultArray
                    result = array[i] * array[j];
                    resultArray[0] = array[i];
                    resultArray[1] = array[j];
                }
            }
        }
        return resultArray;
    }
}

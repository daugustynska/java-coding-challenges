/*Word reversal
The input is a string of words, and the output should be the words in reverse but with the letters in the original order. For example, the string "Dog bites man" should output as "man bites Dog."
Add sentence capitalization and to the code. The string "Codecademy is the best" should output as "Best the is Codecademy".*/
import java.util.*;

public class WordReversal {

    public static void main(String []args) {
        //input sentence
        String stringInput = "Woman feed duck";
        //split words and convert to an array
        String[] array = stringInput.split(" ");

        StringBuffer sb = new StringBuffer();

        //write words in reversed order
        for(int i=array.length-1; i>=0; i--) {
            sb.append(array[i] + " ");
        }

        //set words back to single string
        String stringOutput = sb.toString();

        //capitalize the first letter
        stringOutput = Character.toUpperCase(stringOutput.charAt(0)) + stringOutput.substring(1);

        //print the output
        System.out.println(stringOutput);
    }
}

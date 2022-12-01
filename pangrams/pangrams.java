/* A pangram is a sentence that contains all 26 letters of the English alphabet. One of the most well-known examples of a pangram is, "The quick brown fox jumps over the lazy dog." Create a pangram checker that returns a Boolean TRUE if an input string is a pangram and FALSE if it isn't. */

import java.util.*;

public class Pangrams {

    public static void main(String []args) {

        //input sentence to check
        String sentence = "The quick brown fox jumps over the lazy dog";

        //remove spaces, all letters to lower case
        sentence = sentence.replaceAll("\\s", "").toLowerCase();

        //split words and convert to an array
        String[] arraySentence = sentence.split("");

        //call fun isPangram
        boolean isPangram = isPangram(arraySentence);

        //print the answer
        System.out.println(isPangram);
    }

    static boolean isPangram(String[] array) {

        String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        boolean result = false;

        //compare the input array with alphabet array elements
        for (int i=0; i<alphabet.length; i++) {
            for (int j=0; j<array.length; j++) {
                if (alphabet[i].compareTo(array[j]) == 0) {
                    result = false;
                } else {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

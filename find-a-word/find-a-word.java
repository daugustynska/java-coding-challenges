/* Starting with an input string of words, find the second-to-last word of the string. 
For example, an input of "I love Codecademy" should return "love."
Allow for a second numerical input, n, that results in returning the nth word of a string. 
So, for the string "I can program in Java" and n = 3, the output should be the third word, "program". */
import java.util.*;

public class FindTheWord{

     public static void main(String []args){
         
        String sentence;
        int n = 0;
        
        //declare and initialize scanners
        Scanner sentenceScanner = new Scanner(System.in);
        Scanner nScanner = new Scanner(System.in);
        
        //sentence (string) input
        System.out.println("Enter the sentence: ");
        sentence = sentenceScanner.nextLine();
        
        //number of the word input
        System.out.println("Number of the word: ");
        n = nScanner.nextInt();
        
        //split words and convert to an array
        String[] array = sentence.split(" ");
        
        //print the word
        System.out.println(array[n - 1]);
        
        sentenceScanner.close();
        nScanner.close();
     }
}

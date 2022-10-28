/* For a given input string, return a Boolean TRUE if the string starts with a given input word.
So, for an input string of "hello world" and input word "hello," the program should return TRUE.
For a more advanced word searcher, create a program that returns the number of times a word appears in an input string.
For example, given an input word "new" and an input string "I'm the new newt," the program should return a value of 2.*/
import java.util.*;

public class WordSearch {

    public static void main(String []args) {

        //declare and initialize scanners
        Scanner sentenceScanner = new Scanner(System.in);
        Scanner firstWordScanner = new Scanner(System.in);

        //sentence (string) input
        System.out.println("Enter the sentence: ");
        String sentence = sentenceScanner.nextLine();

        //number of the word input
        System.out.println("Enter first word: ");
        String firstWord = firstWordScanner.nextLine();

        //split words and convert to an array
        String[] array = sentence.split(" ");

        //comparing first word from the sentence with the given input word. Printing result.
        System.out.println("Is the first word \"" + firstWord + "\"? " + firstWord.equals(array[0]));

        //counting how many times given word occured in the sentence
        int counter = 0;
        for(int n=0; n<array.length; n++) {
            if (array[n].contains(firstWord)) {
                counter++;
            }
        }
        System.out.println("The word \"" + firstWord + "\" occured " + counter + " times.");

        //closing scanners
        sentenceScanner.close();
        firstWordScanner.close();
    }
}

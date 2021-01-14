package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Integer theSum = ArrayListPractice.sumAllEvenValues(numbersToSum);
        System.out.println("The sum is: " + theSum.toString());

        ArrayPractice arrayPractice = new ArrayPractice(); //because splitAGivenString is not static we can't call it directly from class but have to create an instance
        String[] returnedWords = arrayPractice.splitAGivenString();

        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));
        System.out.println("What word length are you looking for:");
        Integer searchLength = ArrayListPractice.getUserSearchInput();
        ArrayListPractice.printWordsWithFiveLetters(wordsToSearch, searchLength);
    }

    public static Integer getUserSearchInput(){
        Scanner scanner = new Scanner(System.in);
        Integer myUsersInt = scanner.nextInt();
        scanner.close();
        return myUsersInt;
    }
    public static void printWordsWithFiveLetters(ArrayList<String> words, Integer searchLength) {
        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList("Dog", "Horse", "Cat"));
        for (int i = 0; i< words.size(); i++){
            if (words.get(i).length() == searchLength) {
            System.out.println(words.get(i));
            }
        }
    }
    public static Integer sumAllEvenValues(ArrayList<Integer> valuesToSum){
        Integer sum = 0; // sum initialized to 0 to remember
        for (int i = 0; i < valuesToSum.size(); i++) {
         if (valuesToSum.get(i) % 2 == 0){
             sum = sum + valuesToSum.get(i);
             //another way to do line 43: sum += valuesToSum.get(i)
            }
        }
        return sum;
    }
}

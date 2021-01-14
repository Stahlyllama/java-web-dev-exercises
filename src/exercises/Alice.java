package exercises;

import java.util.Scanner;

    public class Alice {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String stringToSearch = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                    "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                    "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                    "'without pictures or conversation?";

            String newSentence;

            System.out.println("Enter a word to search: ");
            String searchTerm = input.nextLine().toLowerCase();

            while (!searchTerm.equals("exit")) {
                if (stringToSearch.toLowerCase().contains(searchTerm)) {
                    System.out.println(stringToSearch.toLowerCase().indexOf(searchTerm));
                    System.out.println(searchTerm.length());
                    newSentence = stringToSearch.toLowerCase().replaceFirst(searchTerm, "");
                    System.out.println(newSentence);
                } else {
                    System.out.println("false");
                }
                System.out.println("Enter a word to search: ");
                searchTerm = input.nextLine().toLowerCase();
            }
        }
    }
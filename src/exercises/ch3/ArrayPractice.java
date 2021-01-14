package exercises.ch3;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printOddNumbers();
        arrayPractice.splitAGivenString();
        arrayPractice.splitAGivenStringIntoSentences();
    }
    public void printOddNumbers() {
        //1,1,2,3,5,8
        int[] myArrayOfInts = {1, 1, 2, 3, 5, 8}; //when we need to directly initialize an array in the future - we do it providing the curly brackets and pasting in values

        for (int myArrayOfInt : myArrayOfInts) {
            if (myArrayOfInt % 2 == 1) {
                System.out.println(myArrayOfInt);
            }
        }
    }
    public String[] splitAGivenString(){
        String myProvidedString =  "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] mySplitStrings = myProvidedString.split(" ");
        System.out.println(Arrays.toString(mySplitStrings));
        return mySplitStrings;
    }
    public void splitAGivenStringIntoSentences(){
        String myProvidedString =  "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] mySplitStrings = myProvidedString.split("\\.");
        System.out.println(Arrays.toString(mySplitStrings));
    }
}
package org.launchcode.java.studios.ch7_funWithQuizzes.main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What sounds does a dog make? \nA: Bark Bark \nB: Meow Meow  \nPlease just type a single letter response", "a");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckBoxQuestion myCheckboxQuestion = new CheckBoxQuestion("Select all that apply:  Which animals fly? \nA: Pigs \nB: Crows \nC: Owls", "B,C");
        myQuiz.addQuestion(myCheckboxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion ("  Dogs are omnivores \n True or Fasle", "True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();
    }
}

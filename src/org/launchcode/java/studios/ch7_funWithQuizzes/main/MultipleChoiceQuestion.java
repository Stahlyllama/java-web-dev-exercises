package org.launchcode.java.studios.ch7_funWithQuizzes.main;

public class MultipleChoiceQuestion extends Question {

    //class variables

    //constructor

    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }


    //methods
    @Override
    public boolean checkAnswer(String answer) {
        //answer = "A" or "B"

        String actualAnswer = this.getTheAnswer();
        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}

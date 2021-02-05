package org.launchcode.java.studios.ch7_funWithQuizzes.main;

public class TrueFalseQuestion extends Question {

    //class variables

    //constructors
    public TrueFalseQuestion (String question, String answer) {
        super(question, answer);
        }

    //methods
    @Override
        public boolean checkAnswer(String answer) {
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())){
            return true;
        }else {
            return false;//answer = "true" or "false"
        }

    }

}

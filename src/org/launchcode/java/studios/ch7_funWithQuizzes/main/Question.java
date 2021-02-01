package org.launchcode.java.studios.ch7_funWithQuizzes.main;

public abstract class Question {

//class variables
    private final String theQuestion;
    private final String theAnswer;

//Constructors
    public Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }

//Methods - Getters and Setters
    public String getTheQuestion() { return this.theQuestion; }
    public String getTheAnswer() { return this.theAnswer; }

//Other Methods
        public abstract boolean checkAnswer(String answer);
    }








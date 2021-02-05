package org.launchcode.java.studios.ch7_funWithQuizzes.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    //Class Variables - We need a container that will store questions and we don't have a set amount since we can add / remove questions as we go.
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner (System.in);

    //Constructor
    public Quiz(){

    }

    //Methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz(){
        //Loop through each question
        for (Question question: questions){
            //Ask user the q
            System.out.println(question.getTheQuestion());
            //get the users answer
            String usersAnswer = this.getUsersAnswers();
            //check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            //increment number of Questions Correct if answered correctly
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }

    //Grade the Quiz
        double percentageCorrect = ((double)this.numberOfQuestionsCorrect / (double)this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");
        }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
            return usersAnswer;
    }
}

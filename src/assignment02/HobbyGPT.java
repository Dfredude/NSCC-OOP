package assignment02;

import javax.swing.*;

public class HobbyGPT {
  private static int correctAnswers = 0;
  private static int incorrectAnswers = 0;

  public static void main(String[] args) {
    String[] questions = {
      "What is your favorite hobby?",
      "What is your favorite movie genre?",
      "What is your favorite type of music?",
      "What is your favorite type of food?",
      "What is your favorite outdoor activity?"
    };

    String[][] options = {
      {"Reading", "Music", "Sports", "Traveling"},
      {"Comedy", "Drama", "Action", "Horror"},
      {"Rock", "Pop", "Classical", "Jazz"},
      {"Mexican", "Italian", "Chinese", "Indian"},
      {"Hiking", "Swimming", "Biking", "Camping"}
    };

    int[] answers = {1, 2, 0, 3, 3};

    for (int i = 0; i < questions.length; i++) {
      int userAnswer = JOptionPane.showOptionDialog(
        null,
        questions[i],
        "Question " + (i + 1),
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options[i],
        options[i][0]
      );

      if (userAnswer == answers[i]) {
        JOptionPane.showMessageDialog(null, "Correct!");
        correctAnswers++;
      } else {
        JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is: " + options[i][answers[i]]);
        incorrectAnswers++;
      }
    }

    int totalQuestions = questions.length;
    int totalCorrect = correctAnswers;
    int totalIncorrect = incorrectAnswers;
    double percentageCorrect = (double) totalCorrect / totalQuestions * 100;

    JOptionPane.showMessageDialog(
      null,
      "You got " + totalCorrect + " out of " + totalQuestions + " questions correct.\n" +
      "Percentage Correct: " + percentageCorrect + "%"
    );
  }
}

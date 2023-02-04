package assignment02;
/* 
• The quiz should contain at least five questions about a hobby or any other personal interest. 
• Each question should be a multiple-choice question with at least four answer options.
• When the user answers the question correctly, display a congratulatory message.
• If the user responds to a question incorrectly, display an appropriate message as well as the correct answer.
• At the end of the quiz, display the number of correct and incorrect answers, and the percentage of correct answers. 
Save the file as Hobby.java.
*/


import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JCheckBox;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Hobby implements ItemListener{
	private static String questions[] = {
			"What are the best tools for starting a new hobby?",
			"What is the most important skill to develop in" + "\n" + "order to excel in a hobby?",
			"How do you stay motivated to continue a hobby?",
			"What resources are available to help improve in" + "\n" + "a hobby?",
			"How can a hobby be turned into a profitable activity?"
	};
	
	private static String choices[][] = {
			{
				"Expensive items", "None of the options", "Generally, it is best to start with the basics", "power tools"	
			},
			{
				"luck", "Dedication and perseverance", "right connections", "None of the above" 
			},
			{
				"Compare yourself to others", "Focus on being better than others", "Eating icecream", "Set goals and rewards for achieving them"
			},
			{
				"Expensive classes", "Expensive Tutorials", "Joining a hobby-specific community or forum", "None of the above"
				
			},
			{
				"Taking out a loan", "investing in expensive equipment", "Monetizing it in a variety of ways.", "None of the above"
			}
	};
	
	
	private static int correct_answers[] = { 2, 1, 3, 2 , 2};
	private static JFrame win = new JFrame();
	JLabel question = new JLabel();
	static private int question_index = 0;
	private int answers_right = 0;
	static private JCheckBox checkboxes[] = new JCheckBox[4];
	private JLabel q_result = new JLabel();
	Hobby() {
		question.setBounds(200, 50, 400, 50);
		win.setSize(720, 480);
		win.setLayout(null);
		win.add(question);
		q_result.setBounds(20, 100, 200, 40);
		win.add(q_result);
		loadQuestion(question_index);
		loadCheckboxes(question_index);
	}
	
	
	public void loadQuestion(int i) {
		question.setText(questions[i]);
		win.setVisible(true);
	}
	
	public void loadCheckboxes(int i) {
		for (int j = 0; j < 4; j++) {
			JCheckBox checkbox = new JCheckBox(choices[i][j]);
			int y_position = 200 + 150/4*j;
			checkbox.setBounds(200, y_position, 400, 20);
			checkbox.addItemListener(this);
			win.add(checkbox);
			checkboxes[j] = checkbox;
		}
	}
	
	public void flushCheckboxItems() {
		for (int i = 0; i < 4; i++) {
			if (checkboxes[i] != null) {
				checkboxes[i].setVisible(false);
				win.remove(checkboxes[i]);
				checkboxes[i] = null;				
			}
		}
	}
	public static void main(String[] args) {
		new Hobby();	
	}

	private void checkAnswer(ItemEvent e) {
		if (question_index < 5) {			
			int correct_answer = correct_answers[question_index];
			JCheckBox c = (JCheckBox) e.getItem();
			if (c.getText() == choices[question_index][correct_answer]) {
				q_result.setText("Correct! Keep it up.");
				q_result.setForeground(Color.BLUE);
				answers_right ++;
				System.out.println(answers_right);
			}else {
				q_result.setText("Oops. You got that one wrong.");
				q_result.setForeground(Color.RED);
			}
			
		}
	}
	
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getItemSelectable());
		checkAnswer(e);
		question_index++;
		flushCheckboxItems();
		if (question_index < 5) {
			loadQuestion(question_index);
			loadCheckboxes(question_index);			
		} else {
			question.setVisible(false);
			q_result.setLocation(200, 200);
			q_result.setForeground(Color.BLACK);
			q_result.setText("<html>You got " + answers_right + "/5 questions correct! "
					+ "<br/>That is  " + 100/5*answers_right + "% accuracy.</html>");
		}
		
	}

}

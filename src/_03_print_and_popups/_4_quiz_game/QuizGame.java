package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String snickers= JOptionPane.showInputDialog("What's 5x5?");
				// 3.  Use an if statement to check if their answer is correct
				if(snickers.equals("25" )) {
					score=score+1;
					JOptionPane.showMessageDialog(null,"+1");
			}
				else  {
					JOptionPane.showMessageDialog(null," +0");
				}
				// 4.  if the user's answer was correct, add one to their score 
	
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				String twizzlers= JOptionPane.showInputDialog("What is the 25 element of the periodic table?");
		if (twizzlers.equals("iron")) {
			JOptionPane.showMessageDialog(null,"+1");
		score=score+1;
		}
		else {
			JOptionPane.showMessageDialog(null,"+0(sorry if you wrote it with an uppercase");
		}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,score);
	}
}

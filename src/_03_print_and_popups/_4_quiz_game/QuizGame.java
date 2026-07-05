package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int num = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
	String ans = JOptionPane.showInputDialog(null, "Do the Boston Celtics have the most NBA Championships total?");
				
				// 3.  Use an if statement to check if their answer is correct
				if (ans.equalsIgnoreCase("yes")) {
					num += 1;
					
					
					
				} else if (num>0) { num -=1; }
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
	String alphabet = JOptionPane.showInputDialog(null, "Are there 26 letters in the alphabet?");
				
				if (alphabet.equalsIgnoreCase("yes")) {
					num += 1;	
				} else if (num>0) { num -=1; }
String cheetah = JOptionPane.showInputDialog(null, "Is a cheetah the fastest land animal?");
				
				if (cheetah.equalsIgnoreCase("yes")) {
					num += 1;	
				} else if (num>0) 
				{ num -=1; }
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, num);
	}
}

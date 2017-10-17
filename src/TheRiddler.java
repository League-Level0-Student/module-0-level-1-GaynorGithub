import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String one = JOptionPane.showInputDialog("What is always coming but never arrives? Please type all lowercase");
		if(one.equals("the future")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer was the future!");
		}
		String two = JOptionPane.showInputDialog("What runs without legs? Please type all lowercase");
		if(two.equals("water")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer was water!");
		}
		String three = JOptionPane.showInputDialog("Everyone has it but nobody can lose it. What am I? Please type all lowercase");
		if(three.equals("a shadow")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer was a shadow!");
		}
		JOptionPane.showMessageDialog(null, "Great Job! You got " + score + " out of 3!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
		
	}



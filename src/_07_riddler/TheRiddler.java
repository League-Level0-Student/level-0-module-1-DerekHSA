package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String Riddle=JOptionPane.showInputDialog("What has four legs, a back, and is not living?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (Riddle.equalsIgnoreCase("a chair")) {
	score++;
	JOptionPane.showMessageDialog(null, "Score\n"+score);
	String Riddle1=JOptionPane.showInputDialog("Who clones himself, has a tv show named after him, and is a ninja?");
	if (Riddle1.equalsIgnoreCase("Baruto")) {
		score =1000000000;
		JOptionPane.showMessageDialog(null, "Score\n"+score);
}
}
	}
}


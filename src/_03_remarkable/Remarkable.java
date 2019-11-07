package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Tanner = ("He is cool");
String Derek = ("He know a lot about Naruto");
String Natalie = ("She has two cats");
String Naruto = ("He uses shadow clones");
		// 2. Ask the user to enter a name. Store their answer in a variable.
String Name=JOptionPane.showInputDialog("Name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (Name.equalsIgnoreCase("Tanner")) {
	JOptionPane.showMessageDialog(null, Tanner);
}else if (Name.equalsIgnoreCase("Derek")) {
	JOptionPane.showMessageDialog(null, Derek);
}else if (Name.equalsIgnoreCase("Natalie")) {
	JOptionPane.showMessageDialog(null, Natalie);
}else if (Name.equalsIgnoreCase("Naruto")) {
	JOptionPane.showMessageDialog(null, Naruto);
}
	}
}


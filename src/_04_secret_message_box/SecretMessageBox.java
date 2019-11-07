package _04_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {public static void main(String[] args){String password=JOptionPane.showInputDialog("Type a password");String INTRUDER=JOptionPane.showInputDialog("You can only see the secret message \nif you can guess the code");if(password.equalsIgnoreCase(INTRUDER)){JOptionPane.showMessageDialog(null, "NARUTO DIES IN BORUTO!");}else {JOptionPane.showMessageDialog(null, "INTRUDER!!!");}}}

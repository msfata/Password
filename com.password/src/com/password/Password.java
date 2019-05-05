/**
 * 
 */
package com.password;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @author msfata programminghelp
 *
 */
public class Password {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter Password !");
		char[] password = input.toCharArray();
		char[] correctPass = new char[] { 'M', 'S', 'F', 'A', 'T', 'A' };

		/*
		 * Comparing arrays
		 */
		if (Arrays.equals(password, correctPass)) {
			JOptionPane.showMessageDialog(null, "Welcome ");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong Password ");
		}
	}
}

package day3;

import javax.swing.JOptionPane;

public class Harry_Potter_quiz {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Harry Potter Quiz");
		JOptionPane.showMessageDialog(null, "Please use caps just for the first letter in the first word");

		String bob = JOptionPane.showInputDialog("In book one who killed harry potters parents");

		if (bob.equals("Voldemort")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong the anwser is Voldemort");
		}
		String obo = JOptionPane.showInputDialog("In book 2 who got pulled into the chamber of secrets");
		if (obo.equals("Ginny")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong the anwser is Ginny");
		}
		String bbo = JOptionPane.showInputDialog("In book three who is the prisoner of azkaban");
		if (bbo.equals("Sirius black")) {

		} else {
			JOptionPane.showMessageDialog(null, "Wrong the anwser is Sirius black");
		}
		String oob = JOptionPane.showInputDialog("In book four what was the triwizard cup");
		if (oob.equals("A portkey")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong the anwser is A portkey");
		}
		String oobb = JOptionPane.showInputDialog(
				"In book 5  What was the thing that harry saw in his head that include rons dad");
		if (oobb.equals("Voldemort torturing rons dad")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong the anwser is Voldemort torturing rons dad");
		}
        String bboo = JOptionPane.showInputDialog("In book 6 who killed Dumbledore");
        if (bboo.equals("Snape")) {
		JOptionPane.showMessageDialog(null, "Correct");	
		}else{
			JOptionPane.showMessageDialog(null, "Wrong the answer is snape");
		}
			String bobo = JOptionPane.showInputDialog("In book 7 what did the golden snitch say on its side");
			if (bobo.equals("I open at the close")) {
		JOptionPane.showMessageDialog(null, "Correct");		
		}else{
			JOptionPane.showInputDialog("Wrong the anwser is I open at the close");
		}
			String obob = JOptionPane.showInputDialog("In book 8 who had the real time turner");
			if (obob.equals("Draco")) {
			JOptionPane.showMessageDialog(null, "Correct");	
			}else{
				JOptionPane.showMessageDialog(null, "Wrong the answer is Draco");
			}
			String spell = JOptionPane.showInputDialog("What does the spell expelliarmus do it... ");
			if (spell.equals("Disarms")) {
			JOptionPane.showMessageDialog(null, "Correct");	
			}else{
				JOptionPane.showMessageDialog(null, "Wrong the anwser is disarms");
			}
			String lleps = JOptionPane.showInputDialog("What does the spell avada kedavra do");
			if (lleps.equals("Kills")) {
			JOptionPane.showMessageDialog(null, "Correct");	
			}else{
				JOptionPane.showMessageDialog(null, "Wrong the anwser is Kills");
			}
			JOptionPane.showMessageDialog(null, "Good job you finshed this quiz");
	}
		
	}


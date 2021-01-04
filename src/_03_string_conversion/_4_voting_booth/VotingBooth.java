package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) 
{
	String age= JOptionPane.showInputDialog("How many years old are you?");
	
	int ageAsInt = Integer.parseInt(age);
	
	 if (ageAsInt > 18) {
		 JOptionPane.showInputDialog(null, "Who shoud the next president be?");
		 JOptionPane.showMessageDialog(null, "Cool");
	 }
	 else if (ageAsInt <= 18) {
		 JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	 }
}
}

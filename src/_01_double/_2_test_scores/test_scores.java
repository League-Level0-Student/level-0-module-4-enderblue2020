package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {

	public static void main(String[] args) {
		String Score = JOptionPane.showInputDialog("What did you get on your test?");
		double doubleScore = Double.parseDouble(Score);
		if(doubleScore >= 100.0 && doubleScore > 89.0){
			JOptionPane.showMessageDialog(null, "Wow! You got " + Score + "%!");
		}
		else if(doubleScore <= 89.0 && doubleScore > 79.0) {
		JOptionPane.showMessageDialog(null, "You did decent, with " + Score + "%!");
		}
		else if(doubleScore <= 79.0 && doubleScore > 66.0) {
			JOptionPane.showMessageDialog(null, "You did ok, with " + Score + "%.");
			}
		else if(doubleScore <= 65.0) {
			JOptionPane.showMessageDialog(null, "You did terrible, with " + Score + "%.");
			}
		}
	}
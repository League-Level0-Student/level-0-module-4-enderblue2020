package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for(int i = 0; i < 10; i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
String number1 = JOptionPane.showInputDialog("Enter a number");
String number2 = JOptionPane.showInputDialog("Enter another number");
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Do what with " + number1 + " & "+ number2 + "?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	int num1 = Integer.parseInt(number1);
		
	// 4. Create similar methods for subtraction, multiplication and division.
}
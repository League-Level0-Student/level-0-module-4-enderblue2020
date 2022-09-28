package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for(int i = 0; i < 10; i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
String number1 = JOptionPane.showInputDialog("Enter a number");
int num1 = Integer.parseInt(number1);
String number2 = JOptionPane.showInputDialog("Enter another number");
int num2 = Integer.parseInt(number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Do what with " + number1 + " & "+ number2 + "?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
		if(operation == 0) {
			add(num1, num2);
		}
		if(operation == 1) {
			subtract(num1, num2);
		}
		if(operation == 2) {
			multiply(num1, num2);
		}
		if(operation == 0) {
			divide(num1, num2);
		}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
}

	}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
	
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int number1,int number2) {
	int answer = number1 + number2;
	JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + answer);
}
	// 4. Create similar methods for subtraction, multiplication and division.
static void multiply(int number1,int number2) {
	int answer = number1 * number2;
	JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + answer);
}
static void subtract(int number1,int number2) {
	int answer = number1 - number2;
	JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + answer);
}
static void divide(int number1,int number2) {
	int answer = number1 / number2;
	JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + answer);
}
}
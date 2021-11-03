import java.util.Scanner;
class main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = Double.parseDouble(scan.nextLine());
		System.out.println("Enter operation (+/-/'/'/*");
		char oper = scan.nextLine().charAt(0);
		System.out.println("Enter second number");
		double num2 = Double.parseDouble(scan.nextLine());
		switch(oper) {
			case '+':
				System.out.println(num1+num2);
				break;
			case '-': 
				System.out.println(num1-num2);
				break;
			case '/':
				System.out.println(num1/num2);
				break;
			case '*':
				System.out.println(num1*num2);
				break;
			default:
				System.out.println("You fucking failure");
		}
	}
}

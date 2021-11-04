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
		doOper(num1,oper,num2);
    }
	private static void doOper(double num1, char oper, double num2) {
		switch(oper) {
			case '+':
				System.out.println(add(num1,num2));
				break;
			case '-':
				System.out.println(subtract(num1,num2));
				break;
			case '/':
				System.out.println(divide(num1,num2));
				break;
			case '*':
				System.out.println(multiply(num1,num2));
				break;
			default:
				System.out.println("You fucking failure");
        }
    }

    	private static double add(double num1, double num2){
		return(num1+num2);
	}
	private static double subtract(double num1, double num2){
		return(num1-num2);
	}
	private static double multiply(double num1, double num2){
		return(num1*num2);
	}
	private static double divide(double num1, double num2){
		return(num1/num2);
	}
}

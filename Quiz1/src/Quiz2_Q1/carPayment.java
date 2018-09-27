package Quiz2_Q1;
import java.util.Scanner;
public class carPayment {
	private double totalPrice; 
	private int loanLength ;
	private double interestRate;
	private double downPayment;
	public carPayment() {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter total price:");
		totalPrice = stdin.nextInt();
		System.out.println("Please enter the number of months on your loan:");
		loanLength = stdin.nextInt();
		System.out.println("Please enter the desired interest rate:");
		interestRate = stdin.nextInt();
		System.out.println("Please enter the down payment:");
		downPayment = stdin.nextInt();
		stdin.close();
	}
	public double monthlyCarPayment() {
		double x = interestRate/12;
		return (double) (((x) * (totalPrice- downPayment))/1-(Math.pow(1+(x), -loanLength)));
	}
	public double totalInterest() {
		return ((monthlyCarPayment()*loanLength) + downPayment) - totalPrice; 
	}
	public static void main(String [] args) {
		carPayment myCar = new carPayment();
		System.out.println("Monthly payment: " + myCar.monthlyCarPayment());
		System.out.println("Total interest: " + myCar.totalInterest());
	}
}

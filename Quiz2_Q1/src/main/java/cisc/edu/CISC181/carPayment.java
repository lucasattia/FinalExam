package cisc.edu.CISC181;
public class carPayment {
	private double totalPrice; 
	private int loanLength ;
	private double interestRate;
	private double downPayment;
	public carPayment(double total_price, double interest_rate, double down_payment, int loan_length) {
		totalPrice = total_price;
		loanLength = loan_length;
		interestRate = (double) interest_rate/100;
		downPayment = down_payment;
	}
	public double monthlyCarPayment() {
		double monthlyRate = interestRate/12;
		return (monthlyRate * (totalPrice- downPayment))/(1-(Math.pow(1+monthlyRate, -loanLength)));
	}
	public double totalInterest() {
		return ((monthlyCarPayment()*loanLength) + downPayment - totalPrice); 
	}
	public static void main(String [] args) {
	}
}

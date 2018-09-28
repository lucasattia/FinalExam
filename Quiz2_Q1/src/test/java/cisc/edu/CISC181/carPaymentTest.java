package cisc.edu.CISC181;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import cisc.edu.CISC181.carPayment; 
public class carPaymentTest extends TestCase {
    @Test
    public void testApp() {
    	carPayment testCar = new carPayment(35000., 10., 0., 60);
 	    System.out.println("Monthly Payment = " + testCar.monthlyCarPayment());
 	    // Test the result using the results provided
 	    assertTrue((double) Math.round(100*testCar.monthlyCarPayment())/100 == 743.65);
    	}
    @Test
    public void testInterest() {
    	carPayment testCar = new carPayment(35000., 10., 0., 60);
 	    System.out.println("Monthly Payment = " + testCar.totalInterest());
 	    // Test the result using the results provided
 	    assertTrue(((double) Math.round(100*testCar.totalInterest())/100) == 9618.79);
    	}
	}


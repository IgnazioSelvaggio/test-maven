import junit.framework.TestCase;

public class testcalc extends TestCase {

	public void testSomma() {
		Calc c = new Calc();
		
		double res = c.somma(5,6);
		
		assertEquals(11.0,res);
	}
}

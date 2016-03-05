import static org.junit.Assert.*;

import org.junit.Test;


public class TestContinuingIntegerAction {
	Action underTest;
	
	@Test
	public void testWithZero() {
		underTest = new ContinuingIntegerAction();
		InterimResult initial = new InterimResult(0, 1, 0);		
		InterimResult result = underTest.execute(initial, '0');
		
		assertEquals(0, result.getP(), 0.0001);
		assertEquals(1, result.getS());
		assertEquals(0, result.getV(), 0.0001);
	}

	@Test
	public void testWithOther() {
		underTest = new ContinuingIntegerAction();
		InterimResult initial = new InterimResult(0, 1, 1);		
		InterimResult result = underTest.execute(initial, '5');
		
		assertEquals(0, result.getP(), 0.0001);
		assertEquals(1, result.getS());
		assertEquals(15, result.getV(), 0.0001);
	}
}

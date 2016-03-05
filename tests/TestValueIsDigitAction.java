import static org.junit.Assert.*;

import org.junit.Test;


public class TestValueIsDigitAction {
	Action underTest;
	
	@Test
	public void testWithZero() {
		underTest = new ValueIsDigitAction();
		InterimResult initial = new InterimResult(0, 1, 0);		
		InterimResult result = underTest.execute(initial, '0');
		
		assertEquals(0, result.getP(), 0.0001);
		assertEquals(1, result.getS());
		assertEquals(0, result.getV(), 0.0001);
	}

	@Test
	public void testWithOther() {
		underTest = new ValueIsDigitAction();
		InterimResult initial = new InterimResult(0, 1, 0);		
		InterimResult result = underTest.execute(initial, '5');
		
		assertEquals(0, result.getP(), 0.0001);
		assertEquals(1, result.getS());
		assertEquals(5, result.getV(), 0.0001);
	}
}

import static org.junit.Assert.*;

import org.junit.Test;


public class TestContinuingFractionAction {
	Action underTest;
	
	@Test
	public void testWithZero() {
		underTest = new ContinuingFractionAction();
		InterimResult initial = new InterimResult(0.1, 1, 0);		
		InterimResult result = underTest.execute(initial, '0');
		
		assertEquals(0.01, result.getP(), 0.0001);
		assertEquals(1, result.getS());
		assertEquals(0.0, result.getV(), 0.0001);
	}

	@Test
	public void testWithOther() {
		underTest = new ContinuingFractionAction();
		InterimResult initial = new InterimResult(0.1, 1, 0);		
		InterimResult result = underTest.execute(initial, '5');
		
		assertEquals(0.01, result.getP(), 0.0001);
		assertEquals(1, result.getS());
		assertEquals(0.5, result.getV(), 0.0001);
	}
}

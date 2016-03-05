import static org.junit.Assert.*;

import org.junit.Test;


public class TestNoAction {
	Action underTest;
	
	@Test
	public void testWithPlus() {
		underTest = new NoAction();
		InterimResult initial = new InterimResult(0, 1, 0);		
		InterimResult result = underTest.execute(initial, '+');
		
		assertEquals(0, result.getP(), 0.0001);
		assertEquals(1, result.getS());
		assertEquals(0, result.getV(), 0.0001);
	}
}

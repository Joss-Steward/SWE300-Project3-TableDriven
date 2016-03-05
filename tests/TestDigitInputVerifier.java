import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Joss Steward
 *
 */
public class TestDigitInputVerifier {
	private InputVerifier underTest;
	
	@Before
    public void setUp()
    {
		underTest = new DigitInputVerifier();
    }
	
	@Test
	public void testMeetsCriteria_valid() {
		assertTrue(underTest.meetsCriteria('1'));
		assertTrue(underTest.meetsCriteria('2'));
		assertTrue(underTest.meetsCriteria('3'));
		assertTrue(underTest.meetsCriteria('4'));
		assertTrue(underTest.meetsCriteria('5'));
		assertTrue(underTest.meetsCriteria('6'));
		assertTrue(underTest.meetsCriteria('7'));
		assertTrue(underTest.meetsCriteria('8'));
		assertTrue(underTest.meetsCriteria('9'));
		assertTrue(underTest.meetsCriteria('0'));
	}
	
	@Test
	public void testMeetsCriteria_invalid() {
		assertFalse(underTest.meetsCriteria('a'));
		assertFalse(underTest.meetsCriteria('A'));
		assertFalse(underTest.meetsCriteria('-'));
		assertFalse(underTest.meetsCriteria('+'));
		assertFalse(underTest.meetsCriteria('.'));
		assertFalse(underTest.meetsCriteria('\0'));
		assertFalse(underTest.meetsCriteria('~'));
	}
}

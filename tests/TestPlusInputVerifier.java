import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestPlusInputVerifier {
	private InputVerifier underTest;
	
	@Before
    public void setUp()
    {
		underTest = new PlusInputVerifier();
    }
	
	@Test
	public void testMeetsCriteria_valid() {
		assertTrue(underTest.meetsCriteria('+'));
	}
	
	@Test
	public void testMeetsCriteria_invalid() {
		assertFalse(underTest.meetsCriteria('a'));
		assertFalse(underTest.meetsCriteria('A'));
		assertFalse(underTest.meetsCriteria('-'));
		assertFalse(underTest.meetsCriteria('.'));
		assertFalse(underTest.meetsCriteria('\0'));
		assertFalse(underTest.meetsCriteria('~'));
		assertFalse(underTest.meetsCriteria('0'));
		assertFalse(underTest.meetsCriteria('9'));
	}

}

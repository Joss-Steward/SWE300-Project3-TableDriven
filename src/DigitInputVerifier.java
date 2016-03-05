
/**
 * @author Joss Steward
 * This behavior returns True if the input character is a digit
 */
public class DigitInputVerifier implements InputVerifier {

	/**
	 * @author Joss Steward <joss.steward@gmail.com>
	 * Returns True if the character is a digit.
	 */
	@Override
	public boolean meetsCriteria(char c) {
		return Character.isDigit(c) ;
	}

}

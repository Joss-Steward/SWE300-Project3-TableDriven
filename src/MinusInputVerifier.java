
/**
 * @author Joss Steward <joss.steward@gmail.com>
 * This behavior returns True if the input character is a '-'
 */
public class MinusInputVerifier implements InputVerifier {

	/**
	 * @author Joss Steward <joss.steward@gmail.com>
	 * Returns True if the input character is '-'
	 */
	@Override
	public boolean meetsCriteria(char c) {
		return (c == '-');
	}

}

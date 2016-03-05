/**
 * @author Joss Steward <joss.steward@gmail.com>
 *
 */
public class ValueIsDigitAction implements Action {

	/**
	 * @author Joss Steward <joss.steward@gmail.com>
	 * This action is executed when the start state gets a digit.
	 */
	@Override
	public InterimResult execute(InterimResult x, char c) {
		InterimResult result = new InterimResult(x);
		
		result.setV(c - '0');
		
		return result;
	}

}

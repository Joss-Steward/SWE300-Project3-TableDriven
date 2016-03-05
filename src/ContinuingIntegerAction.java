/**
 * 
 */

/**
 * @author Joss Steward <joss.steward@gmail.com>
 *
 */
public class ContinuingIntegerAction implements Action {

	/**
	 * @author Joss Steward <joss.steward@gmail.com>
	 * This action is executed when the integer state gets a digit.
	 */
	@Override
	public InterimResult execute(InterimResult x, char c) {
		InterimResult result = new InterimResult(x);
		
		result.setV((10 * x.getV()) + (c - '0'));
		
		return result;
	}

}

/**
 * 
 */

/**
 * @author Joss Steward <joss.steward@gmail.com>
 *
 */
public class StartFraction implements Action {

	/**
	 * @author Joss Steward <joss.steward@gmail.com>
	 * This action is executed when the start state gets a '.'.
	 */
	@Override
	public InterimResult execute(InterimResult x, char c) {
		InterimResult result = new InterimResult(x);
		
		result.setP(0.1);
		
		return result;
	}

}

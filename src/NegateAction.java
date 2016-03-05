/**
 * 
 */

/**
 * @author Joss Steward <joss.steward@gmail.com>
 */
public class NegateAction implements Action {

	/**
	 * @author Joss Steward <joss.steward@gmail.com>
	 * This action is executed when the start state gets a '-'.
	 */
	@Override
	public InterimResult execute(InterimResult x, char c) {
		InterimResult result = new InterimResult(x);
		
		result.setS(-1);
		
		return result;
	}

}

/**
 * 
 */

/**
 * @author Joss Steward <joss.steward@gmail.com>
 *
 */
public class ContinuingFractionAction implements Action {

	/**
	 * @author Joss Steward <joss.steward@gmail.com>
	 * This action is executed when the fraction state gets a digit.
	 */
	@Override
	public InterimResult execute(InterimResult x, char c) {
		InterimResult result = new InterimResult(x);
		
		double addToV = x.getP() * (c - '0');		
		result.setV(result.getV() + addToV);
		
		result.setP(x.getP() / 10);
		
		return result;
	}

}

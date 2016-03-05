/**
 * A finite state machine that parses a string containing a real number. Will
 * throw NumberFormatExcaption if the string doesn't not contain a legal
 * representation of a real number. Note: we are not dealing with scientific
 * notation
 * 
 * @author Merlin
 *
 */
public class ConvertingMachine
{

	private final Edge[] machine =
	{
			new Edge(State.START, new DigitInputVerifier(),
					new ValueIsDigitAction(), State.INTEGER),
			new Edge(State.START, new MinusInputVerifier(),
					new NegateAction(), State.INTEGER),
			new Edge(State.START, new PlusInputVerifier(), 
					new NoAction(), State.INTEGER),
			new Edge(State.START, new PeriodInputVerifier(),
					new StartFraction(), State.DECIMAL),
			new Edge(State.INTEGER, new DigitInputVerifier(),
					new ContinuingIntegerAction(), State.INTEGER),
			new Edge(State.INTEGER, new PeriodInputVerifier(),
					new StartFraction(), State.DECIMAL),
			new Edge(State.DECIMAL, new DigitInputVerifier(),
					new ContinuingFractionAction(), State.DECIMAL)
	};

	public double parse(String text)
	{
		// Tracks the current state
		State currentState = State.START;
		
		// Tracks the current results. Initialize to starting values
		InterimResult interim = new InterimResult(0, 1, 0);
		
		// For each character, find the matching edge and execute that action.
		for(Character character : text.toCharArray()){
			// Find the edge
			Edge nextEdge = searchForEdge(currentState, character);
			
			// Execute the action
			interim = nextEdge.action.execute(interim, character);
			
			// Advance to the next state
			currentState = nextEdge.nextState;
		}
		
		// Return the final result.
		return interim.getS() * interim.getV();
	}

	private Edge searchForEdge(State currentState, char ch)
	{
		Edge nextEdge = null;

		// Look through all the edges
		for(Edge e : machine){
			// If this edge matches, then set it
			if(e.currentState == currentState && e.inputVerifier.meetsCriteria(ch)){
				nextEdge = e;
			}
		}
		
		// If we didn't find an edge, throw an exception
		if(nextEdge == null){
			throw new NumberFormatException();
		}
		
		// Return the edge we found
		return nextEdge;
	}

	private class Edge
	{
		State currentState;
		InputVerifier inputVerifier;
		Action action;
		State nextState;

		public Edge(State currentState, InputVerifier inputVerifier,
				Action action, State nextState)
		{
			this.currentState = currentState;
			this.inputVerifier = inputVerifier;
			this.action = action;
			this.nextState = nextState;
		}
	}

	private enum State
	{
		START, INTEGER, DECIMAL, END
	}
}

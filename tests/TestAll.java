import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Run all of the tests
 * @author Joss Steward <joss.steward@gmail.com>
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
		{
			ConvertingMachineTest.class,
			InterimResultTest.class,
			TestDigitInputVerifier.class,
			TestMinusInputVerifier.class,
			TestPlusInputVerifier.class,
			TestPeriodInputVerifier.class,
			TestContinuingFractionAction.class,
			TestContinuingIntegerAction.class,
			TestNegateAction.class,
			TestNoAction.class,
			TestValueIsDigitAction.class,
		})
public class TestAll {}

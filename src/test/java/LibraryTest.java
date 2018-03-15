import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import Domain.StringCalculator;


class StringCalculatorTest {

    @Test
    public void SumOfEmptyStringReturns0() {

        StringCalculator calc = new StringCalculator();

        int sum = calc.Sum("");

        assertEquals(0, sum);
    }

    @Test
    public void SumOfStringOneDigitReturns1() {

        StringCalculator calc = new StringCalculator();

        int sum = calc.Sum("1");

        assertEquals(1, sum);
    }

    @Test
    public void WhenStringContainsOneCommaTwo_ThenSumIsThree() {

        StringCalculator calc = new StringCalculator();

        int sum = calc.Sum("1,2");

        assertEquals(3, sum);
    }

    @Test
    public void WhenStringContainsOneNewLineTwo_ThenSumIsThree() {

        StringCalculator calc = new StringCalculator();

        int sum = calc.Sum("1\n2");

        assertEquals(3, sum);
    }

    @Test
    public void WhenStringContainsOneCommaTwoCommaThree_ThenSumIsSix() {

        StringCalculator calc = new StringCalculator();

        int sum = calc.Sum("1,2,3");

        assertEquals(6, sum);
    }

}

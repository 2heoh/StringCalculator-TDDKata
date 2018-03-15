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


}

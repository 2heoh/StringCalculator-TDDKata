package Domain;

public class StringCalculator {

    public int Sum(String input) {

        String[] digits = input.split(",|\n");
        int sum = 0;

        for (String digit: digits) {
            if (digit.length() > 0) sum += parseString(digit);
        }

        return sum;
    }

    private int parseString(String digit) {
        return Integer.parseInt(digit);
    }
}
package Domain;

public class StringCalculator {

    public int Sum(String input) {

        String[] digits = input.split(",|\n");
        int sum = 0;
        for (String digit: digits) {
            if (digit.length() > 0) {
                sum += Integer.parseInt(digit);
            }

        }
        return sum;
    }
}
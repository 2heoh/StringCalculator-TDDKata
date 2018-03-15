package Domain;

public class StringCalculator {

    public int Sum(String input) {

        String separator = ",|\\n";

        if(input.startsWith("\\")) {
            separator = "" + input.toCharArray()[1];
            input = input.substring(2, input.length());
        }

        String[] digits = input.split(separator);

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
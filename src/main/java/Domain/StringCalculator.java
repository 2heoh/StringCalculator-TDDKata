package Domain;

public class StringCalculator {

    public int Sum(String input) {

        String[] digits = input.split(",");

        if(digits.length > 1) {
            return Integer.parseInt(digits[0]) + Integer.parseInt(digits[1]);
        } else {

            if (input == "") {
                return 0;
            }

            return Integer.parseInt(input);
        }
    }
}
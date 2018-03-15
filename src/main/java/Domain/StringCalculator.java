package Domain;

public class StringCalculator {

    public int Sum(String input) {

        if(input == "") {
            return 0;
        }

        return Integer.parseInt(input);
    }
}
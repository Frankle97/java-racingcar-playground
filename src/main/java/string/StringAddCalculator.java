package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String input) {
        int sum = 0;
        if (input == null || "".equals(input)) {
            return 0;
        }

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
        boolean find = matcher.find();
        if (find) {
            String customDelimiter = matcher.group(1);
            String[] tokens = matcher.group(2).split(customDelimiter);
            sum = calculateSum(sum, tokens);
        }

        if (!find) {
            String[] numbers = input.split("[,:]");
            sum = calculateSum(sum, numbers);
        }

        return sum;
    }

    private static int calculateSum(int sum, String[] tokens) {
        for (String token : tokens) {
            checkNumber(token);
            int number = Integer.parseInt(token);
            checkNegative(number);
            sum += number;
        }
        return sum;
    }

    private static void checkNumber(String token) {
        if (!Character.isDigit(token.charAt(0))) {
            throw new RuntimeException();
        }
    }

    private static void checkNegative(int number) {
        if (number < 0) {
            throw new RuntimeException();
        }
    }
}

package Week6;


public class MetricCalculator {
    public static double convertToMM(double value, String inputUnit) {
//       Before learning to use Exceptions used to return a String ErrorMessage = "Unsupported unit"; for default
        return switch (inputUnit) {
            case "km" -> value * 1000000;
            case "m" -> value * 1000;
            case "dm" -> value * 100;
            case "cm" -> value * 10;
            case "mm" -> value;
            default ->
                    throw new IllegalArgumentException("This unit is unsupported. Please enter one of the following unit: mm, cm, dm, m, km");
        };
    }
    public static double convertFromMM(double mmValue, String outputUnit) {
        switch (outputUnit) {
            case "km":
                return mmValue / 1000000;
            case "m":
                return mmValue / 1000;
            case "dm":
                return mmValue / 100;
            case "cm":
                return mmValue / 10;
            case "mm":
                return mmValue;
            default:   throw new IllegalArgumentException("This unit is unsupported. Please enter one of the following unit: mm, cm, dm, m, km");
        }
    }
    private static int findFirstNonDigit(String input) {    //I'm sure there is an easier way.
                                                            //Note to self: Use Pattern and Matcher Objects. Looks way easier
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c) && c != '.') {
                return i;
            }
        }
        return input.length();
    }
    public static double calculate(String sum, String outputUnit) {
        String[] terms = sum.split(" ");
        double totalMM = 0;
        double currentValue = 0;
        String currentUnit = null;

        for (int i = 0; i < terms.length; i++) {
            if (i % 2 == 0) {
                String valueWithUnit = terms[i];
                int splitIndex = findFirstNonDigit(valueWithUnit);
                currentValue = Double.parseDouble(valueWithUnit.substring(0, splitIndex)); //not sure if here's the problem
                currentUnit = valueWithUnit.substring(splitIndex);
            } else {
                String operator = terms[i];
                double mmValue = convertToMM(currentValue, currentUnit);

                if (operator.equals("+")) {
                    totalMM += mmValue;
                } else if (operator.equals("-")) {
                    totalMM -= mmValue;
                } else {
                    System.out.println("Please enter valid operator.");
                }
            }
        }
        return convertFromMM(totalMM, outputUnit);
    }
}

package Week6;

import static Week6.MetricCalculator.calculate;

public class Main{
    public static void main(String[] args) {
        String sum = "14.5 cm + 2.5 m - 45 mm";
        double result = calculate(sum, "mm"); //should be 2600 mm
        System.out.printf("Result:", result);
    }
}

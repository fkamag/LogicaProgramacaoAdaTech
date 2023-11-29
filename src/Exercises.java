import java.math.*;
import java.util.Arrays;

public class Exercises {

  public static void main(String[] args) {
    double[] input = {3, 20000.00, 2000.00, 250.00};
    double result = 0;

    result = input[0]*input[3] + input[2] + input[1]*0.05;

    BigDecimal rx = new BigDecimal(result);
    rx = rx.setScale(2,RoundingMode.HALF_DOWN);

    result = rx.doubleValue();

    System.out.println(result);
  }

}

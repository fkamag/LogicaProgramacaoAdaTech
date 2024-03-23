import java.util.Arrays;
import java.util.Scanner;

public class Baskara {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor de a: ");
    double a = scanner.nextDouble();

    if (a != 0) {
      System.out.print("Digite o valor de b: ");
      double b = scanner.nextDouble();
      System.out.print("Digite o valor de c: ");
      double c = scanner.nextDouble();
      double delta = Math.pow(b, 2) - 4*a*c;
      if (delta < 0) {
        System.out.println("A equação não possui raízes reais.");
      } else if (delta == 0) {
        double x = -b / (2 * a);
        System.out.printf("A equação possui uma raiz real: %.0f", x);
      } else {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("A equação possui duas raízes reais: %.2f e %.2f", x1, x2);
      }
    } else {
      System.out.println("Esta não é uma equação do segundo grau.");
    }
  }

}

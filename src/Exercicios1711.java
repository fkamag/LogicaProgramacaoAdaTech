import java.util.Scanner;

public class Exercicios1711 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o numerador");
    double numerador = scanner.nextDouble();
    System.out.println("Digite o denominador");
    double denominador = scanner.nextDouble();
    System.out.println(dividir(numerador, denominador));
    int [] numeros = {1,5,3,4,2,9,12};
    System.out.println(obterMaiorElemento(numeros));
  }
  public static double dividir(double numerador, double denominador) {
    return numerador / denominador;
  }

  public static int obterMaiorElemento(int[] numeros) {
    int maior = 0;
    for (int numero : numeros) {
      if (numero > maior) {
        maior = numero;
      }
    }
    return maior;
  }

}

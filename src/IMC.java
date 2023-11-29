import java.util.Scanner;

public class IMC {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a altura em metros: ");
    while (!scanner.hasNextDouble()) {
      System.out.println("entrada invalida .. ");
      scanner.next();
      System.out.print("Digite a altura em metros: ");
    }
    double altura = scanner.nextDouble();


    System.out.print("Digte o seu peso em Kg: ");
    while (!scanner.hasNextDouble()) {
      System.out.println("entrada invalida .. ");
      scanner.next();
      System.out.print("Digte o seu peso em Kg: ");
    }
    double peso = scanner.nextDouble();

    double imc = peso / (altura * altura);

    System.out.printf("O IMC é de %.1f\n", imc);

    String classificacao;

    if (imc < 18.5) {
      classificacao = "Magreza";
    } else if (imc < 25) {
      classificacao = "Normal";
    } else if (imc < 30) {
      classificacao = "Sobrepeso";
    } else if (imc < 35) {
      classificacao = "Obesidade grau I";
    } else if (imc < 40) {
      classificacao = "Obesidade grau II";
    } else {
      classificacao = "Obesidade grau III";
    }

    System.out.println("Classificação: " + classificacao);

    final double IMC_IDEAL = 24.9;

    double pesoIdeal = (altura * altura) * IMC_IDEAL;

    System.out.printf("O Peso Ideal é: %.1f", pesoIdeal);


  }

}

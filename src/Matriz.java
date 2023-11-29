import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matriz {

  static int sum = 0;
  static long runtime;

  public static void main(String[] args) {
    int [][] a = { {1,2}, {3,4} };
    int [][] b = { {-1,3}, {4,2} };
    int[][] result =  twoByTwoMultiplication(a, b);
    System.out.println("Multiplicação matriz 2x2");
    System.out.println(Arrays.deepToString(result));

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tamanho da matriz desejada: ");
    int matrixLength = scanner.nextInt();

    int[][] matrixGenerated1 =  matrixGenerator(matrixLength);
    System.out.println(Arrays.deepToString(matrixGenerated1));

    int[][] matrixGenerated2 =  matrixGenerator(matrixLength);
    System.out.println(Arrays.deepToString(matrixGenerated2));

    int[][] product = nBynMultiplication(matrixGenerated1, matrixGenerated2, matrixLength);
    System.out.println(Arrays.deepToString(product));

    System.out.println("Quantidade de multiplicações: " + sum);
    //            8 para    2
    //          125 para    5
    //        1.000 para   10
    //    1.000.000 para  100
    //1.000.000.000 para 1000
    System.out.println("Tempo de execução em Nano Segundos: " + runtime);
    //        12.557 para    2
    //        38.221 para    5
    //       146.489 para   10
    //    14.121.849 para  100
    // 2.896.167.278 para 1000
  }

  private static int[][] twoByTwoMultiplication(int[][] a, int[][] b) {
    int [][] c = new int [2][2];

//    calcular a multiplicação das matrizes 2X2 e colocar na matriz c
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        for (int k = 0; k < c.length; k++) {
          c[i][j] += (a[i][k] * b[k][j]);
        }
      }
    }
    return c;
  }

  private static int[][] matrixGenerator(int matrixLength) {

    int number;
    Random random = new Random();
    int[][] c = new int[matrixLength][matrixLength];

    for (int i = 0; i < matrixLength; i++) {
      for (int j = 0; j < matrixLength; j++) {
        number = random.nextInt(-100, 100);
        c[i][j] = number;
      }
    }
    return c;
  }

  private static int[][] nBynMultiplication(int[][] a, int[][] b, int matrixLength) {
    int [][] c = new int [matrixLength][matrixLength];

    long initialTime = System.nanoTime();

//    calcular a multiplicação das matrizes 2X2 e colocar na matriz c
    for (int i = 0; i < matrixLength; i++) {
      for (int j = 0; j < matrixLength; j++) {
        for (int k = 0; k < matrixLength; k++) {
          c[i][j] += (a[i][k] * b[k][j]);
          sum += 1;
        }
      }
    }
    long finalTime = System.nanoTime();
    runtime = finalTime - initialTime;
    return c;
  }
}

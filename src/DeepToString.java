import java.util.Arrays;

public class DeepToString {

  public static void main(String[] args) {
    int[][] cartela2 = new int[3][3];

    String entrada = "1,3,5-2,4,5-7,8,9";
    String[] strings = entrada.split("-");

    int[] numeros = new int[3];
    for (int i = 0; i < 3; i++) {
      String[] stringv = strings[i].split(",");
      for (int j = 0; j < 3; j++) {
        numeros[j] = Integer.parseInt(stringv[j]);
        cartela2[i][j] = numeros[j];
      }
    }
    System.out.println(Arrays.deepToString(cartela2));
  }

}

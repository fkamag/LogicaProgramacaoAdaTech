public class JumpingOnTheClouds {

  public static void main(String[] args) {
    int k = 2;
    int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
    int result = jumpingOnClouds(c, k);

    System.out.println("Resultado final: " + result);

  }

  public static int jumpingOnClouds(int[] c, int k) {
    int e = 100;
    int i = 0;

    do {
      i = (i + k) % c.length;
      e = e - 1 - (c[i] * 2);
      System.out.println(e);
    } while (i != 0);

    return e;
  }

}

import java.util.Arrays;

public class Sorteio {

  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7,8,9,10};

    for (int i = 0; i < array.length; i++) {
      int ind = (int) (Math.random() * (i+1));
      int number = array[i];
      int number2 = array[ind];
      array[i] = number2;
      array[ind] = number;
    }
    System.out.println(Arrays.toString(array));
  }

}

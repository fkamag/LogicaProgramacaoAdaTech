import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ranking {

  public static void main(String[] args) {
    System.out.println("Problema a resolver:");
    System.out.println("Recebido lista com pontos de cada jogador definir sua posição no ranking");
    System.out.println();
    int[] scores = {3,5,3,4,2,1,0,4,2,1};
    int[] ranks = getRanks(scores);
    System.out.println("Pegamos o indice original pelo índice[1] e definimos a posição no ranking"
        + Arrays.toString(ranks));

    System.out.println();
    System.out.println("Gerado a posição do ranking sem perder o índice do jogador");
    System.out.println("----- Resultado Final -----");
    System.out.println("Array de pontos:  " + Arrays.toString(scores));
    System.out.println("Array do ranking: " + Arrays.toString(ranks));

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    System.out.println(list.toString());
  }

  private static int[] getRanks(int[] scores) {
    System.out.println("Array com Pontos de cada jogador: " + Arrays.toString(scores));
    int n = scores.length;
    int[][] scoreIndexPairs = new int[n][2];
    for (int i = 0; i < n; i++) {
      scoreIndexPairs[i][0] = scores[i];
      scoreIndexPairs[i][1] = i;
    }
    System.out.println("Array Inicial com o índice do jogador" + Arrays.deepToString(scoreIndexPairs));
    Arrays.sort(scoreIndexPairs, (a, b) -> b[0] - a[0]);
    System.out.println("Feito Sort pelo índice[0], então temos do maior para o menor ponto"
        + Arrays.deepToString(scoreIndexPairs));
    int[] ranks = new int[n];
    for (int i = 0; i < n; i++) {
      ranks[scoreIndexPairs[i][1]] = i + 1;
    }
    return ranks;
  }
}

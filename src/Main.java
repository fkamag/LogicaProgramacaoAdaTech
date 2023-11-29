public class Main {

  public static void main(String[] args) {
//    int i = 0;
//
//    System.out.println("0 == " + i);
//    System.out.println(i++ == 1 ? "1 == " + i : "1 != " + i);
//    System.out.println(++i == 2 ? "2 == " + i : "2 != " + i);
//
//    int idade = 20;
//    while( idade-- > 19) {
//      System.out.println(idade);
//    }
//    System.out.println(idade + " parada");
//    do {
//      System.out.println(idade);
//    } while (--idade > 16);
//
//    while( --idade > 19) {
//      System.out.println(idade);
//    }
//    System.out.println(idade + " parada");
//    do {
//      System.out.println(idade);
//    } while (idade-- > 16);
//
//    int a = 1, b = a + 1, c = b+1;
//    System.out.println(++a + b++ + +c);
//
//    for (int x=0, j = 10; x <= 10; x++, --j) {
//      System.out.println(x + "-" + j);
//    }

//    int[] cartela = {1,2,3,4,5};
//    for (int j : cartela) {
//      System.out.println(j);
//    }

    String palavra01 = " Leão-Marinho ";

    System.out.println("01 - " + palavra01.length());
    String palavra02 = palavra01.replace("ã","a");
    System.out.println("02 -" + palavra02);
    String[] lista = palavra01.split("-");
    for (int x=0; x<lista.length;x++) {
      System.out.println("03 -" + lista[x]);
    }
    System.out.printf("04 - posição da letra i: %d\n", palavra01.indexOf("i"));
    if (palavra01 == palavra02) {
      System.out.println("05 - São iguais");
    } else {
      System.out.println("05 - Não são iguais");;
    }
    String palavra03 = "";
    for (int x=0; x<lista.length;x++) {
      String z = lista[x];
      palavra03 += z;
    }
    System.out.println("06 - " + palavra03);
    System.out.println("07 - " + palavra01.toLowerCase());
    String palavra04 = palavra01.trim();
    System.out.println("08 - " + palavra04);
    if (palavra04.endsWith("nho")) {
      System.out.println("09 - Sim");
    } else {
      System.out.println("09 - Não");
    }
    if (palavra01 != null && palavra01.isEmpty()) {
      System.out.println("10 - Sim");
    } else {
      System.out.println("10 - Não");
    }

  }

}

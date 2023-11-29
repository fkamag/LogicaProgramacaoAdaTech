public class Textos {

  public static void main(String[] args) {
    String texto0 = new String();
    String texto1 = "";
    String texto2 = new String(" texto2 ");
    String texto3 = "hello " + "world";
    String texto4 = texto3 + texto2;

    System.out.println(texto4);


    byte b1 = -128;
    byte b2 = -1;
    byte b3 = (byte) (b1 + b2);

    System.out.println(b3);

    long cpf = 41_123_345_77L;  // '_'é desconsiderado no valor
    System.out.println(cpf);

    /*
      representacoes
      Long max = Long.MAX_VALUE;
      long creditCardNumber = 1234_5678_9012_3456L;
      long socialSecurityNumber = 999_99_9999L;
      long hexBytes = 0xFF_EC_DE_5E; // base 16
      long hexWords = 0xCAFE_BABE;
      long maxLong = 0x7fff_ffff_ffff_ffffL;
      byte nybbles = 0b0010_0101;
      long bytes = 0b11010010_01101001_10010100_10010010;
    */
  }

}

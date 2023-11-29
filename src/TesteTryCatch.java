public class TesteTryCatch {

  public static void main(String[] args) {
    double numero = -9;
    try {
      double resultado = calcularRaizQuadrada(numero);
      System.out.println("Raiz quadrada de " + numero + " é: " + resultado);
    } catch (NumeroNegativoException e) {
      System.out.println("Erro: " + e.getMessage());

    }
  }

  private static double calcularRaizQuadrada(double numero) throws NumeroNegativoException {
    if(numero < 0) {
      throw new NumeroNegativoException();
    }
    return Math.sqrt(numero);
  }

}

class NumeroNegativoException extends Exception {
  public NumeroNegativoException() {
    super("Raiz Negativa. Entre com valores não negativos");
  }
}

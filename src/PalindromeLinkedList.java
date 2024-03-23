public class PalindromeLinkedList {

  static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public static void main(String[] args) {
    // Criando a lista
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);

    // Calculando o tamanho da lista
    int size = 0;
    ListNode current = head;
    while (current != null) {
      size++;
      current = current.next;
    }
    System.out.println("Tamanho da lista original " + size);

    // Encontrando o meio da lista
    int middle = size / 2 - 1;
    ListNode middleNode = head;
    for (int i = 0; i < middle; i++) {
      middleNode = middleNode.next;
    }

    // Dividindo a lista em duas novas listas
    ListNode list1 = head;
    ListNode list2 = middleNode.next;
    middleNode.next = null;  // Desconectando as duas listas

    // Imprimindo as duas listas
    System.out.println("Lista 1:");
    printList(list1);
    System.out.println("Lista 2:");
    printList(list2);
  }

  // Método para imprimir uma lista
  public static void printList(ListNode head) {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
    System.out.println();
  }


}

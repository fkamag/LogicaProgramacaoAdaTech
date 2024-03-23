public class RemoveElement {

  public static void main(String[] args) {
    int[] nums = {3,2,2,3};
    int val = 3;
    System.out.println(removeElement(nums, val));
  }

  public static int removeElement(int[] nums, int val) {

    int[] news = nums;
    int size = 0;

    nums = new int[news.length];

    for (int i = 0, j = 0; i < news.length; i++) {
      if(news[i] != val) {
        nums[j] = news[i];
        j++;
        size++;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }

    return size;

  }



}

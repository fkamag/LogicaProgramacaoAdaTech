import java.util.Arrays;

public class MarjorityElement {

  public static void main(String[] args) {

    int[] nums = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(nums));
  }

  public static int majorityElement(int[] nums) {

    Arrays.sort(nums);

    int result = nums[0];
    int count = 1;
    int max = 0;



    for (int i = 0, j = 1; j < nums.length; i++, j++) {
      if (nums[j] == nums[i] ) {
        count++;
      } else {
        count = 1;
      }
      if (count > max) {
        max = count;
        result = nums[i];
      }
    }

    return result;
  }

}

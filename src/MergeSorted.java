public class MergeSorted {

  public static void main(String[] args) {

    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2,5,6};
    int n = 3;

    merge(nums1, m, nums2, n);

  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] newNums1 = new int[m];
    int[] newNums2 = new int[n];

    System.arraycopy(nums1, 0, newNums1, 0, m);
    System.arraycopy(nums2, 0, newNums2, 0, n);

    int j = 0;
    int k = 0;

    for (int i = 0; i < m+n; i++) {
      if (n == k) {
        nums1[i] = newNums1[j];
        j += 1;
      } else if (m == j) {
        nums1[i] = newNums2[k];
        k += 1;
      } else {
        if (newNums1[j] <= newNums2[k]) {
          nums1[i] = newNums1[j];
          j += 1;
        } else {
          nums1[i] = newNums2[k];
          k += 1;
        }
      }
    }
  }
}

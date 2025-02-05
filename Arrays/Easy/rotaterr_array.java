class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k==0) return;
        k=k%n;
        Reverse(nums , 0 , n-k-1);
        Reverse(nums , n-k , n-1);
        Reverse(nums , 0 , n-1);

    }
    public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
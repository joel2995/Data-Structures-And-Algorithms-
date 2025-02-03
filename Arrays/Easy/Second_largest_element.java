

// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        if(arr.length<2){
            return -1;
        }
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl && arr[i]!=l){
                sl=arr[i];
            }
        }
        if(sl==Integer.MIN_VALUE){return -1;}
        else{
        return sl;}
    }
}

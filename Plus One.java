class Solution {
    public int findKthPositive(int[] arr, int k) {
      int j=0, n = arr.length;
    for(int i=1; i<=1000 && j < n;i++){
      if(arr[j]!=i){
        if(--k ==0)
          return i;
      }
      else j++;
    }
    return arr[n-1]+k;
        
    }
}
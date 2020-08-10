class Solution {
    public int pivotIndex(int[] nums) {
       int sum=0,sum1=0;
       
        for(int i=0;i<nums.length;i++)
        {
                   
            sum+=nums[i];
       
     }
         for(int i=0;i<nums.length;i++)
         {
             
             if(sum1==sum-sum1-nums[i])
                 return i;
             sum1+=nums[i];
         }
        return -1;
    }
}
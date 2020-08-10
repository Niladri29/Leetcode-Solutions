class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        //int l=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                         
            {
                nums[j]=nums[i];
                j++;
                //break;
            }
                
        }
        while(j<nums.length)
            nums[j++]=0;
    }
}
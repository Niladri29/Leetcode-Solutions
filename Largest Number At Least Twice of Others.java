class Solution {
    public int dominantIndex(int[] nums) {
        int max=0,f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                f=i;
            }
                
        }
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i]*2 && nums[i]!=max)
                return -1;
        }
        return f;
    }
}
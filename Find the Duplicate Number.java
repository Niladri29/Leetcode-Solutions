class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int index= Math.abs(nums[i]);
                if(nums[index]<0)
                     return Math.abs(nums[i]);
            nums[index]=-nums[index];
        }
        return -1;
    }
}

/*this code modifies the array << nums[] = - nums[] >> But 0 ms nd beats 100% solutions

-------------------------------------------------------------*/
///this code does not modify the array but this takes 2 ms

class Solution{
    public static int findDuplicate(int[] nums) {
    if (nums.length == 0 || nums == null)
        return 0;
    int low = 1, high = nums.length - 1, mid;
    while (low < high) {
        mid = low + (high - low) / 2;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid)
                count++;
        }
        if (count > mid)
            high = mid;
        else
            low = mid + 1;
    }
    return low;
}
}
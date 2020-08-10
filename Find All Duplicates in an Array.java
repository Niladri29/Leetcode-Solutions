class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> list = new ArrayList<>();
        int [] as = new int [nums.length+1];
        for(int i=0 ;i<nums.length;i++)
        {
            as[nums[i]]++;
        }
        for(int i=1;i<nums.length+1;i++)
        {
            if(as[i]==2)
                list.add(i);
        }
        return list;
    }
}
//-------------------------5 m s ----------------------------------
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0)
                list.add(Math.abs(index+1));
            nums[index] = - nums[index];
        }
       return list;
    }
}
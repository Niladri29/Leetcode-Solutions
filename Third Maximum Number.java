class Solution {
public static int thirdMax(int[] nums) {
//first max1
int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
int n=nums.length;
//search for max1
for(int i=0;i<n;i++)
{
if(max1<nums[i])
{
max1=nums[i];
}
}
//search for max2
for(int i=0;i<n;i++)
{
if(max2<nums[i] && nums[i]!=max1)
{
max2=nums[i];
}
}
//search for max3
for(int i=0;i<n;i++)
{
if(max3<nums[i] && nums[i]!=max1 && nums[i]!=max2)
{
max3=nums[i];
}
}
//to verify max3 exist or not
int count=0;
for(int i=0;i<n;i++)
{
if(nums[i]==max1 || nums[i]==max2)
{

            count++;
        }
    }
   
    return (count==n?max1:max3);
}
}

      // USING SET--->  
      Set <Integer> sb= new TreeSet<>();
        for(int i:nums)
        {
            sb.add(i);
        }
        ArrayList<Integer> arr= new ArrayList<>(sb);
        Collections.reverse(arr);
        Integer [] a = arr.toArray(new Integer [arr.size()]);
        //a=arr.toArray();
        if(a.length<=2)
            return a[0];
        return a[2];
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int j=0;
        int [] res = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                res[j++]=A[i];
            }
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2!=0)
                res[j++]=A[i];
        }
        
        return  res;
    }
}
class Solution {
    public int heightChecker(int[] heights) {
        int [] res = new int[heights.length];
      int count=0;
        for(int i=0;i<heights.length;i++)
        {
            res[i]=heights[i];
        }
          Arrays.sort(heights);
        if(Arrays.equals(res,heights))
            return 0;
        else
        {
        
            
            for(int i=0;i<res.length;i++)
            {
               if(res[i]!=heights[i])
               {
                   count++;
               }
                
            }
        }
        return count;
    }
}
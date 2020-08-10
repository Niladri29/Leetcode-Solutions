class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0,flag=0;
        
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                count++;
                flag=i;
            }
            
        }
        
        if(count==0 || count==word.length())
            return true;
        
        else if(count==1 && flag==0)
            return true;
        
        return false;
    }
}
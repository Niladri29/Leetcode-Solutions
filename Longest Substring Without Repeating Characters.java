class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max=0,i=0,j=0;
        while(j<s.length() && i<s.length())
        {    
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,j-i);
                
            }
                
            else
               set.remove(s.charAt(i++));
        }
       
        return max;
        
    }
}
--------------------------------------------------------------


class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (chars.length <= 1) return chars.length;
        int result = 1;
        
        int start = 0;
        // loop at each step forward
        for (int end = 1; end < chars.length; end++) {
            for (int i = start; i < end; i++) {
                if (chars[i] == chars[end]) {
                    start = i + 1;
                    break;
                }
            }
            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}
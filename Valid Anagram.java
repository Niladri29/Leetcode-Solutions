class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char [] ph = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ph);
        if(Arrays.equals(ch,ph))
            return true;
        return false;
    }
}
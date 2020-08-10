class Solution {
    public boolean isPowerOfFour(int num) {
        if(num==0)
            return false;
        while(num!=1)
        {
            if(num%4!=0)
                return false;
            num=num/4;
        }
        return true;
    }
}

/*--------------------------------------------------------------------------------------
WITHOUT LOOPS------>
    For a number to be power of 4, it should-

Have all 0 bits and 1 - 1bit. eg 100,10000
Zeros after 1 should be even. One zero mean multiple of 2. 2 zero means multiple of 4.*/
    
  class Solution {
public boolean isPowerOfFour(int num) {
        return Integer.bitCount(num) == 1 && (Integer.toBinaryString(num).length()-1)%2==0;
    }
    }

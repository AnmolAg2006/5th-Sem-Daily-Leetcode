// Last updated: 8/23/2025, 10:30:21 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        boolean found=false;
        while(i!=-1)
        {
            if(digits[i]==9)
            {
                digits[i]=0;
                i--;
            }
            else{
                digits[i]++;
                found=true;
                break;
            }
        }
        if(!found)
        {
            int ans[]=new int[digits.length+1];
            ans[0]=1;
            return ans;
        }
        return digits;

    }
}
// Last updated: 8/23/2025, 10:26:06 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].charAt(1)=='+')
            {
                c++;
            }
            else{
                c--;
            }
        }
        return c;
    }
}
// Last updated: 8/23/2025, 10:29:12 PM
class Solution {
    private int bitcount(int diff) {

         int count = 0 ; 

          while(diff != 0 ){

             count  +=  diff & 1;

             diff >>= 1;

          }
          return count;
          }
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=bitcount(i);
        }
        return arr;
    }
}
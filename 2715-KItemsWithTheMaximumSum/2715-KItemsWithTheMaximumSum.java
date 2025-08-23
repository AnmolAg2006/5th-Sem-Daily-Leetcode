// Last updated: 8/23/2025, 10:25:06 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes>=k)
        {
            return k;
        }
        if(numOnes+numZeros>=k)
        {
            return numOnes;
        }
        return numOnes-(k-numOnes-numZeros);
    }
}
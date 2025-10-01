// Last updated: 10/1/2025, 9:53:48 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles/numExchange!=0)
        {
            ans+=numBottles/numExchange;
            numBottles=numBottles/numExchange+numBottles%numExchange;

        }
        return ans;
    }
}
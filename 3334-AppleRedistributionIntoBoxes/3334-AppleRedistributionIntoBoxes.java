// Last updated: 8/23/2025, 10:24:36 PM
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        for(int i:apple)
        {
            sum+=i;
        }
        int i=capacity.length;
        while(sum>0 && i>=1)
        {
            sum-=capacity[--i];
        }
        return capacity.length-i;
    }
}
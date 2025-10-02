// Last updated: 10/2/2025, 12:55:09 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int ans=0;
        int i=0;
        while(truckSize!=0 && i<boxTypes.length)
        {
            if(truckSize<boxTypes[i][0])
            {
                ans+=truckSize*boxTypes[i][1];
                break;
            }
            ans+=boxTypes[i][0]*boxTypes[i][1];
            truckSize-=boxTypes[i][0];
            i++;
        }
        return ans;
    }
}
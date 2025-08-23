// Last updated: 8/23/2025, 10:27:05 PM
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int c=0;
        for(int i=0;i<startTime.length;i++)
        {
            if(startTime[i]<=queryTime && queryTime<=endTime[i])
            {
                c++;
            }
        }
        return c;
    }
}
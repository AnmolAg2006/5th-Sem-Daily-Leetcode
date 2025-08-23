// Last updated: 8/23/2025, 10:27:47 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        int j=people.length-1;
        int ans=0;
        Arrays.sort(people);
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            {
                i++;
            }
                ans++;
                j--;
        }
        return ans;
    }
}
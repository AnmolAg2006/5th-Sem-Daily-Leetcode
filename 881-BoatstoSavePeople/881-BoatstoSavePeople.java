// Last updated: 10/1/2025, 9:41:36 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int ans=0;
        while(i<=j)
        {
            if(people[i]+people[j]>limit)
            {
                // ans++;
                // i++;
                j--;
            } else {
                i++;
                j--;
            }
            // j--;
            ans++;
        }
        return ans;
    }
}
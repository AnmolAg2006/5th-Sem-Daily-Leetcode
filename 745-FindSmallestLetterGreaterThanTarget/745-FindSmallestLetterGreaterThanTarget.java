// Last updated: 8/23/2025, 10:28:10 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;
        char ans=letters[0];
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(letters[mid]>target)
            {
                ans=letters[mid];
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        return ans;
    }
}
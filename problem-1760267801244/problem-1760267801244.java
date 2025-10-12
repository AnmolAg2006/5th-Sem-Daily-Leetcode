// Last updated: 10/12/2025, 4:46:41 PM
class Solution {
    public boolean scoreBalance(String s) {
        int total=0;
        for(char c:s.toCharArray())
            {
                total+=(c-'a'+1);
            }
        int curr=0;
        for(char c:s.toCharArray())
            {
                curr+=c-'a'+1;
                if(curr==total-curr)
                {
                    return true;
                }
            }
        return false;
    }
}
// Last updated: 9/15/2025, 12:27:42 PM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[]words=text.split(" ");
        int ans=0;
        for(String s:words)
        {
            boolean isGood=true;
            for(char c:brokenLetters.toCharArray())
            {
                if(s.indexOf(c)!=-1)
                {
                    isGood=false;
                    break;
                }
            }
            if(isGood)
            {
                ans++;
            }
        }
        return ans;
    }

}
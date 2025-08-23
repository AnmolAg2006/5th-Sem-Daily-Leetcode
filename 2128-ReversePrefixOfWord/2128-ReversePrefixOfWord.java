// Last updated: 8/23/2025, 10:26:09 PM
class Solution {
    public static String reverseString(String str)
    {
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty())
        {
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    
    public String reversePrefix(String word, char ch) {
        // for(int i=0;i<word.length();i)
        // return (ans1(word,ch));
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                word=reverseString(word.substring(0,i+1))+word.substring(i+1);
                break;
            }
        }
        return word;
    }
}
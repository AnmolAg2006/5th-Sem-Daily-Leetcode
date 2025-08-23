// Last updated: 8/23/2025, 10:26:52 PM
class Solution {
    public String makeGood(String str) {
        Stack<Character>s=new Stack<>();

        for(char ch:str.toCharArray())
        {
            if(!s.isEmpty() && Math.abs(s.peek()-ch)==32)
            {
                s.pop();
            }
            else{
                s.push(ch);
            }

        }
        StringBuilder result=new StringBuilder();
        for(char c:s)
        {
            result.append(c);
        }
        return result.toString();
    }
}
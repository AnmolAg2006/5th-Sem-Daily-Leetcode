// Last updated: 8/23/2025, 10:27:42 PM
class Solution {
    public int[] diStringMatch(String s) {
        s=s+'I';
        int ans[]=new int[s.length()];
        int c=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            st.push(i);
            if(s.charAt(i)=='I')
            {
                while(!st.isEmpty())
                {
                    ans[st.pop()]=c++;
                }
            }
        }
        return ans;
    }
}
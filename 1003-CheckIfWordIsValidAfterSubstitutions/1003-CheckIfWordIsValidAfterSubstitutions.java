// Last updated: 10/1/2025, 11:00:03 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='c')
            {
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty() || st.pop()!='b') return false;
                if(st.isEmpty() || st.pop()!='a') return false;
                
            }
        }
        return (st.isEmpty())? true:false;
        
    }
}
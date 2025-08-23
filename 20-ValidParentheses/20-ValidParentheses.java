// Last updated: 8/23/2025, 10:30:46 PM
class Solution {
    public static boolean issValid(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            if(curr=='('|| curr=='{'|| curr=='[')
            {
                s.push(curr);

            }
            else if(s.isEmpty()){
                return false;
            }
            else{
                
                char last=s.peek();
                if((curr=='}' && last!='{')||(curr==']' && last!='[')||(curr==')' && last!='(') )
                {
                    return false;
                }
                s.pop();
            }
           

        }
        if(s.isEmpty())
        {
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        return issValid(s);
    }
}
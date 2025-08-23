// Last updated: 8/23/2025, 10:28:13 PM
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<ops.length;i++)
        {
            String ch=ops[i];
            if(ch.equals("+"))
            {
                int a=s.pop();
                int b=s.peek();
                s.push(a);
                s.push(a+b);
            }
            else if(ch.equals("D"))
            {
                s.push(s.peek()*2);
            }
            else if(ch.equals("C"))
            {
                s.pop();
            }
            else{
                s.push(Integer.valueOf(ops[i]));
            }
        }
        int ans=0;
        while(!s.isEmpty())
        {
            ans+=s.pop();
        }
        return ans;
    }
}

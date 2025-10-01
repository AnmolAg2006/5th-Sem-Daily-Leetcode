// Last updated: 10/1/2025, 10:18:17 AM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int ans[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(!st.isEmpty() && temp[st.peek()]<temp[i])
            {
                while(!st.isEmpty() && temp[st.peek()]<temp[i])
                {
                    ans[st.peek()]=i-st.pop();
                }
            }
                st.push(i);
            
        }
        while(!st.isEmpty())
        {
            ans[st.pop()]=0;
        }
        return ans;
    }
}
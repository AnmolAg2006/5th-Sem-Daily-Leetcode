// Last updated: 8/23/2025, 10:27:58 PM
class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[]=new int [s.length()];
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                arr.add(i);
            }
        }
        for(int i=0;i<ans.length;i++)
        {
            int ans1=Integer.MAX_VALUE;
            for(int j:arr)
            {
                ans1=Math.min(ans1,Math.abs(i-j));
            }
            ans[i]=ans1;
        }
        return ans;
    }
}
// Last updated: 8/23/2025, 10:25:33 PM
class Solution {
    public String smallestNumber(String str) {
        Stack<Integer>s=new Stack<>();
        int c=1;
        int arr[]=new int[str.length()+1];
        for(int i=0;i<=str.length();i++)
        {
            if(i==str.length() || str.charAt(i)=='I')
            {
                arr[i]=c++;
                while(!s.isEmpty())
                {
                    arr[s.pop()]=c++;
                }
            }
            else{
                s.push(i);
            }

        }
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            s1.append(arr[i]);
        }
        return s1.toString();
    }
}
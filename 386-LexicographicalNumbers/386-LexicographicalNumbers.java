// Last updated: 8/23/2025, 10:28:59 PM
class Solution {
    public static void print(int n,int curr,List<Integer>arr)
    {

        // base case
        if(curr>n)
        {
            return ;
        }
        if(curr!=0)
        {
            arr.add(curr);
            // System.out.println(curr);
        }
        // recursion
        int i=0;
        if(curr==0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            print(n, curr*10+i,arr);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer>arr=new ArrayList<>();
        print(n,0,arr);
        return arr;
    }
}
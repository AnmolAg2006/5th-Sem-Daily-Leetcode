// Last updated: 8/23/2025, 10:24:23 PM
class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> arr=new ArrayList<>();
        func(arr,"",n);
        return arr;
    }
    public static void func(ArrayList<String> arr,String ans,int n)
    {
        // base case
        int n1=ans.length();
        if(ans.length()==n)
        {
            arr.add(ans);
            return ;
        }


        // recursion
        if(!(ans+"0").contains("00"))
        {
            func(arr, ans+'0', n);
        }
        func(arr, ans+'1', n);
    }
}
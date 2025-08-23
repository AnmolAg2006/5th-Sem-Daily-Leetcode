// Last updated: 8/23/2025, 10:30:47 PM
class Solution {
    public static void generate(int n,int open, int close,String ans,List<String> arr) {
        // base condition
        if (open > n || close > open) {
            return;
        } else if (open == n && close == n) {
            // System.out.println(ans);
            arr.add(ans);
            return;
        }

        // recursion
        generate(n,open + 1, close,ans+"(",arr);
        generate(n,open, close + 1,ans+")",arr);
    }
   
    public List<String> generateParenthesis(int n) {
        List<String> arr=new ArrayList<>();
        generate(n,0,0,"",arr);
        return arr;
    }
}
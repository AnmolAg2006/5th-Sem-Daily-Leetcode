// Last updated: 8/23/2025, 10:28:02 PM
class Solution {
    public static void print(String s, String ans, List<String> ans1) {
        if (s.length() == 0) {
            ans1.add(ans);
            return;
        }
        
        char ch = s.charAt(0);
        
        // If it's a digit, just add it to the answer and move on
        if (ch >= '0' && ch <= '9') {
            print(s.substring(1), ans + ch, ans1);
        }
        
        // If it's a lowercase letter, add both lowercase and uppercase
        else if (ch >= 'a' && ch <= 'z') {
            print(s.substring(1), ans + ch, ans1); // keep it lowercase
            print(s.substring(1), ans + (char)(ch - 32), ans1); // convert to uppercase
        }
        
        // If it's an uppercase letter, add both uppercase and lowercase
        else if (ch >= 'A' && ch <= 'Z') {
            print(s.substring(1), ans + ch, ans1); // keep it uppercase
            print(s.substring(1), ans + (char)(ch + 32), ans1); // convert to lowercase
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans1=new ArrayList<>();
        print(s,"",ans1);
        return ans1;
    }
}
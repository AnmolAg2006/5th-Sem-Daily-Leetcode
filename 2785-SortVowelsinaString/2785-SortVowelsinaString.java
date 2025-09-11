// Last updated: 9/11/2025, 10:36:48 AM
class Solution {
    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        }
        return false;
    }

    public String sortVowels(String s) {
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->(int)a-(int)b);
        for(char c:s.toCharArray()) {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                pq.add(c);
            }
        }
        StringBuilder ans=new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                ans.setCharAt(i,pq.poll());
            }
        }
        return ans.toString();
    }
}
// Last updated: 12/14/2025, 2:22:39 PM
1class Solution {
2    public String reverseWords(String s) {
3        String words[]=s.split(" ");
4        int n=cVowels(words[0]);
5        StringBuilder ans=new StringBuilder(words[0]);
6        for(int i=1;i<words.length;i++)
7        {
8            String st=words[i];
9            if(cVowels(st)==n) {
10                ans.append(" "+new StringBuilder(st).reverse().toString());
11            } else {
12                ans.append(" "+st);
13            }
14        }
15        return ans.toString();
16    }
17     private static int cVowels(String s) {
18        int c = 0;
19        for (char ch : s.toCharArray()) {
20            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
21                c++;
22            }
23        }
24        return c;
25    }
26}
// Last updated: 8/23/2025, 10:28:58 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int arr[]=new int[26];
        int l=t.length();
        for(int i=0;i<l;i++)
        {
            arr[(int)t.charAt(i)-97]++;
        }
        for(int i=0;i<l-1;i++)
        {
            arr[(int)s.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==1)
            {
                return (char)(i+97);
            }
        }
        return 'a';
    }
}
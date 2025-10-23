// Last updated: 10/23/2025, 10:07:40 AM
class Solution {
    public boolean hasSameDigits(String s) {
        int i=0;
        char arr[]=s.toCharArray();
        while(arr.length-i!=2)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                arr[j]=(char)(((arr[j] - '0') + (arr[j + 1] - '0')) % 10 + '0');
            }
            
            i++;
        }
        return arr[0]==arr[1];
    }
}
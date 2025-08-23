// Last updated: 8/23/2025, 10:26:45 PM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int temp[]=new int[code.length];
        if(k==0)
        {
            for(int i=0;i<code.length;i++)
            {
                code[i]=0;
            }

        }
        else if(k>0)
        {
            for(int i=0;i<code.length;i++)
            {
                int s=0;
                for(int j=i+1;j<i+1+k;j++)
                {
                    s+=code[j%code.length];
                }
                temp[i]=s;
            }
        }
        else{
            for(int i=0;i<code.length;i++)
            {
                int s=0;
                for(int j=i-1;j>i-1+k;j--)
                {
                    s+=code[(j%code.length+code.length)%code.length];
                }
                temp[i]=s;
            }
        }
        return temp;

    }
}
// Last updated: 12/6/2025, 5:16:21 PM
1class Solution {
2    public int maximumTastiness(int[] price, int k) {
3        Arrays.sort(price);
4        int lo=0;
5        int hi=price[price.length-1]-price[0];
6        while(lo<hi)
7        {
8            int mid=(lo+hi)/2+1;
9            if(isPossible(price,k,mid))
10            {
11                lo=mid;
12            }
13            else {
14                hi=mid-1;
15            }
16
17        }
18        return lo;
19    }
20    public static boolean isPossible(int price[],int k,int max)
21    {
22        int last=price[0];
23        int c=1;
24        int i=1;
25        while(i<price.length && c<k)
26        {
27            if(price[i]-last>=max)
28            {
29                c++;
30                last=price[i];
31            }
32            i++;
33        }
34        return c==k;
35    }
36}
// Last updated: 12/6/2025, 12:35:11 PM
1class Solution {
2    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
3        int arr[][]=new int[difficulty.length][2];
4        for(int i=0;i<difficulty.length;i++)
5        {
6            arr[i][0]=difficulty[i];
7            arr[i][1]=profit[i];
8        }
9        Arrays.sort(arr,(a,b)->a[0]-b[0]);
10        int ans=0;
11        for(int i=0;i<worker.length;i++)
12        {
13            int w=worker[i];
14            int max=0;
15            for(int j=0;j<arr.length;j++)
16            {
17                if(arr[j][0]>w) {
18                    ans+=max;
19                    break;
20                } 
21                max=Math.max(max,arr[j][1]);
22                if(j==arr.length-1)
23                {
24                    ans+=max;
25                }
26            }
27        }
28        return ans;
29    }
30}
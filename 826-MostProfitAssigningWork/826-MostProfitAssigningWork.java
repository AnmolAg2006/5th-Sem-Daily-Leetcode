// Last updated: 12/6/2025, 12:54:25 PM
1class Solution {
2    public static int fun(int arr[][],int k)
3    {
4        int lo=0;
5        int hi=arr.length-1;
6        int res=-1;
7        while(lo<=hi)
8        {
9            int mid=(lo+hi)/2;
10            if(arr[mid][0]>k)
11            {
12                hi=mid-1;
13            } else {
14                res=mid;
15                lo=mid+1;
16            } 
17        }
18        return res==-1?0:arr[res][1];
19
20    }
21    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
22        int arr[][]=new int[difficulty.length][2];
23        for(int i=0;i<difficulty.length;i++)
24        {
25            arr[i][0]=difficulty[i];
26            arr[i][1]=profit[i];
27        }
28        Arrays.sort(arr,(a,b)->a[0]-b[0]);
29        for(int i=1;i<arr.length;i++){
30            if(arr[i][1] < arr[i-1][1]) arr[i][1] = arr[i-1][1];
31        }
32        int ans=0;
33
34        for(int i=0;i<worker.length;i++)
35        {
36            ans+=fun(arr,worker[i]);
37        }
38        return ans;
39    }
40}
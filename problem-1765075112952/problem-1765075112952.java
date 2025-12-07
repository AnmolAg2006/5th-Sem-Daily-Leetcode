// Last updated: 12/7/2025, 8:08:32 AM
1class Solution {
2    public static int ref(int n)
3    {
4        String s=new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
5        int i = 0;
6        while(i < s.length() && s.charAt(i) == '0') i++;
7        return Integer.parseInt(s.substring(i),2);
8    }
9    public int[] sortByReflection(int[] nums) {
10        int n=nums.length;
11        int arr[][]=new int[n][2];
12        for(int i=0;i<n;i++)
13            {
14                arr[i][0]=nums[i];
15                arr[i][1]=ref(nums[i]);
16            }
17        Arrays.sort(arr,(a,b)->(a[1]==b[1])?a[0]-b[0]:a[1]-b[1]);
18        for(int i=0;i<n;i++)
19            {
20                nums[i]=arr[i][0];
21            }
22        return nums;
23    }
24}
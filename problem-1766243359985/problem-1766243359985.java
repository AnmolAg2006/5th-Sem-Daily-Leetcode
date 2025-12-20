// Last updated: 12/20/2025, 8:39:19 PM
1class Solution {
2    public int maximumSum(int[] nums) {
3        Arrays.sort(nums);
4        int sum = 0;
5        ArrayList<Integer> arr0 = new ArrayList<>();
6        ArrayList<Integer> arr1 = new ArrayList<>();
7        ArrayList<Integer> arr2 = new ArrayList<>();
8        for (int i = nums.length - 1; i >= 0; i--) {
9            // sum+=(3:3,3:2,3:1,(3:1,2:1,1:1))
10            if (nums[i] % 3 == 0 && arr0.size() < 3) {
11                arr0.add(nums[i]);
12            } else if (nums[i] % 3 == 1 && arr1.size() < 3) {
13                arr1.add(nums[i]);
14            } else if (nums[i] % 3 == 2 && arr2.size() < 3) {
15                arr2.add(nums[i]);
16            }
17        }
18        int ans0=0;
19        int ans1=0;
20        int ans2=0;
21        int ansc=0;
22        if(arr0.size()==3)
23        {
24            ans0+=arr0.get(0);
25            ans0+=arr0.get(1);
26            ans0+=arr0.get(2);
27        } 
28        if(arr1.size()==3) {
29            ans1+=arr1.get(0);
30            ans1+=arr1.get(1);
31            ans1+=arr1.get(2);
32        } 
33        if(arr2.size()==3) {
34            ans2+=arr2.get(0);
35            ans2+=arr2.get(1);
36            ans2+=arr2.get(2);
37        } 
38        if(!arr0.isEmpty() && !arr1.isEmpty() && !arr2.isEmpty()) {
39            ansc+=arr1.get(0);
40            ansc+=arr2.get(0);
41            ansc+=arr0.get(0);
42        }
43        System.out.println(ans0+" "+ans1+" "+ans2+" "+ansc);
44        return Math.max(Math.max(ans0,ans1),Math.max(ans2,ansc));
45    }
46}
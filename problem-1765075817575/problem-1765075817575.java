// Last updated: 12/7/2025, 8:20:17 AM
1class Solution {
2    public static boolean isPrime(int n)
3    {
4        if(n==2 || n==3) return true;
5        int lim=(int)Math.sqrt(n);
6        for(int i=2;i<=lim;i++)
7            {
8                if(n%i==0) return false;
9            }
10        return true;
11    }
12    public int largestPrime(int n) {
13        int sum=0,ans=0;
14        HashSet<Integer>arr=new HashSet<>();
15        for(int i=2;i<=n;i++)
16            {
17                if(isPrime(i))
18                {
19                    sum+=i;
20                    if(sum>n) break;
21                    arr.add(sum);
22                     if(isPrime(sum))
23                    {
24                        ans=sum;
25                    }
26                }
27            }
28        return ans;
29    }
30}
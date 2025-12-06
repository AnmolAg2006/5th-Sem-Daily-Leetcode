// Last updated: 12/6/2025, 8:46:01 PM
1class Solution {
2    public static boolean isPrime(int n)
3    {
4        if(n==2 || n==3)
5        {
6            return true;
7        }
8        if(n<=1)
9        {
10            return false;
11        }
12        if (n % 2 == 0) return false;
13        int limit = (int)Math.sqrt(n);
14        for(int i=3;i<=limit;i++)
15            {
16                if(n%i==0) return false;
17            }
18        return true;
19    }
20    public boolean completePrime(int num) {
21        String s=String.valueOf(num);
22        for(int i=1;i<=s.length();i++)
23            {
24                int p=Integer.parseInt(s.substring(0,i));
25                if(!isPrime(p)) return false;
26            }
27        for(int i=s.length()-1;i>=0;i--)
28            {
29                int p=Integer.parseInt(s.substring(i));
30                if(!isPrime(p)) return false;
31            }
32        return true;
33    }
34}
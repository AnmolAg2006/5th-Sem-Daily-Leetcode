// Last updated: 12/12/2025, 3:22:35 PM
1class Solution {
2    public static void handleOffline(List<String> event,int[] ot) {
3        ot[Integer.parseInt(event.get(2))]=Integer.parseInt(event.get(1));
4    }
5
6    public static void handleMessage(List<String> event, int[] men, int[] ot) {
7        int t=Integer.parseInt(event.get(1));
8        String s = event.get(2);
9        String str[] = s.split(" ");
10        for (String st : str) {
11            if(st.equals("ALL")) for(int i=0;i<men.length;i++) men[i]++;
12            else if(st.equals("HERE")) {
13                for(int i=0;i<men.length;i++)
14                {
15                    if(ot[i]==0 || ot[i]+60<=t) men[i]++;
16                }
17            } 
18            else men[Integer.parseInt(st.substring(2))]++;
19        }
20    }
21
22    public int[] countMentions(int n, List<List<String>> events) {
23        int men[]=new int[n];
24        int ot[]=new int[n];
25        events.sort((a,b)->{
26            int ta=Integer.parseInt(a.get(1));
27            int tb=Integer.parseInt(b.get(1));
28            return (ta==tb)?b.get(0).compareTo(a.get(0)):ta-tb;
29        });
30        for(List<String>i:events)
31        {
32            if(i.get(0).equals("MESSAGE")) {
33                handleMessage(i, men, ot);
34                
35            } else {
36                handleOffline(i,ot);
37            }
38
39        }
40        return men;
41    }
42}
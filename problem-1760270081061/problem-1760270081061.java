// Last updated: 10/12/2025, 5:24:41 PM
class ExamTracker {

    static List<Integer>times;
    static List<Long>scores;
    public ExamTracker() {
        times=new ArrayList<>();
        scores=new ArrayList<>();
    }
    
    public void record(int time, int score) {
        times.add(time);
        scores.add(scores.isEmpty()?(long)score:(long)scores.get(scores.size()-1)+score);
    }
    
    public long totalScore(int startTime, int endTime) {
        if(times.isEmpty())
        {
            return 0;
        }
        int lo=lower(times,startTime);
        int hi=higher(times,endTime)-1;
        if (lo > hi || hi < 0 || lo >= times.size())  return 0;
     long leftSum = (lo == 0) ? 0 : scores.get(lo - 1);
        return scores.get(hi)-leftSum;
    }
    public static int lower(List<Integer>arr,int k)
    {
        int lo=0;
        int hi=arr.size();
        while(lo<hi)
            {
                int mid=(lo+hi)/2;
                if(arr.get(mid)>=k)
                {
                    hi=mid;
                } else {
                    lo=mid+1;
                }
            }
        return lo;
    }
    public static int higher(List<Integer>arr,int k)
    {
        int lo=0;
        int hi=arr.size();
        while(lo<hi)
            {
                int mid=(lo+hi)/2;
                if(arr.get(mid)>k)
                {
                    hi=mid;
                } else {
                    lo=mid+1;
                }
            }
        return lo;
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */
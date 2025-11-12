// Last updated: 11/12/2025, 7:56:32 PM
class Solution {
    public static boolean isItPossible(int weights[],int x,int days){
        int k=1;
        int sum=0;
        for(int i=0;i<weights.length;i++) {
            if(sum+weights[i]>x)
            {
                k++;
                sum=weights[i];
            }else{
                sum+=weights[i];
            }
        }
        return (k<=days)?true:false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE;
        int h=0;
        for(int i:weights){
            l=Math.max(i,l);
            h+=i;
        }
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(isItPossible(weights,mid,days))
            {
                h=mid-1;
                ans=mid;
            } else{
                l=mid+1;
            }
        }
        return ans;
    }
}
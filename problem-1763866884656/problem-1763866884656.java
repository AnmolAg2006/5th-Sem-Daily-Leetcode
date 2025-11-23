// Last updated: 11/23/2025, 8:31:24 AM
class Solution {
    static final long MOD = 1_000_000_007L;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int[] cnt = new int[n];         
        long[] prex = new long[n + 1];     
        long[] pres = new long[n + 1];    
        long[] pow  = new long[n + 1];    

        pow[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow[i] = (pow[i - 1] * 10L) % MOD;
        }

        int k = 0; 
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != '0') {
                int d = c - '0';
                k++;
                prex[k] = (prex[k - 1] * 10L + d) % MOD;
                pres[k] = (pres[k - 1] + d) % MOD;
            }
            cnt[i] = k;
        }

        int q = queries.length;
        int[] ans = new int[q];

        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int lc = (l == 0) ? 0 : cnt[l - 1];
            int rc = cnt[r];   

            int len = rc - lc;
            if (len <= 0) {
                ans[i] = 0; 
                continue;
            }

            int L = lc + 1; 
            int R = rc;     

            long val = prex[R] - (prex[L - 1] * pow[len]) % MOD;
            if (val < 0) val += MOD;

            long sum = pres[R] - pres[L - 1];
            sum %= MOD;
            if (sum < 0) sum += MOD;

            long res = (val * (sum % MOD)) % MOD;
            ans[i] = (int) res;
        }

        return ans;
    }
}

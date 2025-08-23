// Last updated: 8/23/2025, 10:25:13 PM
class Solution {
    public int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        int e = 0;
        int o = 0;
        int arr[] = new int[2];
        int n1 = s.length();
        if (n1 % 2 == 0) {
            for (int i = 0; i < n1; i++) {
                if (s.charAt(i) == '1') {
                    if (i % 2 == 0) {
                        e++;
                    } else {
                        o++;
                    }
                }
            }
            arr[0] = o;
            arr[1] = e;
        } else {
            for (int i = 0; i < n1; i++) {
                if (s.charAt(i) == '1') {
                    if (i % 2 == 0) {
                        e++;
                    } else {
                        o++;
                    }
                }
            }
            arr[0] = e;
            arr[1] = o;
        }
        return arr;
    }
}
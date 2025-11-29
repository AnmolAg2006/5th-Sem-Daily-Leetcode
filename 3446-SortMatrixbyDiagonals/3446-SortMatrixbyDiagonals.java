// Last updated: 11/29/2025, 11:01:59 PM
1import java.util.*;
2
3class Solution {
4    public int[][] sortMatrix(int[][] matrix) {
5        Map<Integer, PriorityQueue<Integer>> diagonalMap = new HashMap<>();
6        int n = matrix.length;
7
8        for (int i = 0; i < n; i++) {
9            for (int j = 0; j < n; j++) {
10                int key = i - j;
11                diagonalMap.putIfAbsent(key, key < 0 ? new PriorityQueue<>() 
12                                                     : new PriorityQueue<>(Collections.reverseOrder()));
13                diagonalMap.get(key).offer(matrix[i][j]);
14            }
15        }
16
17        for (int i = 0; i < n; i++) {
18            for (int j = 0; j < n; j++) {
19                int key = i - j;
20                matrix[i][j] = diagonalMap.get(key).poll();
21            }
22        }
23
24        return matrix;
25    }
26}
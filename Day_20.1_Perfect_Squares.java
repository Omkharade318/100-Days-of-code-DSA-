class Solution {
    public int numSquares(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, Integer.MAX_VALUE); // because we are picking up minimum
        memo[0] = 0; // base condition
        
        for(int i=1;i<=n;i++) { // recursive function
            for(int j=1;j*j<=i;j++) { // loop in function
                memo[i] = Math.min(memo[i], 1 + memo[i-(j*j)]); // returning result
            }
        }

        return memo[n];
    }
}

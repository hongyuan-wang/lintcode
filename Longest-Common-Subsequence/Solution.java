public class Solution {
    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        int[][] store = new int[A.length()+1][B.length()+1];
        for(int i=0; i<A.length()+1; i++) {
            store[i][0] = 0;
        }
        for(int j=0; j<B.length()+1; j++) {
            store[0][j] = 0;
        }
        for(int i=1; i<A.length()+1; i++) {
            for(int j=1; j<B.length()+1; j++) {
                if(A.charAt(i-1) == B.charAt(j-1)) {
                    store[i][j] = store[i-1][j-1] + 1;
                } else {
                    store[i][j] = store[i-1][j] > store[i][j-1] ? store[i-1][j] : store[i][j-1];
                }
            }
        }
        
        return store[A.length()][B.length()];
    }
}

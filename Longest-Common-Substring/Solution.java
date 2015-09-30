public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        int[][] store = new int[A.length()][B.length()];
        int max = 0;
        for(int i=0; i<A.length(); i++) {
            for(int j=0; j<B.length(); j++) {
                if(A.charAt(i) == B.charAt(j)) {
                    if(i==0 || j==0) {
                        store[i][j] = 1;
                    } else {
                        store[i][j] = store[i-1][j-1] + 1;
                    }
                    if(store[i][j] > max) {
                        max = store[i][j];
                    }
                } else {
                    store[i][j] = 0;
                }
            }
        }
        
        return max;
    }
}

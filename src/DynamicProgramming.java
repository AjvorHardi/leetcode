public class DynamicProgramming {

    public static int longestSubString(String a, String b) {
        int[][] mat = new int[a.length() + 1][b.length() + 1];
        int maxLength = 0;

        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    mat[i][j] = mat[i-1][j-1] + 1;
                    maxLength = Math.max(maxLength, mat[i][j]);
                }
            }
        }
        return maxLength;
    }

}

class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < t.length(); i++) {
            try {
                if (s.charAt(a) == t.charAt(b)) {
                    a++;
                    b++;
                } else {
                    b++;
                }
            } catch (Exception e) {
                break;
            }
        }
        return a == s.length();
    }
}

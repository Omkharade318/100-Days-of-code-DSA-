class Solution {
    public boolean isPalindrome(String s) {
         s= s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);
        String ss ="";
        for (int i = s.length()-1; i >=0; i--) {
            ss+=s.charAt(i);
        }
    return(s.equals(ss));
    }
}

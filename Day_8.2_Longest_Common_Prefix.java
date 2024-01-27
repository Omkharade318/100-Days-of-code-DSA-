class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder str = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last  = v[v.length-1];
        for(int i = 0; i< Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return str.toString();
            }
          else  str.append(first.charAt(i));
        }
        return str.toString();
    }
}

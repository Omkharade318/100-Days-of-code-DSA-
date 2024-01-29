class Solution {
    public String convert(String s, int numRows) {
        String [] lines = new String[numRows];
        int i =0, j, n = s.length();

        for(j=0; j<numRows && i<n; j++){
            lines[j] = "";
        }

        while(i<n){
            for(j = 0; j < numRows && i<n;j++){
                lines[j] +=s.charAt(i++);
            }
            for(j = numRows-2; j>0 && i<n; j--){
                lines[j] += s.charAt(i++);
            }
        }
        s="";
        for(j=0; j<numRows; j++){
            s += lines[j];
        }
        return s;
    }
}

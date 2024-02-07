class Solution {
    public boolean canConstruct(String r, String m) {
        int a[] = new int [26];
        int b[] = new int [26];
        Arrays.fill(a,0);
        Arrays.fill(b,0);
        for(int i=0;i<r.length();i++)
        {
            a[r.charAt(i)-97]++;
        }
        for(int i=0;i<m.length();i++)
        {
            b[m.charAt(i)-97]++;
        }
        // System.out.println(a[0]);
        for(int i=0;i<26;i++)
        {
            if(b[i]!=0 && b[i]<a[i])
                return false;
            if(a[i]>b[i])
                return false;
        }
        return true;
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
       Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<int []> ans=new ArrayList<>();
        for(int i=0;i<n;i++){     
        int start=intervals[i][0];
        int end=intervals[i][1];
        if(!ans.isEmpty() && end<=ans.get(ans.size()-1)[1]) continue;

        for(int j=i+1;j<n;j++){
            if(intervals[j][0]<=end) {
                end=Math.max(end,intervals[j][1]);
                start=Math.min(start,intervals[j][0]);
                
                }
            else break;
        }
        int temp[]={start,end};
      
        ans.add(temp);
        
        }
         int[][] result = new int[ans.size()][];
        for (int i = 0; i < ans.size(); i++) {
             result[i] = ans.get(i);
        }
       
        
        return result;
    }
}

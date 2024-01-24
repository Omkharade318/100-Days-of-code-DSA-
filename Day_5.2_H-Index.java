class Solution {
    public int hIndex(int[] citations) {
        int low=0 , high = citations.length;
        while(low < high){
            int mid = (low+high+1)/2;
            int cnt=0;
            for(int i=0 ; i<citations.length ; i++) if(citations[i] >= mid) cnt++;
            if(cnt >= mid) low = mid;
            else high = high=mid-1;
        }
        return low;
    }
}

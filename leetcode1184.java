class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = 0;
        int isum = 0;
        for(int i=0;i<distance.length;i++){
            sum = sum+distance[i];
        }
        if(start<destination){
            for(int i=start;i<destination;i++){
            isum = isum + distance[i];
            }
        } else{
            for(int i=destination;i<start;i++){
            isum = isum + distance[i];
        }

        }
        
        int ans = sum-isum;
        return Math.min(ans,isum);
    }
}

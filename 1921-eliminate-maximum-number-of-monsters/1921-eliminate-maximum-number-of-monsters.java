class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
       int wpTime = 0, killCount = 0, sz = dist.length;
        PriorityQueue<Integer> reachTimes = new PriorityQueue<>();
        for(int indx = 0; indx < sz; indx++){
           
            int timeToReach = (dist[indx] + speed[indx] - 1) / speed[indx];
            reachTimes.offer(timeToReach);
        }
        while(!reachTimes.isEmpty()){
            int currRTime = reachTimes.poll ();
            if(wpTime >= currRTime && killCount > 0){
                return killCount;
            }else{
                killCount++;
            }
            wpTime++;
        }
        return killCount; 
    }
}
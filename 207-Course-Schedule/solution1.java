public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //bfs with queue
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<Integer>());
        }
        
        int[] preNum = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
            preNum[prerequisites[i][0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(preNum[i]==0) queue.add(i);
        }
        int count = numCourses;
        while(!queue.isEmpty()){
            int out = queue.poll();
            for(int i : out){
                if(--preNum[i]==0){
                    queue.add(i);
                } 
            }
            count--;
        }
        return count==0;
    }
}
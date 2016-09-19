public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //bfs
        int[] preNum = new int[numCourses];
        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<numCourses;i++){
            graph.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
            preNum[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] res = new int[numCourses];
        int count = 0;
        for(int i=0;i<numCourses;i++){
            if(preNum[i]==0){
                queue.add(i);
                res[count++] = i;
            } 
        }
        int possible = 0;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int i : graph.get(cur)){
                if(--preNum[i]==0){
                    queue.add(i);
                    res[count++] = i;
                    
                }
            }
            possible++;
        }
        if(possible==numCourses) return res;
        else return new int[0];
    }
}
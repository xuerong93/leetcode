public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses>=0 && prerequisites.length==0) return true;
        
        int[] visited = new int[numCourses];
        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            graph.put(prerequisites[i][1],new ArrayList<Integer>());
        }
        for(int[] pre:prerequisites){
            graph.get(pre[1]).add(pre[0]);
        }
        for(int i=0;i<numCourses;i++){
            if(!canFinish(graph,visited,i))
                return false;
        }
        return true;
    }
    
    public boolean canFinish(HashMap<Integer,ArrayList<Integer>> graph, int[] visited, int i){
        if(visited[i]==-1) return false;
        if(visited[i]==1) return true;
        
        visited[i]=-1;
        if(graph.containsKey(i)){
            for(int j:graph.get(i)){
                if(!canFinish(graph,visited,j))
                    return false;
            }
        }
        visited[i]=1;
        return true;
    }
}
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<Integer,ArrayList<Integer>>;
        for(int i = 0 ; i<prerequisites.length;i++){
            ArrayList<Integer> list = new ArrayList<Integer>;
            if(graph.containsKey(prerequisites[i][1])){
                graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }
            else{
                list.add(prerequisites[i][0]);
                graph.put((prerequisites[i][1]),(prerequisites[i][0]));
            }
        }
        
        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(!canFinish(graph,visited,i)) return false;
        }
        return true;
    }
    public boolean canFinish(HashMap<Integer,ArrayList<Integer>> graph, int[] visited, int i){
        if(visited[i]==1) return false;
        if(visited[i]==-1) return true;
        
        visited[i]=1;
        if(graph.containsKey(i)){
            for(int k : graph.get(i)){
                if(!canFinish(graph,visited,k)) return false;
            }
        }
        visited[i]=-1;
        return true;
    }
}
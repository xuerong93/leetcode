public class Solution {
    private int count;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //dfs
        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<numCourses;i++){
            graph.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] visited = new int[numCourses];
        int[] result = new int[numCourses];
        count=numCourses-1;
        for(int i=0;i<numCourses;i++){
            if(!canFinish(graph,visited,i,result)){
                return new int[0];
            }
        }
        return result;
    }
    public boolean canFinish(HashMap<Integer,ArrayList<Integer>> graph, int[] visited, int i, int[] result){
        //has been visited
        if(visited[i]==1){
            return false;
        }
        //has been added to list
        if(visited[i]==-1){
            return true;
        }
        
        visited[i]=1;
        if(graph.containsKey(i)){
            for(int k:graph.get(i)){
                if(!canFinish(graph,visited,k,result)) return false;
            }
        }
        result[count--]=i;
        visited[i]=-1;
        return true;
    }
}
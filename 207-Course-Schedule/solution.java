public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //dfs，DFS的解法，也需要建立有向图，还是用二维数组来建立，和BFS不同的是，我们像现在需要一个一维数组visit来记录访问状态，大体思路是，先建立好有向图，然后从第一个门课开始，找其可构成哪门课，暂时将当前课程标记为已访问，然后对新得到的课程调用DFS递归，直到出现新的课程已经访问过了，则返回false，没有冲突的话返回true，然后把标记为已访问的课程改为未访问。
       int len = prerequisites.length;
 
    if(numCourses == 0 || len == 0){
        return true;
    }
 
    //track visited courses
    int[] visit = new int[numCourses];
 
    // use the map to store what courses depend on a course 
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
    for(int[] a: prerequisites){
        if(map.containsKey(a[1])){
            map.get(a[1]).add(a[0]);
        }else{
            ArrayList<Integer> l = new ArrayList<Integer>();
            l.add(a[0]);
            map.put(a[1], l);
        }
    }
 
    for(int i=0; i<numCourses; i++){
        if(!canFinishDFS(map, visit, i))
            return false;
    }
 
    return true;
}
 
private boolean canFinishDFS(HashMap<Integer,ArrayList<Integer>> map, int[] visit, int i){
    if(visit[i]==-1) 
        return false;
    if(visit[i]==1) 
        return true;
 
    visit[i]=-1;
    if(map.containsKey(i)){
        for(int j: map.get(i)){
            if(!canFinishDFS(map, visit, j)) 
                return false;
        }
    }
 
    visit[i]=1;
 
    return true;
}
}
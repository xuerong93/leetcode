public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //bfs
        //store relationship of nodes
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<prerequisites.length;i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(map.containsKey(prerequisites[i][1])){
                map.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }else{
                list.add(prerequisites[i][0]);
                map.put(prerequisites[i][1],list);
            }
            
            
        }
        
        //be how many prerequesites of a course
        int[] preNum = new int[numCourses];
        for(int i=0; i<numCourses;i++){
            if(map.containsKey(i)){
                ArrayList<Integer> list = map.get(i);
                Iterator<Integer> it = list.iterator();
                while(it.hasNext()){
                    preNum[it.next()]++;
                }
            }
            
        }
        
        //remove non-pre course each time
        for(int i=0; i<numCourses;i++){
            int j=0;
            for(;j<numCourses;j++){
                if(preNum[j]==0) break;
            }
            if(j==numCourses) return false;
            
            preNum[j]=-1;
            
            if(map.containsKey(j)){
                ArrayList<Integer> list = map.get(j);
                Iterator<Integer> it = list.iterator();
                while(it.hasNext()){
                    preNum[it.next()]--;
                }
            }
            
        }
        return true;
    }
}
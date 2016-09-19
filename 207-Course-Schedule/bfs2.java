public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //bfs入度     出度 ，我们开始先根据输入来建立这个有向图，并将入度数组也初始化好。然后我们定义一个queue变量，将所有入度为0的点放入队列中，然后开始遍历队列，从graph里遍历其连接的点，每到达一个新节点，将其入度减一，如果此时该点入度为0，则放入队列末尾。直到遍历完队列中所有的值，若此时还有节点的入度不为0，则说明环存在，返回false，反之则返回true。
        
        // init the adjacency list  
        List<Set> posts = new ArrayList<Set>();  
        for (int i = 0; i < numCourses; i++) {  
            posts.add(new HashSet<Integer>());  
        }  
          
        // fill the adjacency list  
        for (int i = 0; i < prerequisites.length; i++) {  
            posts.get(prerequisites[i][1]).add(prerequisites[i][0]);  
        }  
          
        // count the pre-courses  
        int[] preNums = new int[numCourses];  
        for (int i = 0; i < numCourses; i++) {  
            Set set = posts.get(i);  
            Iterator<Integer> it = set.iterator();  
            while (it.hasNext()) {  
                preNums[it.next()]++;  
            }  
        }  
          
        // remove a non-pre course each time  
        for (int i = 0; i < numCourses; i++) {  
            // find a non-pre course  
            int j = 0;  
            for ( ; j < numCourses; j++) {  
                if (preNums[j] == 0) break;  
            }  
              
            // if not find a non-pre course  
            if (j == numCourses) return false;  
              
            preNums[j] = -1;  
              
            // decrease courses that post the course  
            Set set = posts.get(j);  
            Iterator<Integer> it = set.iterator();  
            while (it.hasNext()) {  
                preNums[it.next()]--;  
            }  
        }  
          
        return true;  
  
    }
}
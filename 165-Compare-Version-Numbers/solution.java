public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] part1=version1.split("\\.");
        String[] part2=version2.split("\\.");
        int i=0;
        while(i<part1.length || i<part2.length){
            while(i<part1.length && i<part2.length){
                if(Integer.parseInt(part1[i])>Integer.parseInt(part2[i])) return 1;
                else if(Integer.parseInt(part1[i])<Integer.parseInt(part2[i])) return -1;
                i++;
            }
            while(i<part1.length){
                if(Integer.parseInt(part1[i])>0) return 1;
                i++;
            }
            while(i<part2.length){
                if(Integer.parseInt(part2[i])>0) return -1;
                i++;
            }
        }
        return 0;
    }
}
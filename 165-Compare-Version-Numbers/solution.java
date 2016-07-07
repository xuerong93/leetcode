public class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] part1=version1.split("\\.");
        String[] part2=version2.split("\\.");
        if(Integer.parseInt(part1[0])>Integer.parseInt(part2[0])) return 1;
        else if(Integer.parseInt(part1[0])<Integer.parseInt(part2[0])) return -1;
        else{
            for(int i=0;i<Math.min(part1[1].length(),part2[1].length());i++){
                if(part1[1].charAt(i)>part2[1].charAt(i)) return 1;
                else if(part1[1].charAt(i)<part2[1].charAt(i)) return -1;
            }
            if(part1[1].length()>part2[1].length()){
                for(int i = part2[1].length();i<part1[1].length();i++){
                    if(part1[1].charAt(i)>'0') return 1;
                }
                return 0;
            }
            if(part1[1].length()<part2[1].length()){
                for(int i = part1[1].length();i<part2[1].length();i++){
                    if(part2[1].charAt(i)>'0') return -1;
                }
                return 0;
            }
        }

        return 0;
    }
}
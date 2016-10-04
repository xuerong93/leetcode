public class Solution {
    class TrieNode{
        TrieNode[] next = new TrieNode[26];
        String word;
    }
    public TrieNode buildTrie(String[] words){
        TrieNode root= new TrieNode();
        for(String word : words){
            TrieNode n = root;
            for(char c: word.toCharArray()){
               int i = c-'a';
               if(n.next[i] == null) {
                   n.next[i] = new TrieNode();
               }
               n=n.next[i];
            }
            n.word = word;
        }
        return root;
    }
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res= new ArrayList<String>();
        //use trie tree and backtracking, at the end of the word set a flag to de-duplicate
        int m = board.length;
        int n = board[0].length;
        //store all dictionary words into trie tree
        TrieNode root = buildTrie(words);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(board,i,j,res,root);
            }
        }
        return res;
    }
    public void dfs(char[][] board, int i,int j, List<String> res, TrieNode node){
        char c = board[i][j];
        if(c=='#' || node.next[c-'a']==null) return;
        node = node.next[c-'a'];
        if(node.word!=null){
            res.add(node.word);
            node.word = null;
        }
        
        board[i][j]='#';
        if(i>0) dfs(board,i-1,j,res,node);
        if(i<board.length-1) dfs(board,i+1,j,res,node);
        if(j>0) dfs(board,i,j-1,res,node);
        if(j<board[0].length-1) dfs(board,i,j+1,res,node);
        board[i][j]=c;
    }
}
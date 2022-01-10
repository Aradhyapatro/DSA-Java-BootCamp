package Questions.Medium;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},
                            {'S','F','C','S'},
                            {'A','D','E','E'}};

        boolean[][] track = {{false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}};
        String s = "SEE";

        System.out.println(find(board, track, s, "", 0,0,0));
    }

    private static boolean find(char[][] board, boolean[][] track, String s, String ss, int r,int c,int index) {
        if(s.equals(ss)){
            return true;
        }

        if(r<0 || c<0 || r>board.length-1 || c>board.length-1 || ss.length()>s.length()){
            return false;
        }

        if(isSafe(track,r,c) && board[r][c]==ss.charAt(index)){
            if(find(board,track,s+ss.charAt(index),ss,r+1,c,index+1) ||find(board,track,s+ss.charAt(index),ss,r-1,c,index+1) || find(board,track,s+ss.charAt(index),ss,r,c+1,index+1) || find(board,track,s+ss.charAt(index),ss,r,c-1,index+1)){
                return true;
            }
        }

        return false;
    }

    private static boolean isSafe(boolean[][] track, int r, int c) {
        if(track[r][c]!=false){
            return false;
        }
        return true;
    }
}

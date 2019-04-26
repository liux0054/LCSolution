package medium;

public class LC419 {
    public int countBattleships(char[][] board) {
       int answer = 0;
       for(int row=0; row<board.length; row++){
           for(int column=0; column<board[0].length; column++){
               if(board[row][column] == 'X'){
                   boolean isBattleField = true;
                   if(row-1 >= 0 && board[row-1][column] == 'X'){
                       isBattleField = false;
                   }
                   if(column-1>=0 && board[row][column-1] == 'X'){
                       isBattleField = false;
                   }
                   if(isBattleField){
                       answer++;
                   }
               }

           }
       }
       return answer;
    }
}

package hard.lc1tolc200;

import java.util.HashSet;
import java.util.Set;

public class LC37 {
    public void solveSudoku(char[][] board) {
       solve(0, 0, board);
    }

    private boolean solve(int row, int column, char[][] board){
        if(column == 9){
            column = 0;
            row += 1;
        }

        if(row == 9){
            return true;
        }
        if(board[row][column] == '.'){
            for(char i='1'; i<='9'; i++){
               if(!getNeighbouringGrid(row, column, board).contains(i) &&
               !getRowGrid(row, board).contains(i) &&
               !getColumnGrid(column, board).contains(i)) {
                 board[row][column] = i;
                 if(solve(row, column+1, board)){
                     return true;
                 }else{
                     board[row][column] = '.';
                 }
               }
           }
        }else{
            return solve(row, column+1, board);
        }
        return false;
    }

    private Set<Character> getNeighbouringGrid(int row, int column, char[][] board){
        int rowBegin = findBeginIndex(row);
        int columnBegin = findBeginIndex(column);
        Set<Character> setInts = new HashSet<>();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                setInts.add(board[rowBegin + i][columnBegin + j]);
            }
        }
        setInts.remove('.');
        return setInts;
    }

    private Set<Character> getRowGrid(int row, char[][] board){
        Set<Character> colRows = new HashSet<>();
        for(int i=0; i< board[row].length; i++){
            colRows.add(board[row][i]);
        }
        colRows.remove('.');
        return colRows;
    }

    private Set<Character> getColumnGrid(int column, char[][] board){
        Set<Character> colInts = new HashSet<>();
        for(int i=0; i<board.length; i++){
            colInts.add(board[i][column]);
        }
        colInts.remove('.');
        return colInts;
    }

    private int findBeginIndex(int number){
        if(number % 3 == 1){
            return number - 1;
        }else if(number % 3 == 2){
            return number - 2;
        }else{
            return number;
        }
    }
}

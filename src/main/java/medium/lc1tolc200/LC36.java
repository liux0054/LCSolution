package medium.lc1tolc200;

import java.util.HashSet;
import java.util.Set;

public class LC36 {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0; i<9; i++){
            if (!isValid9Cells(board[i])){
                return false;
            }
        }

        for(int column=0; column<9; column++){
            char[] columnChars = new char[9];
            for(int row=0; row<9; row++){
                columnChars[row] = board[row][column];
            }

            if(!isValid9Cells(columnChars)){
                return false;
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int row = i * 3;
                int column = j * 3;
                char[] chars = new char[9];
                for(int k=0; k<3; k++){
                    for(int l=0; l<3; l++){
                        chars[k*3 + l] = board[row+k][column+l];
                    }
                }
                if(!isValid9Cells(chars)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid9Cells(char[] cells){
        Set<Character> chars = new HashSet<>();
        for(char c : cells){
            if(c != '.'){
                if(!chars.contains(c)){
                    chars.add(c);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}

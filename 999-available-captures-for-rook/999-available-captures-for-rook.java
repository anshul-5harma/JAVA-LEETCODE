class Solution {
    public int numRookCaptures(char[][] board) {
        int row = 0;
        int column = 0;
        int to_return = 0;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 'R') {
                    row = i;
                    column = j;
                    break;
                }
            }
        }
        
        for(int i = column; i < board.length; i++) {
            if(board[row][i] == 'p') {
                to_return++;
                break;
            } 
            if(board[row][i] == 'B') {
                break;
            }
        }
        
        for(int i = row; i < board.length; i++) {
            if(board[i][column] == 'p') {
                to_return++;
                break;
            }
            if(board[i][column] == 'B') break;
        }
        
        for(int i = column; i >= 0; i--) {
            if(board[row][i] == 'p') {
                to_return++;
                break;
            }
            if(board[row][i] == 'B') break;
        }
        
        for(int i = column; i >= 0; i--) {
            if(board[i][column] == 'p') {
                to_return++;
                break;
            }
            if(board[i][column] == 'B') break;
        }
        return to_return;
    }
}
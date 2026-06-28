class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(row.contains(board[i][j])){
                        return false;
                    }
                    row.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    if(col.contains(board[j][i])){
                        return false;
                    }
                    col.add(board[j][i]);
                }
            }
        }

        for(int rowStart = 0; rowStart < 9; rowStart+=3){
            for(int colStart = 0; colStart < 9; colStart+=3){
                HashSet<Character> box = new HashSet<>();
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        char c = board[rowStart + i][colStart + j];
                        if(c != '.'){
                            if(box.contains(c)){
                                return false;
                            }
                            box.add(c);
                        }
                    }
                }
            }
        }

        return true;
    }
}

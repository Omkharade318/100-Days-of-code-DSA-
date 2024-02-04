class Solution {
    public boolean isValidSudoku(char[][] board) {
        //O(1) time and space
        for(int i = 0; i < 9; i++){
            if (!isValidRow(board, i) || 
                !isValidCol(board, i) || 
                !isValidBox(board, i)) 
                    return false;            
        }
        return true;
    }

    public boolean isValidRow(char[][] board, int row) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int j = 0; j < 9; j++){
            char currChar = board[row][j];
            if(currChar != '.'){
                mp.put(currChar, mp.getOrDefault(currChar, 0)+1);
                if (mp.get(currChar) > 1) 
                    return false;
            }
        }
        return true;
    }

    public boolean isValidCol(char[][] board, int col) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < 9; i++){
            char currChar = board[i][col];
            if(currChar != '.'){
                mp.put(currChar, mp.getOrDefault(currChar, 0)+1);
                if (mp.get(currChar) > 1) 
                    return false;
            }
        }
        return true;
    }

    public boolean isValidBox(char[][] board, int box) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int startRow = 3 * (box / 3);
        int startCol = 3 * (box % 3);

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                char currChar = board[startRow+i][startCol+j];
                if(currChar != '.'){
                    mp.put(currChar, mp.getOrDefault(currChar, 0)+1);
                    if (mp.get(currChar) > 1) 
                        return false;
                }
            }
        }
        return true;
    }
}

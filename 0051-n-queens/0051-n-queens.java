class Solution {
    public List<List<String>> solveNQueens(int n) 
    {
       char[][] board = new char[n][n];
       fillBoard(board);
       List<List<String>> list = new ArrayList<>();

       nQueens(board, 0, list); 

       return list;   
    }

    public void fillBoard(char[][] board)
    {
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                board[i][j] = '.';
            }
        }
    }
    public void nQueens(char[][] board, int row, List<List<String>> list)
    {
        //base condition
        if(row == board.length)
        {
            display(board, list);
            return;
        }

        for(int col=0; col<board.length; col++)
        {
            if(isSafe(board, row, col))
            {
                board[row][col] = 'Q';
                nQueens(board, row+1, list);

                //backtrack
                board[row][col] = '.';
            }
        }

    }

    public boolean isSafe(char[][] board, int r, int c)
    {
        //verticalUp
        for(int i=0; i<r; i++)
        {
            if(board[i][c] == 'Q')
            {
                return false;
            }
        }

        //diagonal left
        int minLeft = Math.min(r,c);
        for(int i=1; i<=minLeft; i++)
        {
            if(board[r-i][c-i] == 'Q')
            {
                return false;
            }
        }
        //diagonal right
       int minRight = Math.min(r, board.length-1-c);
       for(int i=1; i<=minRight; i++)
       {
        if(board[r-i][c+i] == 'Q')
        {
            return false;
        }

       }
        return true;
    }
    public void display(char[][] board, List<List<String>> list)
    {
        
        List<String> inner = new ArrayList<>();
        for(char[] arr: board)
        {
            StringBuilder sb = new StringBuilder();
            for(char ch: arr)
            {
                sb.append(ch);
            }
            inner.add(""+sb);

        }

        list.add(inner);
    }
}
import java.util.Scanner;
public class TicTacToe {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [][] board = new char [3][3];
        
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
        
        boolean playerOne = true;
        while(checkWinner(board) == '-' && !checkDraw(board)) 
        {
            System.out.printf("Player %s: ", (playerOne ? "one" : "two"));
            int row = scan.nextInt();
            int col = scan.nextInt();
            
            board[row-1][col-1] = (playerOne ? 'X' : 'O');
            
            printBoard(board);
            
            playerOne = !playerOne;
        }
        
        if(checkDraw(board))
            System.out.println("THE GAME ENDED IN A DRAW.");
        else if(checkWinner(board) == 'X')
            System.out.println("PLAYER ONE HAS WON THE GAME.");
        else if(checkWinner(board) == 'O')
            System.out.println("PLAYER TWO HAS WON THE GAME.");
    }

    public static void printBoard(char [][] board) 
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) 
            {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
    public static char checkWinner(char [][] board) {
        for (int i = 0; i < board.length; i++) {
            char toCheck = board[i][0];
            int count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (toCheck != '-' && board[i][j] == toCheck)
                    count++;
            }
            if (count == board.length)
                return toCheck;
        }
        
        for (int i = 0; i < board.length; i++) {
            char toCheck = board[0][i];
            int count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if(toCheck != '-' && board[j][i] == toCheck)
                    count++;
            }
            if (count == board.length)
                return toCheck;
        }
        
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0];
        
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2];
        
        return '-';
    }
    
    public static boolean checkDraw(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '-')
                    return false;
            }
        }
        return true;
    }
	

}

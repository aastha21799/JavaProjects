import java.util.Scanner;

public class Match {
    int turn;
    Game game;
    int winner;

    void StartMatch(Player playerA, Player playerB)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting the match. Setting up the game");
        game = new Game(playerA, playerB);

        turn = 1;

        while (CheckIfMatchContinues())
        {
            turn = turn + 1;
            int playerTurn = ((turn) % 2) + 1;
            System.out.println("It is the turn of player " + playerTurn + " Please select your position");

            // Player1 is tied to zero
            // Player2 is tied to katta

            int rowId = scanner.nextInt();
            int colId = scanner.nextInt();

            while (SelectionIsInValid(rowId, colId))
            {
                System.out.println("Player " + playerTurn + " the selected position is not valid");
                rowId = scanner.nextInt();
                colId = scanner.nextInt();
            }

            System.out.println("\n The selected postion " + rowId + " and " + colId + " is being marked");
            
            Symbol symbol = GetPlayerSymbol(playerTurn);
            game.board.tiles[rowId][colId].symbol =  symbol;
            game.board.DisplayBoard();

            Boolean playerWonStatus = CheckIfPlayerWon(playerTurn);

            if (playerWonStatus == true)
            {
                System.out.println("Player" + playerTurn + " won the match");
                System.out.println("Ending the match");
                break;
            }
        }

        System.out.println("The game has ended");
    }

    private boolean CheckIfMatchContinues() {
        Board board = game.board;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (board.tiles[i][j].symbol == Symbol.EMPTY)
                {
                    return true;
                }
            }
        }

        return false;
    }

    private Boolean CheckIfPlayerWon(int player)
    {
        Board board = game.board;

        if ((board.tiles[0][0].symbol != Symbol.EMPTY) && (board.tiles[0][0].symbol == board.tiles[1][1].symbol) && (board.tiles[1][1].symbol == board.tiles[2][2].symbol))
        {
            winner = player;
            return true;
        }
        
        if ((board.tiles[0][2].symbol != Symbol.EMPTY) && (board.tiles[0][2].symbol == board.tiles[1][1].symbol) && (board.tiles[1][1].symbol == board.tiles[2][0].symbol))
        {
            winner = player;
            return true;
        }

        
        for (int i = 0; i < 3; i++)
        {
            if (board.tiles[i][0].symbol != Symbol.EMPTY && board.tiles[i][0].symbol == board.tiles[i][1].symbol && board.tiles[i][1].symbol == board.tiles[i][2].symbol)
            {
                winner = player;
                return true;
            }    
        }

        for (int j = 0; j < 3; j++)
        {
            if (board.tiles[0][j].symbol != Symbol.EMPTY && board.tiles[0][j].symbol == board.tiles[1][j].symbol && board.tiles[1][j].symbol == board.tiles[2][j].symbol)
            {
                winner = player;
                return true;
            }
        }

        return false;
    }

    private boolean SelectionIsInValid(int row, int col)
    {
        if ((row >= 0 && row < 3) && (col >= 0 && col < 3))
        {
            if (game.board.tiles[row][col].symbol == Symbol.EMPTY)
            {
                return false;
            }
        }

        return true;
    }

    private Symbol GetPlayerSymbol(int playerTurn)
    {
        if (playerTurn == 1)
        {
            return Symbol.O;
        }
        else if (playerTurn == 2)
        {
            return Symbol.X;
        }

        System.out.println("The player is not valid");

        return Symbol.EMPTY;
    }
}

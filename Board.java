public class Board {   

    // Tiles are reference variables. The array values are initialized to null so tiles will be null in the next line
    // Only the space has been reserved.
    Tile[][] tiles = new Tile[3][3];

    Board()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                tiles[i][j] = new Tile();
            }
        }
    }

    void DisplayBoard()
    {
        System.out.println("Printing the board");

        for (int i = 0; i < 3; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 3; j++)
            {
                String str = tiles[i][j].ParseTile();
                System.out.print(str + "|");
            }
            System.out.println();
            System.out.println("|_|_|_|");
        }
    }  
}
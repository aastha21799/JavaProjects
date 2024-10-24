public class Tile {
    int Id;
    Symbol symbol;    

    Tile()
    {
        symbol = Symbol.EMPTY;
    }

    Tile(Symbol symbol)
    {
        this.symbol = symbol;
    }

    public String ParseTile() {
        String str = "U";

        if (symbol == Symbol.EMPTY)
        {
            str = " ";
        }
        else if (symbol == Symbol.O)
        {
            str = "0";
        }
        else if (symbol == Symbol.X)
        {
            str = "X";
        }

        return str;
    }
}

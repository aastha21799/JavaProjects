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
        // Here changing from if-else to switch statements
        switch (symbol) {
            case X:
                return "X";
            case O:
                return "0";
            default:
                return " ";                
        }
    }
}

public class TicTacToeGame 
{
    public static void main(String[] args)
    {
        System.out.println("Starting the setup");
        Match match = new Match();
        match.StartMatch(new Player(0, "Aastha_A"), new Player(1, "Aastha_B"));
    }
}

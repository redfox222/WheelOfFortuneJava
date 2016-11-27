package wheeloffortune;
import java.util.Random;
/**
 *
 * @authors Randy Gillette, Gail Morrison, Stephen Dembrak, Mackenzie Davis, Jared Ward
 * @date November 6 -
 * @Project Wheel of fortune
 */

public class Player 
{
    private String playerName;
    private int totalBalance;
    private int roundBalance;
    private boolean myTurn;
    
    public Player(){}
    
    public void setName(String n)
    {
        playerName = n;
    }
    public String getName()
    {
        return playerName;
    }
    public void defaultBal()//sets the total balance to zero
    {
        totalBalance = 0;
        roundBalance = 0;
    }
    public int getTBal()
    {
        return totalBalance;
    }
    public int getRBal()
    {
        return roundBalance;
    }
    public void bankrupt()//can be used to start a new round or bankrupt a person
    {
        roundBalance = 0;
    }
    public void isTurn(boolean t)//either is true or false, whether it is the player's turn or not
    {
        myTurn = t;
    }
    public boolean getTurn()
    {
        return myTurn;
    }
    /*
    public int newRound()
    {
        totalBalance += roundBalance;
        return totalBalance;
    }
    Working on this for now    */
}

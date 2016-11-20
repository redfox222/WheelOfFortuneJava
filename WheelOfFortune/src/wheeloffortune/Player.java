package wheeloffortune;

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
    public void Bankrupt()//can be used to start a new round or bankrupt a person
    {
        roundBalance = 0;
    }
    /*
    public int newRound()
    {
        totalBalance += roundBalance;
        return totalBalance;
    }
    Working on this for now    */
}

package wheeloffortune;

import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @authors Randy Gillette, Gail Morrison, Stephen Dembrak, Mackenzie Davis, Jared Ward
 * @date November 6 -
 * @Project Wheel of fortune
 */

public class WheelOfFortune 
{

    private int spinInt;//need to add 1 because random end is exclusive
    private final int[] spinCash = {550, 550, 550, 600, 600, 600, 700, 700, 900, 900, 0, 0};
    //to be used for the spins
    public static void main(String[] args) 
    {
        //Variables
        Scanner scMain = new Scanner(System.in);
        
        Random mainGenerator = new Random();
        int puzCat = mainGenerator.nextInt(25);
        
        
        String [] before_and_after = new String [5];
        String [] events = new String [5];
        String [] movie_title = new String [5];
        String [] on_the_map = new String [5];
        String [] what_are_you_doing = new String [5];
        //Start Standard, Chirstmas Version or Exit.  
        System.out.println("Welcome to Wheel of Fortune!");
        
        int fk = 0;
        while(fk == 0)
        {
            System.out.println("To play a standard game enter S. To play a chirstmas version press C.");
            System.out.println("To exit enter E.");
            String startMain = scMain.nextLine();
            switch (startMain)
            {
                case "s": 
        
                        before_and_after [0] = "A Blast From The Past Present And Future";
                        before_and_after [1] = "A Chip Off Of The Old Block Party";
                        before_and_after [2] = "A Hole In One Way Ticket";
                        before_and_after [3] = "A House Is Not A Home On The Range";       
                        before_and_after [4] = "A Long Shot In The Dark";
        
                        events [0] = "Afterschool Activities";
                        events [1] = "Boxing Match";
                        events [2] = "Monday Night Java Class";
                        events [3] = "Football Games";
                        events [4] = "Graduation Day";

                        movie_title [0] = "A Clockwork Orange";
                        movie_title [1] = "Blazing Saddles";
                        movie_title [2] = "Chitty Chitty Bang Bang";
                        movie_title [3] = "Doctor Strange";
                        movie_title [4] = "From Russia With Love";
        
                        on_the_map [0] = "Chattanooga Tennessee";
                        on_the_map [1] = "Nassau Bahamas";
                        on_the_map [2] = "Honolulu Hawaii";
                        on_the_map [3] = "Bora Bora";
                        on_the_map [4] = "Paris France";
        
                        what_are_you_doing [0] = "Biting My Toungue";
                        what_are_you_doing [1] = "Buying A Round For Everyone";
                        what_are_you_doing [2] = "Casting My Vote";
                        what_are_you_doing [3] = "Writing Java Statement";
                        what_are_you_doing [4] = "Finishing The Group Project";
                        fk++;
                    break;
                case "c": 
        
                        before_and_after [0] = "Candy Cane Sugar";
                        before_and_after [1] = "Christmas Carol Burnett";
                        before_and_after [2] = "Regifting A Gift Tag";
                        before_and_after [3] = "Wishing You A Merry Christmas Carol";
                        before_and_after [4] = "Merry Christmas Lights";
        
                        events [0] = "Christmas Parade";
                        events [1] = "Church Service";
                        events [2] = "The Nutcracker Play";
                        events [3] = "Christmas Dinner";
                        events [4] = "Christmas Shopping";
        
                        movie_title [0] = "Prep And Landing";
                        movie_title [1] = "Miracle on 34th Street";
                        movie_title [2] = "How The Grinch Stole Christmas";
                        movie_title [3] = "A Christmas Carol";
                        movie_title [4] = "A Christmas Story";
        
                        on_the_map [0] = "The North Pole";
                        on_the_map [1] = "Rockefeller Center New York";
                        on_the_map [2] = "Santa Claus Georgia";
                        on_the_map [3] = "Christmasville Tennessee";
                        on_the_map [4] = "Mistletoe Kentucky";
        
                        what_are_you_doing [0] = "Trimming The Tree";
                        what_are_you_doing [1] = "Wrapping The Presents";
                        what_are_you_doing [2] = "Attending Church Service";
                        what_are_you_doing [3] = "Spending Time With Family";
                        what_are_you_doing [4] = "Hanging Mistletoe";
                        fk++;
                    break;
                case "e": System.out.println("Goodbye!");//need to close program when e is chosen
                          fk++;
                          System.exit(0);//Exits the program
                    break;
                default: System.out.println("Not a valid choice");
                    break;
            }
        }
                
        //Amount of Players and puzzles
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        System.out.print("Number Of players(1-4): ");
        int playerAmount = scMain.nextInt();
        System.out.print("Number Of puzzles(1-25): ");
        int puzzleAmount = scMain.nextInt();
        /*
        switch (playerAmount)
        {
            case 1: 
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4: 
                break;
        }
        */
        // Player Name Initialization.
        String playName;
        for(int k = 0; k < playerAmount; k++)
        {
            switch (k)
            {
                case 0: System.out.println("Enter Player " + (k+1) + "'s name:");
                        playName = scMain.next();
                        p1.setName(playName);
                        p1.defaultBal();
                    break;
                case 1: System.out.println("Enter Player " + (k+1) + "'s name:");
                        playName = scMain.next();
                        p2.setName(playName);
                        p2.defaultBal();
                    break;
                case 2: System.out.println("Enter Player " + (k+1) + "'s name:");
                        playName = scMain.next();
                        p3.setName(playName);
                        p3.defaultBal();
                    break;
                case 3: System.out.println("Enter Player " + (k+1) + "'s name:");
                        playName = scMain.next();
                        p4.setName(playName);
                        p4.defaultBal();
                    break;
            }
        }
        
        //display Each Player's Balance
        for(int u = 0; u < playerAmount; u++)
        {
            switch (u)
            {
                case 0: System.out.println("Player " + (u+1) + "'s Balance:" + p1.getRBal());
                    break;
                case 1: System.out.println("Player " + (u+1) + "'s Balance:" + p2.getRBal());
                    break;
                case 2: System.out.println("Player " + (u+1) + "'s Balance:" + p3.getRBal());
                    break;
                case 3: System.out.println("Player " + (u+1) + "'s Balance:" + p4.getRBal());
                    break;
            }
        }
        
        
        
        
        //Testing code
        //System.out.println(p1.getName() + p2.getName() + p3.getName() + p4.getName());
        
        
        
        
    }
    int spin()
    {
        Random spinGenerator = new Random();
        
        spinInt = spinGenerator.nextInt(12);
        return spinCash[spinInt];
    }
    
}

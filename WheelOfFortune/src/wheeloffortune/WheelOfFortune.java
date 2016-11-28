package wheeloffortune;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 * 
 * @authors Randy Gillette, Gail Morrison, Stephen Dembrak, Mackenzie Davis, Jared Ward
 * @date November 6 -
 * @Project Wheel of fortune
 */

public class WheelOfFortune 
{

    private static int spinInt;//need to add 1 because random end is exclusive
    private static final int[] spinCash = {550, 550, 550, 600, 600, 600, 700, 700, 900, 900, 0, 1};
    static int u = 0;
    
    static Player p1 = new Player();
    static Player p2 = new Player();
    static Player p3 = new Player();
    static Player p4 = new Player();
    static ArrayList<Player> players = new ArrayList<Player>();
    
    static Random randNum = new Random();
    static Scanner scMain = new Scanner(System.in);
    //to be used for the spins
    public static void main(String[] args) 
    {
        //Variables
        
        
        
        int puzCat = 0;
        
        
        String [] before_and_after = new String [5];
        String [] events = new String [5];
        String [] movie_title = new String [5];
        String [] on_the_map = new String [5];
        String [] what_are_you_doing = new String [5];
        //Start Standard, Chirstmas Version or Exit.  
        //for(int ask = 0; ask <= 50; ask++)
        //        System.out.println(spin());
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
        /*
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        */
        
        System.out.print("Number Of players(1-4): ");
        int playerAmount = scMain.nextInt();
        System.out.print("Number Of puzzles(1-25): ");
        int puzzleAmount = scMain.nextInt();
        for(int ran = 0; ran <= puzzleAmount; ran++)
        {
        
        char[] puzzle;
        char[] hidden;
        
        puzCat = randNum.nextInt(25);
        switch(puzCat)
        {
            case 0: puzzle = phraseToArray(before_and_after[0]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 1: puzzle = phraseToArray(before_and_after[1]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 2: puzzle = phraseToArray(before_and_after[2]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 3: puzzle = phraseToArray(before_and_after[3]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 4: puzzle = phraseToArray(before_and_after[4]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 5: puzzle = phraseToArray(events[0]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 6: puzzle = phraseToArray(events[1]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 7: puzzle = phraseToArray(events[2]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 8: puzzle = phraseToArray(events[3]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 9: puzzle = phraseToArray(events[4]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 10: puzzle = phraseToArray(movie_title[0]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 11: puzzle = phraseToArray(movie_title[1]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 12: puzzle = phraseToArray(movie_title[2]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 13: puzzle = phraseToArray(movie_title[3]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 14: puzzle = phraseToArray(movie_title[4]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 15: puzzle = phraseToArray(on_the_map[0]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 16: puzzle = phraseToArray(on_the_map[1]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 17: puzzle = phraseToArray(on_the_map[2]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 18: puzzle = phraseToArray(on_the_map[3]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 19: puzzle = phraseToArray(on_the_map[4]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 20: puzzle = phraseToArray(what_are_you_doing[0]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 21: puzzle = phraseToArray(what_are_you_doing[1]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 22: puzzle = phraseToArray(what_are_you_doing[2]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 23: puzzle = phraseToArray(what_are_you_doing[3]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
            case 24: puzzle = phraseToArray(what_are_you_doing[4]);
                    hidden = phraseArrayToBlank(puzzle);
                break;
        }
        //hidden = phraseArrayToBlank(puzzle);
        
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
                        players.add(p1);
                        playName = scMain.next();
                        p1.setName(playName);
                        p1.newGame();
                    break;
                case 1: System.out.println("Enter Player " + (k+1) + "'s name:");
                        playName = scMain.next();
                        players.add(p2);
                        p2.setName(playName);
                        p2.newGame();
                    break;
                case 2: System.out.println("Enter Player " + (k+1) + "'s name:");
                        playName = scMain.next();
                        players.add(p3);
                        p3.setName(playName);
                        p3.newGame();
                    break;
                case 3: System.out.println("Enter Player " + (k+1) + "'s name:");
                        playName = scMain.next();
                        players.add(p4);
                        p4.setName(playName);
                        p4.newGame();
                    break;
            }
        }
        
        
        //display Each Player's Balance
        while(u < playerAmount)
        {
            switch (u)
            {
                case 0: System.out.println("Player " + (u+1) + "'s Balance:" + p1.getRBal());
                    System.out.println("Its player 1's turn");
                    p1.isTurn(true);
                    p2.isTurn(false);
                    p3.isTurn(false);
                    p4.isTurn(false);
                    break;
                case 1: System.out.println("Player " + (u+1) + "'s Balance:" + p2.getRBal());
                System.out.println("Its player 2's turn");
                    p1.isTurn(false);
                    p2.isTurn(true);
                    p3.isTurn(false);
                    p4.isTurn(false);
                    break;
                case 2: System.out.println("Player " + (u+1) + "'s Balance:" + p3.getRBal());
                System.out.println("Its player 3's turn");
                    p1.isTurn(false);
                    p2.isTurn(false);
                    p3.isTurn(true);
                    p4.isTurn(false);
                    break;
                case 3: System.out.println("Player " + (u+1) + "'s Balance:" + p4.getRBal());
                    System.out.println("Its player 4's turn");
                    p1.isTurn(false);
                    p2.isTurn(false);
                    p3.isTurn(false);
                    p4.isTurn(true);
                    break;
            }
        
        }
        
        
        
        
        //Testing code
        //System.out.println(p1.getName() + p2.getName() + p3.getName() + p4.getName());
        
        
        
        }
    }
    
    static int spin()
    {
        //Random spinGenerator = new Random();  Has no use
        
        spinInt = randNum.nextInt(12);
        if(spinInt <= 9)
        {
           return spinCash[spinInt]; 
        }
        else if(spinInt == 10)
        {
            
            
            players.get(u).isTurn(false);
            u++;//ends turn
        }
        else if(spinInt == 11)
        {
            
            if (p1.getTurn())
            {
                players.get(u).bankrupt();
            }
            else if (p2.getTurn())
            {
                
            }
            else if (p3.getTurn())
            {
                
            }
            else if (p4.getTurn())
            {
                
            }
        }
        return u;
    }
    
    public static char[] phraseToArray(String newPhrase)
        {
            char[] array = new char [newPhrase.length()];
            for (int index = 0; index < newPhrase.length(); index++)
            {
                array[index] = newPhrase.charAt(index);
            }
            return array;
            
        }
    public static char[] phraseArrayToBlank (char[] phraseArray)
        {
            char[] hiddenArray = new char [phraseArray.length];
            for (int index = 0; index < phraseArray.length; index++)
            {
                if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(Character.toUpperCase(phraseArray[index])) >= 0)  
                    hiddenArray[index] = '*';
                
                else 
                    hiddenArray[index] = phraseArray[index];
                    }
            return hiddenArray;
        }
        
    public static String letterRemove (String letterStr, char letter)
        {
            String letterStrRemove = "";
            int findIndex = letterStr.indexOf (Character.toUpperCase(letter));
            
            letterStrRemove = letterStr.substring(0,findIndex) + letterStr.substring(findIndex+1);
            
            return letterStrRemove;
        }
        
    public static boolean isGuessCorrect (char[] phraseArray, char guess)
        {
            boolean correct = false;
            for (int index = 0; index < phraseArray.length; index++)
            {
                //if the guess is found in the char array
                if (phraseArray[index] == (Character.toUpperCase(guess)))
                {
                    correct = true;
                    break;
                }
                else
                    correct = false;
            }
            if (correct == true)
                return true;
            else
                return false;
        }


    public static char[] revealLetter (char[] phraseArray, char[] phraseArrayHidden,char guess)
                {
                    for (int index = 0; index < phraseArray.length; index++)
                    {
                        if (phraseArray[index] == Character.toUpperCase(guess))
                            phraseArrayHidden[index] = phraseArray[index];
                    }
                    return phraseArrayHidden;
                }
                
    public static boolean isPhraseSolved (char[] phraseArray, char[] phraseArrayHidden)
        {
            boolean playerWin = false;
            for (int index = 0; index <phraseArrayHidden.length; index++)
            {
                if (Character.toUpperCase(phraseArrayHidden[index]) == (phraseArray[index]))
                        
                    playerWin = true;
                
                else 
                {
                    playerWin = false;
                    break;
                }
            }
            if (playerWin == true)
                return true;
            else            
                return false;
        }
}

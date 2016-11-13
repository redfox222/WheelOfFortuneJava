
package wheeloffortune;

import java.util.Scanner;

/**
 * 
 * @authors Randy Gillette, Gail Morrison, Stephen Dembrak, Mackenzie Davis, Jared Ward
 * @date November 6 -
 * @Project Wheel of fortune
 */

public class WheelOfFortune {

 
    public static void main(String[] args) {
        //Variables
        Scanner scMain = new Scanner(System.in);
        
        
        //Start Standard, Chirstmas Version or Exit.  
        System.out.println("Do you want to start a game of wheel of fortune?");
        System.out.println("To play a standard game enter S. to play a chirstmas version press C.");
        System.out.println("To exit enter E.");
        String startMain = scMain.nextLine();
        
        //Amount of Players and puzzles
        System.out.print("Number Of players(1-4): ");
        int playerAmount = scMain.nextInt();
        System.out.print("Number Of puzzles(1-25): ");
        int puzzleAmount = scMain.nextInt();
        
        // Player Name Initialization.
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wheeloffortune;

/**
 *
 * @author Shelaine
 */
public class Puzzle 
{
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
        
            
                
        // create and label arrays
        String [] before_and_after = new String [5];
        String [] events = new String [5];
        String [] movie_title = new String [5];
        String [] on_the_map = new String [5];
        String [] what_are_you_doing = new String [5];
        
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
        
        // Christmas Puzzles below can be moved to different class.
        
        String [] holiday_before_and_after = new String [5];
        String [] holiday_events = new String [5];
        String [] holiday_movie_title = new String [5];
        String [] holiday_on_the_map = new String [5];
        String [] holiday_what_are_you_doing = new String [5];
        
        holiday_before_and_after [0] = "Candy Cane Sugar";
        holiday_before_and_after [1] = "Christmas Carol Burnett";
        holiday_before_and_after [2] = "Regifting A Gift Tag";
        holiday_before_and_after [3] = "Wishing You A Merry Christmas Carol";
        holiday_before_and_after [4] = "Merry Christmas Lights";
        
        holiday_events [0] = "Christmas Parade";
        holiday_events [1] = "Church Service";
        holiday_events [2] = "The Nutcracker Play";
        holiday_events [3] = "Christmas Dinner";
        holiday_events [4] = "Christmas Shopping";
        
        holiday_movie_title [0] = "Prep And LAnding";
        holiday_movie_title [1] = "Miracle on 34th Street";
        holiday_movie_title [2] = "How The Grinch Stole Christmas";
        holiday_movie_title [3] = "A Christmas Carol";
        holiday_movie_title [4] = "A Christmas Story";
        
        holiday_on_the_map [0] = "The North Pole";
        holiday_on_the_map [1] = "Rockefeller Center New York";
        holiday_on_the_map [2] = "Santa Claus Georgia";
        holiday_on_the_map [3] = "Christmasville Tennessee";
        holiday_on_the_map [4] = "Mistletoe Kentucky";
        
        holiday_what_are_you_doing [0] = "Trimming The Tree";
        holiday_what_are_you_doing [1] = "Wrapping The Presents";
        holiday_what_are_you_doing [2] = "Attending Church Service";
        holiday_what_are_you_doing [3] = "Spending Time With Family";
        holiday_what_are_you_doing [4] = "Hanging Mistletoe";
        
}

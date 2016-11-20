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
}

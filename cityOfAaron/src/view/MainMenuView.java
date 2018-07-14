// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Johnny Medina, Nelson Jimenez, Jorge Trujillo
// Date last modified: Jun 2018
//-------------------------------------------------------------

package view;

import Control.GameControl;
import byui.cit260.cityOfAaron.model.CropData;
import byui.cit260.cityOfAaron.model.Player;
import byui.cit260.cityOfAaron.model.Game;
import cityOfAaron.CityOfAaron;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;



public class MainMenuView extends MenuView {
    
    Scanner keyboard = new Scanner(System.in);
    //private final String theMenu;
    //private final int max;
    
    

    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================
    public MainMenuView()
    {

        super("\n"+
            "**********************************\n" +
            "* CITY OF AARON: MAIN GAME MENU  *\n" +
            "**********************************\n" +
            " 1 - Start new game\n" +
            " 2 - Get and start a saved game\n" +
            " 3 - Get help on playing the game\n" +
            " 4 - Save game\n" +
            " 5 - Quit\n",

        5);
    }
   
   
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                HelpMenuView hmv = new HelpMenuView();
                hmv.displayMenu();
                break;
            case 4: // save game
                saveGame();
                break;
            case 5: // quit
                System.out.println("Thanks for playing ... goodbye.");
        }

        
        // if the option is 1, call startNewGame( )
        // if the option is 2, call startExistingGame( )
        // if the option is 3, call displayHelpMenu( )
        // if the option is 4, call displaySaveGame( )
        // if the option is 5, display a goodbye message
    }
    
    
    
    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startNewGame()
    {
     
       // Show banner page
        System.out.println(
            "\n********************************************************\n" +
            "* Welcome to the City of Aaron. You have been summoned *\n" +
            "* by the High Priest to assume your role as ruler of   *\n" +
            "* the city. Your responsibility is to buy land, sell   *\n" +
            "* land, determine how much wheat to plant each year,   *\n" +
            "* and how much to set aside to feed the people. You     *\n" +
            "* will also be required to pay an annual tithe on the  *\n" +
            "* that is harvested. If you fail to provide      *\n" +
            "* enough wheat for the people to eat, people will die  *\n" +
            "* and your workforce will be diminished. Plan very     *\n" +
            "* carefully or you may find yourself in trouble with   *\n" +
            "* the people. And oh, watch out for plagues and rats!  *\n" +
            "********************************************************\n");  
 
        // Get player name, create player object, and save it in the Game
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();
                    
        // welcome message
        System.out.println("\nWelcome " + name + ", have fun playing.");
        
        // call the createNewGame( ) method. Pass the name as a parameter
         GameControl.createNewGame(name);
        
        //show the game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();


}
    
    // The startSavedGame method
 // Purpose: loads a saved game object from disk and start the game
 // Parameters: none
 // Returns: none
 // ===================================     
     public void startSavedGame(){        
        String value;
        // prompt user and get a file path
        System.out.println("Enter your saved Game name: ");
        value = keyboard.next();
        // call the getSavedGame( ) method in the GameControl class to load the game
        GameControl.getSavedGame(value);
        // display the game menu for the loaded game
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
}
     
    public void saveGame(){     
        String value;  
        // prompt user and get a file path
        System.out.println("Enter the name to save your game: ");
        value = keyboard.next();
        // call the setSaveGame( ) method in the GameControl class to save the game
        GameControl.setSaveGame(value);
        // display the game menu for the loaded game
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
}    
}
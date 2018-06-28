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
                //startSavedGame();
                break;
            case 3: // get help menu
                HelpMenuView hmv = new HelpMenuView();
                hmv.displayMenu();
                break;
            case 4: // save game
                //displaySaveGameView();
                break;
            case 5:
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

       
        
        //Create a new Game object.
        /*Game theGame = new Game();

        // Save a reference to it in the GameProject class.
        CityOfAaron.setTheGame(theGame);

        // Display the Banner Page.
        System.out.println("\nWelcome to the city of Aaron.");

        // Create a new Player object
        Player thePlayer = new Player();

        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();

        // Save the user’s name in the Player object
        thePlayer.setName(name);

        // Save a reference to the player object in the Game object
        theGame.setThePlayer(name);

        // Display a welcome message
        System.out.println("\nWelcome " + name + " have fun.");

        // Create a CropData object, 
       CropData cropData = new CropData();

        // initialize it
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setOffering(10);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000); 
        
         // save a reference to it in the Game 
        theGame.setCrop(cropData);

// Display the Game menu
                       
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
 
    }
 
    
    
    // The startSavedGame method
    // Purpose: creates game object and saves the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startSavedGame()
    {
        System.out.println("\nStart saved game option selected.");
    }

    
    
    // The displayHelpMenuView method
    // Purpose: creates game object and displays the help menu.
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayHelpMenuView()
    {
        System.out.println("\nDisplay help menu option selected.");
    }
        
    
    
    // The displaySaveMenuView method
    // Purpose: creates game object and displays the save game menu.
    // Parameters: none
    // Returns: none
    // ===================================
    
         
    public void displaySaveGameView()
    {
        System.out.println("\nDisplay save game option selected.");
    }
  */  

}
}
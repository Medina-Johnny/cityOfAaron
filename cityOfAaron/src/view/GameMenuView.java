// The GameMenuView class - part of the view layer
// Object of this class manages the game menu
// Author: Johnny Medina, Nelson Jimenez, Jorge Trujillo
// Date last modified: Jun 2018
//-------------------------------------------------------------
package view;

import java.util.Scanner;


public class GameMenuView {
    Scanner keyboard = new Scanner(System.in);
    private final String GameMenu;
    private final int max;
    
    
    
    public GameMenuView()
    {

        GameMenu = "\n" +
            "**********************************\n" +
            "* CITY OF AARON: GAME MENU  *\n" +
            "**********************************\n" +
            " 1 - View the map\n" +
            " 2 - View/Print a list\n" +
            " 3 - Move to a new location\n" +
            " 4 - Manage the Crops\n" +
            " 5 - Return to the Main menu\n";

        max = 5;
    }
    
    public void displayGameMenuView()
    {
        int menuOption;
        do
        {
            // Display the game menu
            System.out.println(GameMenu);
            // Prompt the user and get the user’s input
            menuOption = getMenuOption();
            // Perform the desired action
            doAction(menuOption);
            // Determine and display the next view
        }while(menuOption != max);
    }
    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption()
    {
        // declare a variable to hold user’s input
        int userInput;
       
        // begin loop
        do
        {
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            
            // if it is not a valid value, output an error message
            if(userInput < 1 || userInput > max)
            {
                System.out.println("\noption must be between 1 and" + max);
            }
            
        // loop back to the top if input was not valid         
        }while(userInput < 1 || userInput > max);
       
        // return the value input by the user
        return userInput;
    } 
    
    
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
    {
        switch(option)
        {
            case 1: // create and start the map
                theMap();
                break;
            case 2: // get and start list menu
                PrintListMenuView pmv = new PrintListMenuView();
                pmv.DisplayPrintListMenuView();
                break;
            case 3: // get new loction
                newLocation();
                break;
            case 4: // manage the crops
                CropView msv = new CropView();
                CropView.runCropsView();
                break;
            case 5: //Return to main menu
                MainMenuView mmv = new MainMenuView();
                mmv.displayMenuView();
        }
    }
    
    public void theMap()
    {
        System.out.println("\nDisplay the map.");
    }
    
    public void newLocation()
    {
        System.out.println("\nDisplay new location.");
    }
    
    }
    
    
    
    
    
    
    

// The GameMenuView class - part of the view layer
// Object of this class manages the game menu
// Author: Johnny Medina, Nelson Jimenez, Jorge Trujillo
// Date last modified: Jun 2018
//-------------------------------------------------------------
package view;

import java.util.Scanner;


public class GameMenuView extends MenuView{
    Scanner keyboard = new Scanner(System.in);
    
    public GameMenuView()
    {

        super("\n" +
            "**********************************\n" +
            "* CITY OF AARON: GAME MENU  *\n" +
            "**********************************\n" +
            " 1 - View the map\n" +
            " 2 - View/Print a list\n" +
            " 3 - Move to a new location\n" +
            " 4 - Manage the Crops\n" +
            " 5 - Return to the Main menu\n",

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
            case 1: // create and start the map
                theMap();
                break;
            case 2: // get and start list menu
                PrintListMenuView pmv = new PrintListMenuView();
                pmv.displayMenu();
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
                mmv.displayMenu();
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
   
    
    
    
    
    
    

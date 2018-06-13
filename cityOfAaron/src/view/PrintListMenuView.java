// The PrintListMenuView class - part of the view layer
// Object of this class manages the print list menu
// Author: Johnny Medina, Nelson Jimenez, Jorge Trujillo
// Date last modified: 13 Jun 2018
//-----------------------------------------------------------
package view;
import java.util.Scanner;


public class PrintListMenuView {
  Scanner keyboard = new Scanner(System.in);
    private final String DisplayPrintMenu;
    private final int max; 

    
    public PrintListMenuView()
    {

        DisplayPrintMenu = "\n" +
            "*******************************************\n" +
            "* CITY OF AARON: DISPLAY/PRINT LIST MENU  *\n" +
            "*******************************************\n" +
            " 1 - List or view the animals in the storehouse\n" +
            " 2 - List or view the tools in the storehouse\n" +
            " 3 - List or view the provisions in the storehouse\n" +
            " 4 - List or view the authors of this game\n" +
            " 5 - Return to game menu\n";

        max = 5;
    }

    void DisplayPrintListMenuView() {
        int menuOption;
        do
        {
            // Display the print list menu
            System.out.println(DisplayPrintMenu);
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
            case 1: // Show the animals in storehouse
                animalsStoreHouse();
                break;
            case 2: // show the tools in storehouse
                toolsStoreHouse ();
                break;
            case 3: // Show the provisions in the storehouse
                provisionsStoreHouse();
                break;
            case 4: // Display the game authors
                authorsGame();
                break;
            case 5: //Return to main menu
                GameMenuView mmv = new GameMenuView();
                mmv.displayGameMenuView();
        }
    }

    private void animalsStoreHouse() {
        System.out.println("\nDisplay animals in the storehouse");
    }
    private void toolsStoreHouse() {
        System.out.println("\nDisplay tools in the storehouse");
    }
    private void provisionsStoreHouse() {
        System.out.println("\nDisplay provisions in the storehouse");
    }
    private void authorsGame() {
        System.out.println("\nDisplay authors of the game");
    }
    
    
}
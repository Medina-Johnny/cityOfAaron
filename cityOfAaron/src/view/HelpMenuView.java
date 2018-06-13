// The HelpMenuView class - part of the view layer
// Object of this class manages the help menu
// Author: Johnny Medina, Nelson Jimenez, Jorge Trujillo
// Date last modified: Jun 2018
//-------------------------------------------------------
package view;
import java.util.Scanner;


public class HelpMenuView {
    Scanner keyboard = new Scanner(System.in);
    private final String HelpMenu;
    private final int max;

public HelpMenuView()
        {
    HelpMenu = "\n" +
            "**********************************\n" +
            "* CITY OF AARON: HELP MENU  *\n" +
            "**********************************\n" +
            " 1 - What are the goals of the game?\n" +
            " 2 - Where is the city of Aaron?\n" +
            " 3 - How do I view the map?\n" +
            " 4 - How do I move to another location?\n" +
            " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
            " 6 - Back to the Main Menu.\n";
        max = 6;
}

public void displayHelpMenuView()
    {
        int menuOption;
        do
        {
            // Display the help menu
            System.out.println(HelpMenu);
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
            case 1: // Display the goals of the game
                goalsTheGame();
                break;
            case 2: // Display where is city of Aaron
                whereCityAaron();
                break;
            case 3: // Display how view the map
                howViewMap();
                break;
            case 4: // move the location
                moveLocation();
                break;
            case 5: // Display the list
                displayList();
                break;
            case 6: // Return to the main menu
                MainMenuView mmv = new MainMenuView();
                mmv.displayMenuView();
        }
    }
    public void goalsTheGame()
    {
        System.out.println("\nDisplay goals the game.");
    }
    public void whereCityAaron()
    {
        System.out.println("\nDisplay where is City of Aaron.");
    }
    public void howViewMap()
    {
        System.out.println("\nDisplay How I view the map.");
    }
    public void moveLocation()
    {
        System.out.println("\nDisplay How I move the location .");
    }
    public void displayList()
    {
        System.out.println("\nDisplay list.");
    }

}

// The HelpMenuView class - part of the view layer
// Object of this class manages the help menu
// Author: Johnny Medina, Nelson Jimenez, Jorge Trujillo
// Date last modified: Jun 2018
//-------------------------------------------------------
package view;
import java.util.Scanner;


public class HelpMenuView extends MenuView{
    Scanner keyboard = new Scanner(System.in);

public HelpMenuView()
        {
    super("\n" +
            "**********************************\n" +
            "* CITY OF AARON: HELP MENU  *\n" +
            "**********************************\n" +
            " 1 - What are the goals of the game?\n" +
            " 2 - Where is the city of Aaron?\n" +
            " 3 - How do I view the map?\n" +
            " 4 - How do I move to another location?\n" +
            " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
            " 6 - Back to the Main Menu.\n",
        6);
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
                MenuView mmv = new MainMenuView();
                mmv.displayMenu();
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

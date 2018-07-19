// The HelpMenuView class - part of the view layer
// Object of this class manages the help menu
// Author: Johnny Medina
// Date last modified: July 19 2018
//----------------------------------------------------
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
        System.out.println( "\n1 -              What are the goals of the game?\n" + 
                            "The game consists of 10-year rounds wherein the player, has been summoned\n" +
                            "by the High Priest to assume his role as ruler of\n" +
                            "the city Aaron. The goals of the player are to strategically buy land, sell\n" +
                            "land, determine how much wheat to plant each year,\n" +
                            "and how much to set aside to feed the people. The player\n" +
                            "will also be required to pay an annual tithe on the wheat\n" +
                            "that is harvested. If the player fails to provide\n" +
                            "enough wheat for the people to eat, people will die\n" +
                            "and your workforce will be diminished. The player must plan very\n" +
                            "carefully or it will be Game Over.\n");
    }
    public void whereCityAaron()
    {
        System.out.println( "\n2 -              Where is the city of Aaron??\n" +
                            "According to The Book of Mormon,the city of Aaron was located in the Americas near Nephihah,\n" +
                            "though constructed earlier. Prior to the construction of Nephihah, its nearest known neighbor was Moroni.\n" +
                            "The book first tells of the city of Aaron when Alma, rejected at Ammonihah, took his journey toward the city of Aaron,\n" +
                            "but he stopped and returned to Ammonihah.");
    }
    public void howViewMap()
    {
        System.out.println("\n3                 How do I view the map?\n" +
                           "Step one: Start a new game.\n" +
                           "Step two: Enter your name.\n" +
                           "Step Three: Type 1 in the Game Menu to view the map");
    }
    public void moveLocation()
    {
        System.out.println("\n4                 How do I move to another location?\n" +
                           "Step one: Start a new game.\n" +
                           "Step two: Enter your name.\n" +
                           "Step Three: Type 3 in the Game Menu to move to a new location.\n" +
                           "Step Four: Enter the coordinates of the location you want to move to.\n");
    }
    public void displayList()
    {
        System.out.println("\n5                 How do I display a list of animals, provisions and tools in the city storehouse?\n" +
                           "Step one: Start a new game.\n" +
                           "Step two: Enter your name.\n" +
                           "Step Three: Type 2 in the Game Menu to view or print a list.\n" +
                           "Step Four: In the DISPLAY/PRINT LIST MENU Type the number of the list you want to display or save.\n");
    }

}

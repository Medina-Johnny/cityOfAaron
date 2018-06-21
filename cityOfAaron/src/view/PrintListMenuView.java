// The PrintListMenuView class - part of the view layer
// Object of this class manages the print list menu
// Author: Johnny Medina, Nelson Jimenez, Jorge Trujillo
// Date last modified: 13 Jun 2018
//-----------------------------------------------------------
package view;
import java.util.Scanner;


public class PrintListMenuView extends MenuView{
  Scanner keyboard = new Scanner(System.in);

    public PrintListMenuView()
    {

        super("\n" +
            "*******************************************\n" +
            "* CITY OF AARON: DISPLAY/PRINT LIST MENU  *\n" +
            "*******************************************\n" +
            " 1 - List or view the animals in the storehouse\n" +
            " 2 - List or view the tools in the storehouse\n" +
            " 3 - List or view the provisions in the storehouse\n" +
            " 4 - List or view the authors of this game\n" +
            " 5 - Return to game menu\n",

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
                mmv.displayMenu();
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
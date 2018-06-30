/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import byui.cit260.cityOfAaron.model.ListItem;
import java.util.Scanner;
/**
 *
 * @author JIMENEZ'S
 */
public class ListView extends MenuView {
  
    
    
    
    Scanner keyboard = new Scanner(System.in);
    
    public ListView()
    {

        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON:      LIST MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View the development team\n" +
                   " 2 - View a list of animals\n" +
                   " 3 - View a list of tools\n" +
                   " 4 - View a list of provisions\n" +
                   " 5 - Return to the game menu\n",
        5);
    }
    
    
    
    
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // create and start the map
                //theMap();
                break;
            case 2: // get and start list menu
                displayAnimalsList();
                break;
            case 3: // get new loction
                //newLocation();
                break;
            case 4: // manage the crops
                //CropView msv = new CropView();
                //CropView.runCropsView();
                break;
                        
            case 5: //Return to main menu
                MainMenuView mmv = new MainMenuView();
                mmv.displayMenu();
        }
    }
    
    public void displayAnimalsList(){
    //ListItem li = animals.get(1);   // get the list item from the ArrayList
   //System.out.println(li.getName( ) + ": " + li.getNumber( ) );
    
    
    
    }
}

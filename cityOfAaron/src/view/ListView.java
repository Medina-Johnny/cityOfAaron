/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.*;
import byui.cit260.cityOfAaron.model.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author JIMENEZ'S
 */
public class ListView extends MenuView {
  private ArrayList<ListItem> animals;
   private ArrayList<ListItem> tools;
   private ArrayList<ListItem> provisions; 
    
    
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
                displayToolsList();
                break;
            case 4: // manage the crops
                displayProvisionsList();
                break;
                        
            case 5: //Return to main menu
                GameMenuView gmv = new GameMenuView();
                gmv.displayMenu();
        }
    }
    
    public void displayAnimalsList(){
        
        
       //for (int i=0;i<animals.size();i++){
          // ListItem li = animals.get(i);
         //  System.out.println(li.getName( ) + ": " + li.getNumber( ) );
           
      // }
       GameControl gc = new GameControl();
       GameControl.createAnimalList();
    }
    
    public void displayToolsList(){
        GameControl gc = new GameControl();
        GameControl.createToolList();
    }
    
    public void displayProvisionsList(){
        GameControl gc = new GameControl();
        GameControl.createProvisionList();
    }
    
    
    
    
}
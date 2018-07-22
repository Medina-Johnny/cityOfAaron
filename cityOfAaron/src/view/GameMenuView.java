// The GameMenuView class - part of the view layer
// Object of this class manages the game menu
// Author:Nelson Jimenez, 
// Date last modified: Jun 21, 2018
//-------------------------------------------------------------
package view;

import Control.*;
import byui.cit260.cityOfAaron.model.*;
import cityOfAaron.CityOfAaron;
import exceptions.CropException;
import java.util.Scanner;
import java.io.IOException;

public class GameMenuView extends MenuView{
    Scanner keyboard = new Scanner(System.in);
    private static final Game theGame = CityOfAaron.getTheGame();
    
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
                viewList();
                break;
            case 3: 
            
                // get new loction
                newLocation();
            
        
                break;
            case 4: // manage the crops
               cropView();
                break;
                        
            case 5: //Return to main menu
                MainMenuView mmv = new MainMenuView();
                mmv.displayMenu();
        }
    }
    
    public void theMap()
    {
        GameControl gc = new GameControl();
        GameControl.createMap();
   
       
    }
    
    public void newLocation()
    {
        
        Player thePlayer = theGame.getThePlayer();
        System.out.println("\nEnter the coordinates of the location you want to move to.");
       
    int xcor;
    System.out.print("\nEnter the x-coordinate: ");
         xcor = keyboard.nextInt();
    if(xcor<0 || xcor>4){
              
              System.out.println("I am sorry master, I cannot do this.");
          }
    thePlayer.setColumn(xcor);
    
    int ycor;
    System.out.print("\nEnter the y-coordinate: ");
         ycor = keyboard.nextInt();
    if(ycor<0 || ycor>4){
              
              System.out.println("I am sorry master, I cannot do this.");
          }
    thePlayer.setRow(ycor);
    theGame.setThePlayer(thePlayer);
   // theMap.getLocation(xcor, ycor).getDescription();
    
    
    
        /* boolean paramsNotOkay;
        do
        {
        paramsNotOkay=false;
        System.out.print("\nEnter the x-coordinate: ");
        xcor = keyboard.nextInt();
        try{
        if(xcor>=0 && xcor<4){
        thePlayer.setColumn(xcor);
        }
        }
        catch (Exception e)
        {
        System.out.println("I am sorry master, I cannot do this.");
        // System.out.println(e.getMessage());
        // paramsNotOkay = true;
        }
        }while(paramsNotOkay);
        int ycor;
        do
        {
        paramsNotOkay=false;
        System.out.print("\nEnter the y-coordinate: ");
        ycor = keyboard.nextInt();
        try{
        if(ycor>=0 && ycor<4){
        thePlayer.setRow(ycor);
        }
        }
        catch (CropException e)
        {
        System.out.println("I am sorry master, I cannot do this.");
        // System.out.println(e.getMessage());
        //paramsNotOkay = true;
        }
        }while(paramsNotOkay);
        theGame.setThePlayer(thePlayer); */  
       
        
    }
    
    
    public void viewList (){
          
    PrintListMenuView lv = new PrintListMenuView();
    lv.displayMenu();

    }
    
    public void cropView (){
   // CropView crop = new CropView();
   // CropView.runCropsView();      
    

    }
    
    
    
    
        
    }
   
    
    
    
    
    
    

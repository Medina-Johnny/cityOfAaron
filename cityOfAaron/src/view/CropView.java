// The CropView class - part of the view layer
// Author: Johnny Medina, Nelson Jimenez, Jorge Trujillo
// Date last modified: Jun 2018
//-------------------------------------------------------------
package view;

import Control.*;
import byui.cit260.cityOfAaron.model.*;
import cityOfAaron.CityOfAaron;
import exceptions.CropException;
import java.util.Scanner;


public class CropView {
   // Create a Scanner object
 private static final Scanner keyboard = new Scanner(System.in);   
     
 // Get references to the Game object and the CropData object
 private static final Game theGame = CityOfAaron.getTheGame();
 private static final CropData cropData = theGame.getCrop();
 
 // The buyLandView method
 // Purpose: interface with the user input for buying land
// Parameters: none
 // Returns: none
 public static void buyLandView()
 {
     // Get the cost of land for this round.
     int landPrice = CropControl.calcLandCost();
     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",landPrice);
     int acresToBuy;
     boolean paramsNotOkay;
     do
     {
         paramsNotOkay=false;
         System.out.print("\nHow many acres of land do you wish to buy? ");
         acresToBuy = keyboard.nextInt();
         try{
             CropControl.buyLand(landPrice, acresToBuy, cropData);
         }
         catch (CropException e)
                 {
                  System.out.println("I am sorry master, I cannot do this.");
                  System.out.println(e.getMessage());
                  paramsNotOkay = true;   
                 }
     }while(paramsNotOkay);
     
     
     
      
    //  Get the user’s input and save it.
    
    
    // Call the buyLand( ) method in the control layer to buy the land
   
  }
 // The runCropsView method()
// Purpose: runs the Hamurabi game
// Parameters: none
// Returns: none
public static void runCropsView()
{
    // call the buyLandView( ) method
    buyLandView();

    // add calls to the other crop view methods
    sellLandView();
    feedPeopleView();
    plantCropsView();
    // as they are written
}
public static void sellLandView()
{
    // Get the cost of land
    int landPrice = CropControl.calcLandCost();
    // Prompt the user to enter the number of acres to sell
    System.out.format("Land is selling for %d bushels per acre.%n",landPrice);
    //  Get the user’s input and save it.
    int acresToSell;
    boolean paramsNotOkay;
     do
     {
         paramsNotOkay=false;
        System.out.print("\nHow many acres of land do you wish to sell? "); 
        acresToSell = keyboard.nextInt();
        try
        {
          CropControl.sellLand(landPrice, acresToSell, cropData);  
        }
        catch (CropException e)
                 {
                  System.out.println("I am sorry master, I cannot do this.");
                  System.out.println(e.getMessage());
                  paramsNotOkay = true;   
                 }
     }while(paramsNotOkay);
    
}
public static void feedPeopleView() 
{
    //
     
    // Prompt the user to enter the number of bushel of graing to to give people 
    
    
    
    // Call the feedPeople( ) method in the control view feed people
    
    int wheatNeedForPeople;
boolean paramsNotOkay;
     do
     {
         paramsNotOkay=false;
        System.out.print("\nHow many bushels of grain do you want to give to the people? ");
        wheatNeedForPeople = keyboard.nextInt();
        try
        {
          CropControl.feedPeople(wheatNeedForPeople,cropData); 
        }
       catch (CropException e)
                 {
                  System.out.println("I am sorry master, I cannot do this.");
                  System.out.println(e.getMessage());
                  paramsNotOkay = true;   
                 }
     }while(paramsNotOkay);
    
}
public static void plantCropsView()
{
    //Prompt the user to enter the number of land to plant
   System.out.print("\nHow many acres of land do you want to plant? "); 
    //  Get the user’s input and save it.
    int acresToPlant;
    acresToPlant = keyboard.nextInt();
    
    // Call the plantCrops( ) method in the control layer to plant the crops
    CropControl.plantCrops(acresToPlant, cropData);
}
public static void showStarvedView()
{
    //call the showStarvedView()method
    showStarvedView();
    
    // add calls to the other crop view methods
    // as they are written
}
public static void displayCropsReportView()
{
    //call the displayCropsReportView()method
    displayCropsReportView();
    
    // add calls to the other crop view methods
    // as they are written
}

    






}

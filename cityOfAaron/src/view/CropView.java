// The CropView class - part of the view layer
// Author: Johnny Medina, Nelson Jimenez, Jorge Trujillo
// Date last modified: Jun 2018
//-------------------------------------------------------------
package view;

import Control.CropControl;
import byui.cit260.cityOfAaron.model.*;
import cityOfAaron.CityOfAaron;
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
     System.out.print("\nHow many acres of land do you wish to buy? "); 
    //  Get the user’s input and save it.
    int acresToBuy;
    acresToBuy = keyboard.nextInt();
    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.buyLand(landPrice, acresToBuy, cropData);
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
    int landPrice = CropControl.calcLandCost();
    // Prompt the user to enter the number of acres to sell
    System.out.format("Land is selling for %d bushels per acre.%n",landPrice);
    System.out.print("\nHow many acres of land do you wish to sell? "); 
    //  Get the user’s input and save it.
    int acresToSell;
    acresToSell = keyboard.nextInt();
    // Call the sellLand( ) method in the control layer to sell the land
    CropControl.sellLand(landPrice, acresToSell, cropData);
}
public static void feedPeopleView()
{
    //
    System.out.print("\nHow many bushels of grain do you want to give to the people? "); 
    // Prompt the user to enter the number of bushel of graing to to give people 
    int wheatNeedForPeople;
    wheatNeedForPeople = keyboard.nextInt();
    cropData.setWheatForPeople(wheatNeedForPeople);
    // Call the feedPeople( ) method in the control view feed people
    CropControl.feedPeople(cropData);
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

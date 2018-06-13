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
    // as they are written

 
 
 
}
public static void sellLandView()
{
    //call the sellLandView()method
    sellLandView();
    
    // add calls to the other crop view methods
    // as they are written
}
public static void feedPeopleView()
{
    //call the feedPeopleView()method
    feedPeopleView();
    
    // add calls to the other crop view methods
    // as they are written
}
public static void plantCrospView()
{
    //call the plantCrospView()method
    plantCrospView();
    
    // add calls to the other crop view methods
    // as they are written
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
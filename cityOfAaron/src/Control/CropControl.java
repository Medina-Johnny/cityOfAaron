/*The CropControl class-part of the control layer 
 * Class contain of the calculation of metod for managing the crops
 */
package Control;

import byui.cit260.cityOfAaron.model.CropData;

/**
 *Johnny Medina, Jorge Trujillo, Nelson Jimenez 
 * Last modified made in May 31, 2018
 */
public class CropControl {
//The buyLand method
//Purpose: To Buy land
//Parameters: the price of land, the number of acres to buy,and a reference to a CropData object
//Returns: the number of acres owned after the purchase
// Pre-conditions: acres to buy must be >= 0
// and bushels to spend must be <= the number of bushels owned
// People needed to tend the land must be<= the Population
// update acers owned and wheat in store.
   
//Methud signiture    
 public static int buyLand(int landPrice,int acresToBuy,CropData cropData){
    
    //call from crapData
    int bushelsOwned = cropData.getWheatInStore();
    int landOwned = cropData.getAcresOwned();
    int population = cropData.getPopulation();
    
    //bushelsToSpend = acresToBuy * landPrice
    int bushelsToSpend = acresToBuy * landPrice;
    
    //peopleNeededToTend = landOwned / 10
    int peopleNeededToTend = landOwned / 10;
   
    
    
    //If acresToBuy < 0, return -1
    if (acresToBuy < 0){
        return -1;
    }

    //If bushelsToSpend > bushelsOwned, return -1
    if (bushelsToSpend > bushelsOwned){
        return -1;
    }
    
    //peopleNeededToTend > Population, return -1
    if (peopleNeededToTend > population){
        return -1;
    }

    //Update wheatInStore
    bushelsOwned -= bushelsToSpend;
    cropData.setWheatInStore(bushelsOwned);

    //update acresOwned
    landOwned += acresToBuy;
    cropData.setAcresOwned(landOwned);
    
    //return landOwned
    return landOwned;
  }
 
  }
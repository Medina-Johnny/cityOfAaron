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
   
//Method signiture    
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
 


//Nelson Jimenez
//The feedPeople method
//Purpose: Set aside wheat to feed the people
//Parameters: Reference to CropData objects
//Returns: Wheat left in storage after feedint people 
//Pre-condition: Wheat to feed people must >= 0
// wheat to feed must be <= wheatInStorage      
//and <= wheatInStore
//Update wheat for people


//Method signiture    
 public static int feedPeople(CropData cropData){    

    //Call from CropData    
      int wheatOwned = cropData.getWheatInStore();
      int wheatNeedForPeople = cropData.getWheatForPeople();
   
    
    //If wheatForPeople < 0, return -1 
         if(wheatNeedForPeople < 0){     
         return -1;
         }
 
    //If wheatForPeople> wheatInStore, return -1
         if(wheatNeedForPeople > wheatOwned){
            return -1;
         }
 

    //wheatInStore=wheatInStore-wheatForPeople
        wheatOwned -= wheatNeedForPeople; 
        cropData.setWheatInStore(wheatOwned);
 
        wheatNeedForPeople += wheatOwned;
        cropData.setWheatForPeople(wheatNeedForPeople);
 
    //Return WheatOwned
        return wheatOwned;
 
 }   

// Jorge Trujillo
// Last modify date 01 June 2018
//The setOffering method
//Purpose: To set Offering rate
//Parameters: The offering percentage to give for. And a reference to a CropData object
//Returns: The offering rate.
// Pre-conditions: offering rate >= 0
// and offering rate <= 100

//Method signiture
public static int setOffering(int offeringRate, CropData cropData){
    
//If offeringRate < 0, return -1
if (offeringRate < 0){
    return -1;
}
//If offeringRate > 100, return -1
if (offeringRate >100){
    return -1;
}
//return offeringRate
return offeringRate;
}
  
}

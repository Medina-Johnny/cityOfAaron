/*The CropControl class-part of the control layer 
 * Class contain of the calculation of metod for managing the crops
 */
package Control;

import byui.cit260.cityOfAaron.model.CropData;
import exceptions.CropException;
import java.util.Random;


/**
 *Johnny Medina, Jorge Trujillo, Nelson Jimenez 
 * Last modified made in May 31, 2018
 */
public class CropControl {
//sellLand method
// Purpose: Sell land  - subtracts from the acres owned
// Parameters: the price of land, the number of acres to sell, and
//     a reference to a CropData object 
// Pre-conditions: acresToSell >= 0 and acresToSell <= acresOwned
// Returns: the number of acres owned after the sale
public static void sellLand(int landPrice, int acresToSell, CropData cropData)throws CropException
{
//if acresToSell < 0, return Exception
if(acresToSell < 0)
    throw new CropException ("A negative value is input");
//if acresToSell > acresOwned, return Exception
int acresOwned = cropData.getAcresOwned();
if(acresToSell > acresOwned)
throw new CropException ("You don't have this amount of acres to sell");
//acresOwned = acresOwned - acresToSell
acresOwned -= acresToSell;
cropData.setAcresOwned(acresOwned);
//wheatInStore = wheatInStore + (acresToSell x landPrice)
int wheat = cropData.getWheatInStore();
wheat+= (acresToSell * landPrice);
cropData.setWheatInStore(wheat);
}
//The buyLand method
//Purpose: To Buy land
//Parameters: the price of land, the number of acres to buy,and a reference to a CropData object
//Returns: the number of acres owned after the purchase
// Pre-conditions: acres to buy must be >= 0
// and bushels to spend must be <= the number of bushels owned
// People needed to tend the land must be<= the Population
// update acers owned and wheat in store.
   
//Method signature    
 public static void buyLand(int landPrice,int acresToBuy,CropData cropData)throws CropException
 {
    
    //call from crapData
    int bushelsOwned = cropData.getWheatInStore();
    int landOwned = cropData.getAcresOwned();
    int population = cropData.getPopulation();
    
    //bushelsToSpend = acresToBuy * landPrice
    int bushelsToSpend = acresToBuy * landPrice;
    
    //peopleNeededToTend = landOwned / 10
    int peopleNeededToTend = landOwned / 10;
   
    
    
    //If acresToBuy < 0, 
    if (acresToBuy < 0){
        throw new CropException ("A negative value is input");
    }

    //If bushelsToSpend > bushelsOwned, 
    if (bushelsToSpend > bushelsOwned){
        throw new CropException ("There is insufficient wheat to buy this much land");
    }
    
    //peopleNeededToTend > Population, 
    if (peopleNeededToTend > population){
        throw new CropException ("You don't have sufficient people");
    }

    //Update wheatInStore
    bushelsOwned -= bushelsToSpend;
    cropData.setWheatInStore(bushelsOwned);

    //update acresOwned
    landOwned += acresToBuy;
    cropData.setAcresOwned(landOwned);
    
   
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
 public static void feedPeople(int wheatNeedForPeople,CropData cropData)throws CropException{    

    //Call from CropData    
      int wheatOwned = cropData.getWheatInStore();
     // int wheatNeedForPeople = cropData.getWheatForPeople();
   
    
    //If wheatForPeople < 0, return -1 
         if(wheatNeedForPeople < 0){     
         
         throw new CropException ("A negative value is input");
         }
 
    //If wheatForPeople> wheatInStore, return -1
         if(wheatNeedForPeople > wheatOwned){
            
         throw new CropException ("You don't have enough wheat to give");
         }
 

    //wheatInStore=wheatInStore-wheatForPeople
        wheatOwned -= wheatNeedForPeople; 
        cropData.setWheatInStore(wheatOwned);
 
        wheatNeedForPeople += wheatOwned;
        cropData.setWheatForPeople(wheatNeedForPeople);
 
    //Return WheatOwned
    
 
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
    //update setOffering
    cropData.setOffering(offeringRate);
    //return offeringRate
    
    return offeringRate;
}
 
/**
 *Johnny Medina 
 * Last modified made in June 01, 2018
 */

//The plantcrops method
//Purpose: Set aside wheat to plant crops
//Parameters: ,and a reference to a CropData object
//Returns: the number of wheat owned after planting crops
//Pre-conditions: acres to plant must be >= 0
//and acres to plant must be <= the number of acres owned
//wheat needed must be <= to wheat in storage
//update acers owned and wheat in store.

//method signiture
public static int plantCrops(int acresToPlant, CropData cropData){

    //Call from CropData    
    int landOwned = cropData.getAcresOwned();
    int plantedAcres = cropData.getAcresPlanted();
    int wheatOwned = cropData.getWheatInStore();
      
    //bushelsNeeded = acresToPlant / 2
    int bushelsNeeded = acresToPlant / 2;
    
    //if acresToPlant < 0, return -1
    if(acresToPlant < 0) {
        return -1;
    }
    
    //if acresToPlant > acresOwned, return -1
    if(acresToPlant > landOwned) {
        return -1;
    }
    
    //if bushelsNeeded > wheatInStore, return -1
    if(bushelsNeeded > wheatOwned) {
        return -1;
    }
    
    //acresPlanted += acresToPlant
    plantedAcres += acresToPlant;
    //update acresPlanted
    cropData.setAcresPlanted(plantedAcres);
    
    //wheatInStore -= bushelsNeeded
    wheatOwned -= bushelsNeeded;
    //***I am not sure if I need to update wheatInStore?***
    //cropData.setWheatInStore(wheatOwned);
    
    //return wheatInStore
    return wheatOwned;
}
// calcLandCost() method
// Purpose: Calculate a random land cost between 17 and 26 bushels/acre
// Parameters: none
// Returns: the land cost
public static int calcLandCost()
 {
      int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;  
      return landPrice;            
 }
// constants
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 10;
private static final Random random = new Random();

}

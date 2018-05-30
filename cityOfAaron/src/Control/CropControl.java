/*The CropControl class-part of the control layer 
 * Class contain of the calculation of metod for managing the crops
 */
package Control;

import byui.cit260.cityOfAaron.model.CropData;

/**
 *Johnny Medina, Jorge Trujillo, Nelson Jimenez 
 * Last modified made in May 30, 2018
 */
public class CropControl {
//The buyLand method
//Purpose: To Buy land
//Parameters: the price of land, the number of acres to buy. And a reference to a CropData object
//Returns: the number of acres owned after the purchase
//Pre-conditions: acres to buy must be >= 0
//and bushels to spend <= the number of bushels owned
// 
  public int buyLand(int landPrice,int acresToBuy,int bushelsToSpend, CropData cropData){
  

//If acresToBuy < 0, return -1
if (acresToBuy < 0)
    return -1;


//If acresToBuy >= 0,
//bushelsToSpend = acresToBuy * landPrice
if (acresToBuy >= 0)
    bushelsToSpend = acresToBuy * landPrice;


//If bushelsToSpend > bushelsOwned, return -1
int bushelsOwned = cropData.getWheatInStore();
if (bushelsToSpend > bushelsOwned)
    return -1;

//acresOwned = acresOwned + acresTobuy
int owned = cropData.getAcresOwned();
owned += acresToBuy;
cropData.setAcresOwned(owned);
//bushelsOwned = bushelsOwned – (acresToBuy * landPrice)
bushelsOwned -= bushelsToSpend;
cropData.setWheatInStore(bushelsOwned);

//return acresOwned
return owned;
  
  }
      
       
          
  }
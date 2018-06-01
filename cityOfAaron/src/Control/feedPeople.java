/*
 * The feedPeople/part of the control layer
 * Class method for managing the crod
 */
package Control;

import byui.cit260.cityOfAaron.model.CropData;
/**
 * Nelson Jimenez
 * 
 */
public class feedPeople {
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
        
}

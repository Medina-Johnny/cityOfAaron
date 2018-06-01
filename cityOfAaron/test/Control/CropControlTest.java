/**
 * Test of buyLand method, of class CropControl.
 */
package Control;

import byui.cit260.cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Johnny Medina, Jorge Trujillo, Nelson Jimenez 
 * Last modified made in May 31, 2018
 */

public class CropControlTest {
    
    public CropControlTest() {
    }

    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        
        //Test case 1 (Valid, return expected result)
        System.out.println("/tTest Case 1");
        //Input variables
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        theCrops.setPopulation(500);
        int landPrice = 17;
        int acresToBuy = 50;
        
        //Expected output variable
        int expResult = 2850;
        
        //Call the method
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        
        //test return to equal the expected result
        assertEquals(expResult, result);
        

        
       //Test case 2 (Invalid, acers to buy is less than zero, return -1)
        System.out.println("/tTest case 2");
        
        //Input variables
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        theCrops.setPopulation(500);
        landPrice = 17;
        acresToBuy = -50;
        
        //Expected output variable
        expResult = -1;
        
        //Call the method
        result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        
        //test return to equal the expected result
        assertEquals(expResult, result); 
        
        
        
        //Test case 3 (Invalid, not enough wheat in store to buy land, return -1)
        System.out.println("/tTest case 3");
        
        //Input variables
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        theCrops.setPopulation(500);
        landPrice = 17;
        acresToBuy = 100;
        
        //Expected output variable
        expResult = -1;
        
        //Call the method
        result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        
        //test return to equal the expected result
        assertEquals(expResult, result);
        
        
        
        //Test case 4 (Invalid, not enough people to tend the land, return -1)
        System.out.println("/tTest case 4");
        
        //Input variables
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        theCrops.setPopulation(500);
        landPrice = 17;
        acresToBuy = 100;
        
        //Expected output variable
        expResult = -1;
        
        //Call the method
        result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        
        //test return to equal the expected result
        assertEquals(expResult, result);
        
        
        
        //Test case 5 (Boundary, one less acer would return error, return expected result)
        System.out.println("/tTest case 5");
        
        //Input variables
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        theCrops.setPopulation(500);
        landPrice = 17;
        acresToBuy = 0;
        
        //Expected output variable
        expResult = 2800;
        
        //Call the method
        result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        
        //test return to equal the expected result
        assertEquals(expResult, result);
        
        
        
        //Test case 6 (Boundary, one more bushel needed would return error, return expected result)
        System.out.println("/tTest case 6");
        
        //Input variables
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        theCrops.setPopulation(500);
        landPrice = 17;
        acresToBuy = 58;
        
        //Expected output variable
        expResult = 2858;
        
        //Call the method
        result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        
        //test return to equal the expected result
        assertEquals(expResult, result);
    }
    
    
        
}

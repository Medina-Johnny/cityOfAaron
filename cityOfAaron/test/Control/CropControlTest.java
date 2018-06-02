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
    
    /**
     * Test of feedPeople method, of class feedPeople.
     */
    
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        
        //Test case 1(Valid,expected result)
        System.out.println("/tTest case 1");
        
        //Input veriables 
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(2500);
        theCrops.setWheatForPeople(200);
        
        //Expected output variable
        int expResult = 2300;
        
        //Call the method
        int result = CropControl.feedPeople(theCrops);
        
        //Test return to equal the expected results
        assertEquals(expResult, result);
        
        
        
        
        //Test case 2(Invalid, feed the people less thand 0, return -1)
        System.out.println("/tTest case 2");
        
        //Input veriables 
        theCrops.setWheatInStore(2500);
        theCrops.setWheatForPeople(-5);
        
        //Expected output variable
        expResult = -1;
        
        //Call the method
        result = CropControl.feedPeople(theCrops);
        
        //Test return to equal the expected results
        assertEquals(expResult, result);
        
        
        
        //Test case 3(Invalid, wheat for peopl is more than wheat in store return -1)
        System.out.println("/tTest case 3");
        
        //Input veriables 
        theCrops.setWheatInStore(2500);
        theCrops.setWheatForPeople(3000);
        
        //Expected output variable
        expResult = -1;
        
        //Call the method
        result = CropControl.feedPeople(theCrops);
        
        //Test return to equal the expected results
        assertEquals(expResult, result);
    
    
       //Test case 4(Valid, boundries if 1 more wheat added return error, return expected)
        System.out.println("/tTest case 4");
        
        //Input veriables 
        theCrops.setWheatInStore(2500);
        theCrops.setWheatForPeople(2500);
        
        //Expected output variable
        expResult = 0;
        
        //Call the method
        result = CropControl.feedPeople(theCrops);
        
        //Test return to equal the expected results
        assertEquals(expResult, result);    
    
        
        
       //Test case 5(Valid, boundries if wheat for peopl one less return error)
        System.out.println("/tTest case 5");
        
        //Input veriables 
        theCrops.setWheatInStore(2500);
        theCrops.setWheatForPeople(0);
        
        //Expected output variable
        expResult = 2500;
        
        //Call the method
        result = CropControl.feedPeople(theCrops);
        
        //Test return to equal the expected results
        assertEquals(expResult, result);
        
    }
  
 /**
     * Test of setOffering method, of class setOffering.
     */
    @Test
    public void testSetOffering() {
        System.out.println("setOffering");
        //Test case 1 (Valid, return expected result)
        System.out.println("/tTest Case 1");
        //Input variables
        CropData theCrops = new CropData();
        int offeringRate = 50;
        //Expected output variable
        int expResult = 50;
        //Call the method
        int result = CropControl.setOffering(offeringRate, theCrops);
        //Test return to equal the expected results
        assertEquals(expResult, result);
        
    //Test case 2 (Invalid, setOffering < 0 return -1)
        System.out.println("/tTest Case 2");
        //Input variables
        
        offeringRate = -5;
        //Expected output variable
        expResult = -1;
        //Call the method
        result = CropControl.setOffering(offeringRate, theCrops);
        //Test return to equal the expected results
        assertEquals(expResult, result);
        
    //Test case 3 (Invalid, setOffering > 100 return -1)
        System.out.println("/tTest Case 3");
        //Input variables
        
        offeringRate = 300;
        //Expected output variable
        expResult = -1;
        //Call the method
        result = CropControl.setOffering(offeringRate, theCrops);
        //Test return to equal the expected results
        assertEquals(expResult, result);
        
    //Test case 4 (Boundary, setOffering = 0 return 0)
        System.out.println("/tTest Case 4");
        //Input variables
        
        offeringRate = 0;
        //Expected output variable
        expResult = 0;
        //Call the method
        result = CropControl.setOffering(offeringRate, theCrops);
        //Test return to equal the expected results
        assertEquals(expResult, result);
    
    //Test case 5 (Boundary, setOffering = 100 return 100)
        System.out.println("/tTest Case 5");
        //Input variables
        
        offeringRate = 100;
        //Expected output variable
        expResult = 100;
        //Call the method
        result = CropControl.setOffering(offeringRate, theCrops);
        //Test return to equal the expected results
        assertEquals(expResult, result);
    }    
}

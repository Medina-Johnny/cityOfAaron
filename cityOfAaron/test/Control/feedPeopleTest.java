/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import byui.cit260.cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JIMENEZ'S
 */
public class feedPeopleTest {
    
    public feedPeopleTest() {
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
        int result = feedPeople.feedPeople(theCrops);
        
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
        result = feedPeople.feedPeople(theCrops);
        
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
        result = feedPeople.feedPeople(theCrops);
        
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
        result = feedPeople.feedPeople(theCrops);
        
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
        result = feedPeople.feedPeople(theCrops);
        
        //Test return to equal the expected results
        assertEquals(expResult, result);
        
    }
    
}

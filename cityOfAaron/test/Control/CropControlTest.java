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
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        theCrops.setPopulation(500);
        int landPrice = 17;
        int acresToBuy = 50;
        //CropData cropData = null;
        int expResult = 2850;
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

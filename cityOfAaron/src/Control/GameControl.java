/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.util.ArrayList;
import byui.cit260.cityOfAaron.model.*;
import cityOfAaron.CityOfAaron;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author JIMENEZ'S
 */
public class GameControl{
 
  // size of the Locations array
   private static final int MAX_ROW = 5;
   private static final int MAX_COL = 5;
    
  // reference to a Game object
   private static Game theGame; 
   
   
   
  public static void createNewGame(String pName){
      
        // Created the game object. Save it in the main driver file
           theGame = new Game();
           CityOfAaron.setTheGame(theGame);

        // create the player object. Save it in the game object
           Player thePlayer = new Player();
           thePlayer.setName(pName);
           theGame.setThePlayer(thePlayer); 

        // create the list of animals
        createAnimalList();
        // create the list of tools
        createToolList();
        // create the list of provisions
        createProvisionList();
        // create the Locations and the Map object  
        createMap();
        
        createCropDataObject();
    }
       
       // create the CropData object
       // method prologue ….
    public static void createCropDataObject()
    {
        CropData theCrops = new CropData();
        
        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
        theCrops.setAcresPlanted(1000); 
        
        theGame.setCrop(theCrops);         
    }

   public static void createAnimalList()
    {
        ArrayList<ListItem> animals = new ArrayList<ListItem>();
        
        animals.add(new ListItem("chickens", 40));
        animals.add(new ListItem("dogs", 4));
        animals.add(new ListItem("sheeps", 20));
        animals.add(new ListItem("oxen", 8));
       
        theGame.setAnimals(animals);
        
    }


    // The createMap method
    // Purpose: creates the location objects and the map
    // Parameters: none
    // Returns: none
    public static void createMap()   
    {
        // create the Map object, it is 5 x 5
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);

        // create a string that will go in the Location objects
        // that contain the river
    String river = "\nYou are on the River. The river is the source" +
                      "\nof life for our city. The river marks the eastern " +
                      "\nboundary of the city - it is wilderness to the East.";

        // create a new Location object
     Location loc = new Location();

        // use setters in the Location class to set the description and symbol
    loc.setDescription(river);
    loc.setSymbol("~~~");  

        // set this location object in each cell of the array in column 4      
    for(int i = 0; i < MAX_ROW; i++)
   {
        theMap.setLocation(i, 4, loc);
   }
    // define the string for a farm land location
 String farmland = "\nYou are on the fertile banks of the River." +
 "\nIn the springthis low farmland floods and is covered with rich" +
 "\nnew soil. Wheat is planted as far as you can see."; 

 // set a farmland location with a hint
 loc = new Location();
 loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
 loc.setSymbol("!!!");
 theMap.setLocation(0, 2, loc);
 // define the string for a barn location
 String barn = "\nYou are in the barn." +
 "\nHere is all the wheat that you need to live" +
 "\nplease use it carefully."; 

 // set a barn location.
 loc = new Location();
 loc.setDescription(barn);
 loc.setSymbol("$$$");
 theMap.setLocation(2, 2, loc);

    theGame.setTheMap(theMap);
    }

  public static void createToolList()
    {
        ArrayList<ListItem> tools = new ArrayList<ListItem>();
        
        tools.add(new ListItem("hammer", 3));
        tools.add(new ListItem("shovel", 4));
        tools.add(new ListItem("axe", 7));
        tools.add(new ListItem("handsaw", 4));
       
        theGame.setTools(tools);
        
        
    }  
    
    
    public static void createProvisionList()
    {
        ArrayList<ListItem> provisions = new ArrayList<ListItem>();
        
        provisions.add(new ListItem("meat", 12));
        provisions.add(new ListItem("milk", 3));
        provisions.add(new ListItem("egg", 7));
        provisions.add(new ListItem("bread", 4));
       
        theGame.setProvisions(provisions);
           
        
    }
    
    // the getSavedGame method
    // Purpose: load a saved game from disk
    // Parameters: the file path
    // Returns: none
    // Side Effect: the game reference in the driver is updated
    public static void getSavedGame(String filePath){
        //Game theGame = null;
        try (FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            theGame = (Game)  input.readObject();
            //CityOfAaron.setTheGame(theGame);
        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error reading the saved game file");
        }
        
    // the setSaveGame method
    // Purpose: save a game to desk
    // Parameters: the file path
    // Returns: none
    // Side Effect: the game reference in the driver is updated 
    }
    public static void setSaveGame(String filePath){
       //Game theGame = null;
        try (FileOutputStream fips = new FileOutputStream(filePath))
        {
            ObjectOutputStream output = new ObjectOutputStream(fips);
            output.writeObject(theGame);
            //CityOfAaron.setTheGame(theGame);
        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error writing the saved game file");
        }
    }
    
}
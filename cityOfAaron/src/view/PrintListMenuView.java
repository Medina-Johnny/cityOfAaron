// The PrintListMenuView class - part of the view layer
// Object of this class manages the print list menu
// Author: Johnny Medina
// Date last modified: 21 Jun 2018
//-----------------------------------------------------------
package view;

import Control.*;
import byui.cit260.cityOfAaron.model.*;
import cityOfAaron.CityOfAaron;
import exceptions.CropException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintListMenuView extends MenuView{
    private ArrayList<ListItem> animals;
   private ArrayList<ListItem> tools;
   private ArrayList<ListItem> provisions; 
   Game theGame = CityOfAaron.getTheGame();
    
  Scanner keyboard = new Scanner(System.in);

    public PrintListMenuView()
    {

        super("\n" +
            "*******************************************\n" +
            "* CITY OF AARON: DISPLAY/PRINT LIST MENU  *\n" +
            "*******************************************\n" +
            " 1 - Print a list of the animals in the storehouse\n" +
            " 6 - Save a list of the animals in the storehouse\n" +    
            " 2 - List or view the tools in the storehouse\n" +
            " 3 - List or view the provisions in the storehouse\n" +
            " 4 - List or view the authors of this game\n" +
            " 5 - Return to game menu\n",
            
        6);
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // Print the animals in storehouse
                printAnimals();
                break;
            case 2: 
                // show the tools in storehouse
                choiceTools ();
             
                break;
            case 3: // Show the provisions in the storehouse
                provisionsStoreHouse();
                break;
            case 4: // Display the game authors
                authorsGame();
                break;
            case 5: //Return to main menu
                GameMenuView mmv = new GameMenuView();
                mmv.displayMenu();
            break;
            case 6: {
                saveAnimals(); // save the animals in storehouse
            break;
        } 
            case 7: 
                saveTools(); // save the tools in storehouse
            break;
        }
    }

    private void printAnimals() {
        
             // Print Animal Heading
            System.out.println("\n\n   Animal List Report   \n");
            
                // use a for loop to get array animal list
                animals = theGame.getAnimals();
                for (int i=0;i<animals.size();i++){
                    ListItem li = animals.get(i);
                    // and output it
                    System.out.println(li.getName( ) + " : " + li.getNumber( ) );
                }
        
        }
        
     
    
    private void saveAnimals(){

        // declare a string to hold the file name
        String value;

        // prompt the user for a file name, get and save the user’s input
        System.out.println("Enter File Name to save: ");
        value = keyboard.next();
        
        // create the PrintWriter object
        try (PrintWriter out = new PrintWriter(value)){
             
             // get a reference to the ArrayList you want to output
             animals = theGame.getAnimals();
             // output a heading for the report
            out.println("\n\n   Animal List Report   \n\n");
            
                // use a for loop to get array animal list
                for (int i=0;i<animals.size();i++){
                ListItem li = animals.get(i);
                
                // and output it
                out.println(li.getName( ) + ": " + li.getNumber( ) );
                }
        
        }
        catch(Exception e){
            // output error message
            System.out.println("\nThere was an error saveing file");
        }
        
        finally{
            //printWriter.close ();
        }
    }
    
    private void choiceTools() {
        int value;
        System.out.println("Enter 0 to view the tools list or 1 to save the tools list in a file ");
        value = keyboard.nextInt();
        if (value == 0){
           toolsStoreHouse(); 
        }
        if (value == 1){
            saveTools();
        }
         else
            System.out.println("It is not a valid value");
            
    }
    
    private void toolsStoreHouse() {
        tools = theGame.getTools();
        for (int i=0; i<tools.size(); i++){
        ListItem li = tools.get(i);   // get the list item from the ArrayList
        System.out.println(li.getName( ) + ": " + li.getNumber( ) );
    
        }
    }
    
    private void saveTools(){
       
       //Declare a string to hold the file name
    String outLocation;
    //Prompt the user for a file name, get and save the user input
    System.out.println("Please enter file name");
    outLocation = keyboard.next();
    
    try (PrintWriter out = new PrintWriter(outLocation))
    {
     //output a heading for the report
        out.println("\n\n                   List Report");
        out.printf("%n%-20s%10s",  "Description","Quantity");
        out.printf("%n%-20s%10s",  "-----------","--------");
     //use a loop to get the data from array list and output
       for (ListItem Tools : tools) {
           out.printf("%n%-20s%7d", Tools.getName(),Tools.getNumber());
    }
    }
    catch (IOException ex)
    {
       
               System.out.println("I/O Error: " + ex.getMessage());
    }
    }
    
    
    private void provisionsStoreHouse() {
        System.out.println("\nDisplay provisions in the storehouse");
    
    // declare a string to hold the file name
        String value;

        // prompt the user for a file name, get and save the user’s input
        System.out.println("Enter File Name to save: ");
        value = keyboard.next();
        
        // create the PrintWriter object
        try (PrintWriter out = new PrintWriter(value)){
             
             // get a reference to the ArrayList you want to output
             provisions = theGame.getProvisions();
             // output a heading for the report
            out.println("\n\n   Provision List Report   \n\n");
            
                // use a for loop to get array animal list
                for (int i=0;i<provisions.size();i++){
                ListItem li = provisions.get(i);
                
                // and output it
                out.println(li.getName( ) + ": " + li.getNumber( ) );
                }
        
        }
        catch(Exception e){
            // output error message
            System.out.println("\nThere was an error saveing file");
        }
        
        finally{
            //printWriter.close ();
        }
    
        
    }
    private void authorsGame() {
        System.out.println("\nDisplay authors of the game");
    }
    
    
}
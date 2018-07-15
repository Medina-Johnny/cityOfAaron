// The PrintListMenuView class - part of the view layer
// Object of this class manages the print list menu
// Author: Johnny Medina
// Date last modified: 21 Jun 2018
//-----------------------------------------------------------
package view;

import byui.cit260.cityOfAaron.model.*;
import cityOfAaron.CityOfAaron;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
            " 2 - Print a list of the tools in the storehouse\n" +
            " 3 - Print a list of the provisions in the storehouse\n" +
            " 4 - Print a list of the authors of this game\n\n" +
            " 5 - Save a list of the animals in the storehouse\n" +
            " 6 - Save a list of the tools in the storehouse\n" +
            " 7 - Save a list of the provisions in the storehouse\n" +
            " 8 - Save a list of the authors of this game\n" +   
            " 9 - Return to game menu\n",
            
        9);
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
            case 2: // show the tools in storehouse
                printTools ();
                break;
            case 3: // Show the provisions in the storehouse
                printProvisions();
                break;
            case 4: // Display the game authors
                printAuthors();
                break;
            case 5: // Print the animals in storehouse
                saveAnimals();
                break;
            case 6: // show the tools in storehouse
                saveTools ();
                break;
            case 7: // Show the provisions in the storehouse
                saveProvisions();
                break;
            case 8: // Display the game authors
                saveAuthors();
                break;
            case 9: //Return to main menu
                GameMenuView mmv = new GameMenuView();
                mmv.displayMenu();
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
    
    private void printTools() {
        
             // Print Tools Heading
            System.out.println("\n\n   Tools List Report   \n");
            
                // use a for loop to get array tools list
                tools = theGame.getTools();
                for (int i=0;i<tools.size();i++){
                    ListItem li = tools.get(i);
                    // and output it
                    System.out.println(li.getName( ) + " : " + li.getNumber( ) );
                }
        
        }
    
    private void saveTools() {
        // declare a string to hold the file name
        String value;

        // prompt the user for a file name, get and save the user’s input
        System.out.println("Enter File Name to save: ");
        value = keyboard.next();
        
        // create the PrintWriter object
        try (PrintWriter out = new PrintWriter(value)){
             
             // get a reference to the ArrayList you want to output
             tools = theGame.getTools();
             // output a heading for the report
            out.println("\n\n   Tools List Report   \n\n");
            
                // use a for loop to get array Tools list
                for (int i=0;i<tools.size();i++){
                ListItem li = tools.get(i);
                
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
    
    
    private void printProvisions() {
        
             // Print Tools Heading
            System.out.println("\n\n   Provisions List Report   \n");
            
                // use a for loop to get array provisions list
                provisions = theGame.getProvisions();
                for (int i=0;i<provisions.size();i++){
                    ListItem li = provisions.get(i);
                    // and output it
                    System.out.println(li.getName( ) + " : " + li.getNumber( ) );
                }
        
        }
    
    private void saveProvisions() {
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
            out.println("\n\n   Provisions List Report   \n\n");
            
                // use a for loop to get array provisions list
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
    
    private void printAuthors() {
        System.out.println("\nPrint authors of the game");
    }
    
    private void saveAuthors() {
        System.out.println("\nDisplay authors of the game");
    }
    
    
}
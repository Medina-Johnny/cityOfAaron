/*The main() class file for the cityOfAaron project 
 *CIT-260 Brother Devry
 *Team members: Johnny Medina, Nelson Jimenez, Jorge Trujillo
 */
package cityOfAaron;
import byui.cit260.cityOfAaron.model.Game;
import java.io.IOException;
import java.io.PrintWriter;
import static jdk.nashorn.tools.ShellFunctions.input;
import view.*;


/*import byui.cit260.cityOfAaron.model.CropData;
import byui.cit260.cityOfAaron.model.Game;
import byui.cit260.cityOfAaron.model.ListItem;
import byui.cit260.cityOfAaron.model.Location;
import byui.cit260.cityOfAaron.model.Player;
import byui.cit260.cityOfAaron.model.TeamMember;*/



public class CityOfAaron {
    // variable for keeping a reference to the Game object
    private static Game theGame = null;
    private static PrintWriter outFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }
    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }

    
    
    // main function - entry point for the program
    // runs the main menu
    public static void main(String[] args) {
       
        try 
        {
            CityOfAaron.outFile = new PrintWriter(System.out, true);
            MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString()+
                               "/nCause: " + e.getCause()+
                               "Message: " + e.getMessage());
            e.printStackTrace();;
           /* finally {
                try 
                    {
                      if (CityOfAaron.outFile != null)
                          CityOfAaron.outFile.close();
                    }catch (IOException ex) {
                    System.out.println("Error to close file");
                    return;
                    }
                   
                    }*/
        }
        
        
        
        
        
        
        /*int value1;
        String value2;
        System.out.println("Enter a number: ");
        value1 = input.nextInt();

        // dummy nextLine() read nl character left in the stream
        //input.nextLine();

        System.out.println(“Enter a string value: “);
        value2 = input.nextLine();
        System.out.println(value1);
        System.out.println(value2);*/

    }
    
    
    
    /*   //Pleyer Class Test
        Player playerOne = new Player();
        playerOne.setName("Fred Flintstone" );
        String playerOneName = playerOne.getName();
        
        System.out.println("name = " + playerOneName);
        
        //TeamMember enum class Test
        System.out.println("Team Member One is : " + TeamMember.MemberOne.getName() + " " + TeamMember.MemberOne.getTitle());
        
        //CropData Class Test
        CropData yearOne = new CropData();
        yearOne.setYear(1981);
        int yearOneYear = yearOne.getYear();
        
        System.out.println("year One is = " +  yearOneYear);
        
        //Game Class Test
        Game gameOne = new Game();
        gameOne.setThePlayer("Player One");
        String gameOnePlayer = gameOne.getThePlayer();
        
        System.out.println("Game One = " +  gameOnePlayer);
        
        //ListItem Class Test
        ListItem itemOne = new ListItem();
        itemOne.setName("Wheat");
        String firstItem = itemOne.getName();
        
        System.out.println("Item one is = " +  firstItem);
        
        //Location Class Test
        Location locationOne = new Location();
        locationOne.setDescription("West");
        String firstLocation = locationOne.getDescription();
        
        System.out.println("Location one is = " +  firstLocation);*/
    
}

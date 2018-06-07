/*The main() class file for the cityOfAaron project 
 *CIT-260 Brother Devry
 *Team members: Johnny Medina, Nelson Jimenez, Jorge Trujillo
 */
package cityofaaron;

import byui.cit260.cityOfAaron.model.Game;
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

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }

    // main function - entry point for the program
    // runs the main menu

    public static void main(String[] args) {
       
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
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
        
        System.out.println("Location one is = " +  firstLocation);
    }*/

    public static void setCurrentGame(Game theGame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

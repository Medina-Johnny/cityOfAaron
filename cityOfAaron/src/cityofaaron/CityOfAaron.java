/*The main() class file for the cityOfAaron project 
 *CIT-260 Brother Devry
 *Team members: Johnny Medina, Nelson Jimenez, Jorge Trujillo
 */
package cityofaaron;

import byui.cit260.cityOfAaron.model.CropData;
import byui.cit260.cityOfAaron.model.Game;
import byui.cit260.cityOfAaron.model.ListItem;
import byui.cit260.cityOfAaron.model.Location;
import byui.cit260.cityOfAaron.model.Player;
import byui.cit260.cityOfAaron.model.TeamMember;

/**
 *
 * @author medina
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Pleyer Class Test
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
    }
    
}

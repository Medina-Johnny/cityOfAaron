/*The main() class file for the cityOfAaron project 
 *CIT-260 Brother Devry
 *Team members: Johnny Medina, Nelson Jimenez, Jorge Trujillo
 */
package cityofaaron;

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
        Player playerOne = new Player();
        playerOne.setName("Fred Flintstone" );
        
        String playerOneName = playerOne.getName();
        
        System.out.println("name =" + playerOneName);
        
        System.out.println(TeamMember.MemberOne.getName() + " " + TeamMember.MemberOne.getTitle());
        
    }
    
}

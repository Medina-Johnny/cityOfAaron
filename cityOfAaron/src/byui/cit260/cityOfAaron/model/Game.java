/*The main() class file for the cityOfAaron project 
 *CIT-260 Brother Devry
 *Team members: Johnny Medina, Nelson Jimenez, Jorge Trujillo
 */
package byui.cit260.cityOfAaron.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author medina
 */
public class Game implements Serializable{
    
    private ArrayList<ListItem> animals;
   private ArrayList<ListItem> tools;
   private ArrayList<ListItem> provisions;
    private Player thePlayer;
    private Map theMap;
    
    public Game() {
    }

    
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.thePlayer);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        return Objects.equals(this.thePlayer, other.thePlayer);
    }
private CropData cropData=null;
    // the getCrops() method
    // Purpose: get a reference to the crop object
    // Parameters: none
    // Returns: a reference to a crop object

    public CropData getCrop() {
        return cropData;
    }
    // the setCrops() method
    // Purpose: store a reference to a crop object
    // Parameters: a reference to a crop object
    // Returns: none    
    public void setCrop(CropData _cropRef) {
        cropData = _cropRef;
    }
    
   public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

 
 
 public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }

}
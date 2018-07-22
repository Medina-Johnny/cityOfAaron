/*The main() class file for the cityOfAaron project 
 *CIT-260 Brother Devry
 *Team members: Johnny Medina, Nelson Jimenez, Jorge Trujillo
 */
package byui.cit260.cityOfAaron.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author medina
 */
public class Player implements Serializable{
    
    // class instance variables
    private String name;
    private int row;
    private int column;

    
    // default constructor method
    public Player() {
    }
    
    // getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
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
        final Player other = (Player) obj;
        return Objects.equals(this.name, other.name);
    }

    
    
    
}

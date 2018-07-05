/*CropException() class file for the cityOfAaron project 
 *CIT-260 Brother Devry
 *July 5,2018
 *Team members: Johnny Medina, Nelson Jimenez, Jorge Trujillo
 */
package exceptions;

/**
 *
 * @author JDTELECOMUNICACIONES
 */
public class CropException extends Exception {
    
     //Default constructor
     // Purpose: Initializes data members to default values
     // Parameters: none
     // Returns: none
    public CropException() { }

// Parameterized  constructor
// Purpose: Initializes data members to value passed as a parameter
// Parameters: A string containing the error message
// Returns: none
    public CropException(String string)
    {
        super(string);
    }
    
    
    
}

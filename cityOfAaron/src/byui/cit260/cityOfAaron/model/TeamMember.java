/*The main() class file for the cityOfAaron project 
 *CIT-260 Brother Devry
 *Team members: Johnny Medina, Nelson Jimenez, Jorge Trujillo
 */
package byui.cit260.cityOfAaron.model;

/**
 *
 * @author medina
 */
public enum TeamMember {
    
    MemberOne("Johnny", "Medina"),
    MemberTwo("Nelson", "Jimenez"),
    MemberThree("Jorge", "Trujillo");

    
    private final String name;
    private final String title;

        TeamMember(String name, String title) {
        this.name = name;
        this.title = title;

    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", title=" + title + '}';
    }

    
}
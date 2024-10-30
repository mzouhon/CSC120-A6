import java.util.ArrayList;

/**
 * represents a house that extends the Building class, adds attributes that manage residents and whether the house has a dining room
 */

public class House extends Building {

  private ArrayList < String > residents;
  private boolean hasDiningRoom;

  /**
   * constructs a house with the specified parameters:
   * 
   * @param name name of house
   * @param address address of house
   * @param nFloors number of floors of house
   * @param hasDR whether house has a dining room
   */
  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name, address, nFloors);
    residents = new ArrayList < String > ();
    hasDiningRoom = hasDR;

    System.out.println("You have built a house: 🏠");
  }

  /**
   * returns whether house has dining room
   * 
   * @return true if house has a dining room, false otherwise
   */
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }

  /**
   * returns number of residents in a house
   * 
   * @return number of residents
   */
  public int nResidents() {

    System.out.println(this.name + " has " + residents.size() + " residents.");
    return residents.size();
  }

  /**
   * allows a person to move into a house
   * 
   * @param name name of person attempting to move in
   */
  public void moveIn(String name) {
    if (residents.contains(name)) {
      System.out.println(name + "has already moved in.");
    } else {
      residents.add(name);
      System.out.println(name + " has moved into " + this.getName());

    }

  }

  /**
   * allows a resident to move out of a house
   * 
   * @param name name of person attempting to move out
   * @return name or person who move out or a message if unsucessful
   */
  public String moveOut(String name) {
    if (residents.contains(name)) {
      residents.remove(name);
      System.out.println(name + " has moved out of " + this.getName());
      return name;
    } else
      System.out.println(name + " does not appear to live in " + this.getName());
    return (name + " does not appear to live in " + this.getName());
  }

  /**
   * checks if a person is a resident of a house
   * 
   * @param person the name of the person to check
   * @return true if person is a resident, false otherwise
   */
  public boolean isResident(String person) {
    return this.residents.contains(person);
  }
  public static void main(String[] args) {

  }

}
/**
 * Represents a building with a name, address, and number of floors.
 */
public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;
  
    /**
     * constructs a building with the specified name, address, and number of floors
     * 
     * @param name name of the building, defaults to "<Name Unknown>" if null
     * @param address address of the building, defaults to  "<Address Unknown>" if null
     * @param nFloors number of floors in the building,  must be >=1
     * @throws RuntimeException if nFloors is <1
     */
    public Building(String name, String address, int nFloors) {
      if (name != null) {
        this.name = name;
      }
      if (address != null) {
        this.address = address;
      }
      if (nFloors < 1) {
        throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
      }
      this.nFloors = nFloors;
    }
  
    /**
     * returns name of the building
     * 
     * @return name of building
     */
    public String getName() {
      return this.name;
    }
  
    /**
     * returns address of building
     * 
     * @return address of building
     */
    public String getAddress() {
      return this.address;
    }
  
    /**
     * returns number of floors of building
     * 
     * @return number of floors of building
     */
    public int getFloors() {
      return this.nFloors;
    }
  
    /**
     * returns a string represntation of the building object
     * 
     * @return string containing name, number of floors, and address of building
     */
    public String toString() {
      return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }
  
    public static void main(String[] args) {
  
    }
  
  }
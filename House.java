/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name, address, nFloors);
    residents= new ArrayList<String>();
    hasDiningRoom=hasDR;

    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  public int nResidents(){

    System.out.println(this.name + " has " + residents.size() + " residents.");
    return residents.size();
  }

  public void moveIn(String name){
    if (residents.contains(name)){
      System.out.println(name + "has already moved in.");
    }else{
      System.out.println(name + " has moved into "+ this.getName());
      residents.add(name);
    }
    
  }

  public String moveOut(String name){
    if (residents.contains(name)){
      residents.remove(name);
      System.out.println(name + " has moved out of " + this.getName());
      return name;
    }else
    System.out.println(name + " does not appear to live in "+ this.getName());
    return( name + " does not appear to live in "+ this.getName());
  }

  public boolean isResident(String person){

    if (residents.contains(person)){
        System.out.println(person + " lives here.");
      return true;
    }else{
      System.out.println(person + " does not live here.");
      return false;
    }
  }
  public static void main(String[] args) {
   House myHouse= new House("Tyler House", "IDK", 3, true);
    
    myHouse.moveIn("Anna");
    myHouse.moveIn("Cardiff");
    myHouse.moveIn("Lali");

    myHouse.isResident("Anna");
    myHouse.isResident("Liv");
    myHouse.moveOut("Liv");
    myHouse.nResidents();
    System.out.println(myHouse.hasDiningRoom());
  }

}
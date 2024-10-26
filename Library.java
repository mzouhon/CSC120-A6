/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {

    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      collection= new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    //are we allowed to have repeats of a book in a collection?
    public void addTitle(String title){
      collection.put(title, true);
      System.out.println(title + " has been added to the " + this.getName() + " Library Collection");
    }

    public String removeTitle(String title){
      if (collection.containsKey(title)){
        collection.remove(title);
        return (title+ " has been removed from the "+ this.getName() + " Library Collection");
      }else{
        return(title+ " could not be found in the "+ this.getName()+ " Library Collection");
      }
    }

    public void checkOut(String title){
     if ((collection.containsKey(title)) && (collection.get(title)==true)){
        collection.replace(title, false);
        System.out.println(title + " has sucessfully been checked out.");
      }else if ((collection.containsKey(title)) && (collection.get(title)==false)){
        System.out.println(title + " has already been checked out. Please try another book.");
      }else{
        System.out.println(title + " is not in the "+ this.name + " Library Collection.");
      }
    }

    public void returnBook(String title){
      if ((collection.containsKey(title)) && (collection.get(title)==false)){
        collection.replace(title, true);
        System.out.println(title + " has sucessfully been returned.");
      }else if ((collection.containsKey(title)) && (collection.get(title)==true)){
        System.out.println(title + " has already been returned.");
      }else{
        System.out.println(title + " is not in the "+ this.name + " Library Collection.");
      }
    }

  
    public static void main(String[] args) {
      Library myLibrary=new Library("Neilson", "IDK", 4);

      myLibrary.addTitle("Beauty and the Beast");
      myLibrary.addTitle("Lord of the Rings");
      myLibrary.addTitle("Harry Potter");
      myLibrary.checkOut("Harry Potter");
      myLibrary.checkOut("Harry Potter");
      myLibrary.checkOut("Star Wars");
      myLibrary.returnBook("Harry Potter");
      myLibrary.returnBook("Harry Potter");
      myLibrary.returnBook("Star Wars");
    }
  
  }
package basic;

public class ConstructorDemo {

  // Metode untuk mendemonstrasikan penggunaan constructor
  public void demo() {

    // Membuat objek user1 menggunakan constructor default
    UserConstructor user1 = new UserConstructor();

    // Menampilkan attribute username dan password untuk user1
    System.out.println("User1 name: " + user1.getUsername());
    System.out.println("User1 Password: " + user1.getPassword());

    // Membuat objek user2 menggunakan constructor dengan parameter
    UserConstructor user2 = new UserConstructor("Dani", "Password1");
    
    // Menampilkan attribute username dan password untuk user2
    System.out.println("User2 name: " + user2.getUsername());
    System.out.println("User2 Password: " + user2.getPassword());
  }
}

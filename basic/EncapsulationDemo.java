package basic;

public class EncapsulationDemo {

  // Metode untuk mendemonstrasikan konsep enkapsulasi
  public void demo() {
    User dian = new User(); // Membuat objek User bernama 'dian'

    // Menyetel nilai properti melalui metode setter
    dian.setUsername("dian"); 
    dian.setPassword("kopiJava");

    // Menampilkan nilai properti melalui metode getter
    System.out.println("Username: " + dian.getUsername());
    System.out.println("Password: " + dian.getPassword());
  }

}

package basic;

public class UserConstructor {
  private String username; // Attribute untuk menyimpan username
  private String password; // Attribute untuk menyimpan password

  // Constructor default, dipanggil saat objek dibuat tanpa parameter
  public UserConstructor() {
    System.out.println("Eksekusi method constructor...");
  }

  // Constructor dengan parameter, digunakan untuk langsung menginisialisasi properti
  public UserConstructor(String username, String password) {
    this.username = username;
    this.password = password;
  }

  // Setter untuk username
  public void setUsername(String username) {
    this.username = username;
  }

  // Setter untuk password
  public void setPassword(String password) {
    this.password = password;
  }

  // Getter untuk username
  public String getUsername() {
    return this.username;
  }

  // Getter untuk password
  public String getPassword() {
    return this.password;
  }
}

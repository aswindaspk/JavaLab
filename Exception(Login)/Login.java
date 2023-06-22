import java.util.Scanner;


class UserException extends Exception {
 
 public UserException(String msg) {
  super(msg);
 }
}

public class Login {

 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  String username, password;
  
  System.out.print("Enter username :: ");
  username = s.nextLine();
  
  System.out.print("Enter password :: ");
  password = s.nextLine();
  
  
  try {
   if(username.length()<6)
    throw new UserException("Username must be greater than 6 characters.");
   else if(!password.equals("123456"))
    throw new UserException("Incorrect password.");
   else
    System.out.println("\n\nLogin Successful. Hi "+username+" Welcome back!");
  }
  catch (UserException e) {
   e.printStackTrace();
  }
 }
}

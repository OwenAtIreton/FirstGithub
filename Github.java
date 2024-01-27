/*
Hello
This is a java file
Its on github now
Isnt that cool
*/
import java.util.Scanner;
class Github {
   public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      System.out.print("Wow! github!");
      System.out.println("Do you like github (Y/N)");
      String response = kb.next();
      if (response.equalsIgnoreCase("y")) {
         System.out.print("Great! me too!");
      } else {
         System.out.print("Oh... Thats a shame.");
      }
   }
}
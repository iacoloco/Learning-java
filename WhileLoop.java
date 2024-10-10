import java.util.Scanner;
public class WhileLoop {

    public static void main(String[] argas) {

      Scanner input = new Scanner(System.in);
      boolean repeat = true;

      while(repeat){
        System.out.println("Would you like to remove the loop?");
        String userInput = input.next();
        if (userInput.equals("yes")) {
            repeat = false;
        } 
      }
      System.out.println("Playing the next song");
    }
}

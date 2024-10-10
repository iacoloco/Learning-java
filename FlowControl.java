import java.util.Scanner;
public class FlowControl {

    public static void main(String[] args) {

       System.out.println("Piack a number");
       Scanner scanner = new Scanner(System.in);

       int inputtedNum = scanner.nextInt();

       if (inputtedNum > 5 ) {
        System.out.println("Enjoy the good luck a friend bringsd you");
       }
       else{System.out.println("Your shue selection will make you very happy today");}




    }
    
}

import java.util.Scanner;

    public class Main {

        public static void main (String[] args) {

            System.out.println("pick a number between 1 and 10");
            java.util.Scanner scanner = new Scanner(System.in);

            int inputtedNum = scanner.nextInt();

            if (inputtedNum < 5) {
                System.out.println("Enjoy good luck a friend ");
            }
            else {System.out.println("Your Shoe selection will make you very happy today" ); } 
            
        }
        

    }


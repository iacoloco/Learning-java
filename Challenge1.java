// Leap Year Checker

import java.util.Scanner;

public class Challenge1 {

    // Define the isLeapyear method outside of main
 static boolean isLeapyear(int year) {
   
    return (year % 4 == 0 && year % 100 != 0 )|| (year % 400 == 0);
}
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the year the would you like to check if is Leap Year!");
        int year = scanner.nextInt();

        if (isLeapyear(year)){
            System.out.println("Yes it is!");
        }
        else{System.out.println("Nope!");}
        
        scanner.close();



    }
}

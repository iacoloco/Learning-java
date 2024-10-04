// HelloWorld.java


import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args){


      int studentAge = 15 ;
      double studentGpa = 75.5 ;
      char studentFirstInitial = 'H';
      char studentLastInitial = 'K';
      boolean hasperfectAttendance = true;
      String studentFirstName = "Kayla" ; 
      String studentLastName = "Hammon" ;
      
      System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGpa);

      System.out.println("What do you want to up date to?");

      Scanner input = new Scanner(System.in);
      studentGpa = input.nextDouble();

      System.out.println(studentFirstName + " " + studentLastInitial + "has " + studentGpa);


    }
}

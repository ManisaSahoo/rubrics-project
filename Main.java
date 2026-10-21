package net.javaguides.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

// System.out.println("Hello, World!");
  
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter your name: ");
       // String name = scanner.nextLine();
        //System.out.println("Hello, " + name + "!");
       // scanner.close();
    


        //System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();
        System.out.println("\nMultiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
          //loop from 1 to 10 and print the multiplication table
            System.out.println(number + " * " + i + " = " + (number * i));
      
        scanner.close();
    }

  }

}


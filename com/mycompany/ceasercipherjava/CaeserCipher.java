package com.mycompany.ceasercipherjava;

import java.util.Scanner; //import scanner

public class CaeserCipher{

   public static void main(String[] args){
   
      //create a scanner object 
      Scanner scan = new Scanner(System.in);
   
      //prompt user to enter a message they want to encrypt
      System.out.print("Enter a message to encrypt: ");
      String message = scan.nextLine();
      
      //prompt user for shift value for the message
      System.out.print("Enter the shift value for the message: ");
      int shift = scan.nextInt();
   }
}
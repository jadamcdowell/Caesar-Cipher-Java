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
      
      //encrypt the message using the specified shift value
      String encryptedMessage = encrypt(message, shift);
      
      //output the encrypted message
      System.out.println("Encrypted messge: "+ encryptedMessage);
   }
   
   public static String encrypt(String message, int shift){
   
      //create a StringBuilder object
      StringBuilder encryptedMessage = new StringBuilder();
      
      //make sure message is in lower case
      message = message.toLowerCase();
      
      //iterate over each character in the message
      for(int i = 0; i < message.length(); i++){
         char c = message.charAt(i);
         
         //check if the character is a letter
         if(Character.isLetter(c)){
            c = (char) ((c - 'a' + shift + 26) % 26 + 'a');
         }
         
         //append the encrypted character to the StringBuilder
         encryptedMessage.append(c);
      }
      //convert the StringBuilder to a stringa and return the encrypted message
      return encryptedMessage.toString();
   }
}
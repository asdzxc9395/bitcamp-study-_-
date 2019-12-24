package com.eomcs.lms;

import java.util.Scanner;
public class ds
{
   public static void main(String[] args)
   {
      //Input from user
      String password;
      Scanner input = new Scanner(System.in);
      System.out.print("Please create your password: ");
      password = input.nextLine();

      //Checking password length
      while( (password.length() < 6) || (password.length() > 10) )
      {
         System.out.print("This password must be between 6 and 10 characters. Try again: ");
         password = input.nextLine();
      }

      //Checking to see if passwords contain digit/letter
      /*Need to add code here */

      //Confirming if passwords match   
      String password2;   
      System.out.print("\nPlease type your password again to confirm: ");
      password2 = input.nextLine();

      while( !password2.equals(password) )
      {
         System.out.print("Those passwords do not match. Try again: ");
         password2 = input.nextLine();
      }

   }
} 
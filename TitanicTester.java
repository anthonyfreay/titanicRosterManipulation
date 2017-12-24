
package project.pkg11;

/*
@author AnthonyBFreay
Dr. Mary-Angela Papalaskari
CSC 1051 - 002
5 December 2016
Project 11 - Titanic
*/

import java.util.*;
import java.io.*;

public class TitanicTester
{
   public static void main(String[] args)
   {
      PassengerCollection titanic = new PassengerCollection();
   
      titanic.addPassenger (1, true, "name1", "female", 19, "info-1");
      titanic.addPassenger (2, false, "name2", "male", 42, "info-2");
      titanic.addPassenger (3, true, "name3", "female", 3.5, "info-3");
      titanic.addPassenger (1, false, "name4", "female", 33, "info-4");
      titanic.addPassenger (2, false, "name5", "male", 58, "info-5");
      titanic.addPassenger (1, true, "Allison, Master. Hudson Trevor", "male", 0.92, 
         "1\t 2\t113781\t151.55\tC22\tC26\tS\t11\"Montreal, PQ / Chesterville, ON\"");
   
      System.out.println("First round of adding passengers: " + titanic);
   
      // Using alternative constructor and addPassenger with String parameter
      titanic.addPassenger(new Passenger("1\t1\t\"name-in-string-1\"\tfemale\t10\t\"More-info-1\"")); 
      titanic.addPassenger(new Passenger("2\t0\t\"name-in-string-2\"\tfemale\t22.5\t\"More-info-2\"")); 
      titanic.addPassenger(new Passenger("3\t0\t\"name-in-string-3\"\tmale\t55\t\"More-info-3\"")); 
      titanic.addPassenger(new Passenger("3\t1\t\"Albimona, Mr. Nassef Cassem\"\tmale\t26\t0\t0\t2699\t18.7875\tC\t15\t\"Syria Fredericksburg, VA\""));
      System.out.println("Second round of adding passengers: " + titanic);  

      // shuffle
      titanic.shuffle();
      System.out.println("\n\nAfter 1st shuffle: " + titanic);
      titanic.shuffle();
      System.out.println("\n\nAfter 2nd shuffle: " + titanic);
      
      // filter by String
      System.out.println("\n\nFiltered by \"info-\"");      
      PassengerCollection c1 = titanic.filter("info-");
      System.out.println(c1);
      System.out.println("\n\nFiltered by \"Montreal\"");      
      PassengerCollection c2 = titanic.filter("Montreal");
      System.out.println(c2);      
     
      // filter survivors
      PassengerCollection c3 = titanic.filterSurvivors();
      System.out.println("\n\nSurvivors:");
      System.out.println(c3);    
   }
}

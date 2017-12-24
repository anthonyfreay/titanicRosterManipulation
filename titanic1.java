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

public class titanic1{
    public static void main(String[] args) throws IOException{
        Scanner fileScan;
        String line;
        
        File myFile = new File("C:/Users/User/Google Drive/VU Freshman 2016-2017/Algorithms/Lab(Sem 1)/Netbeans/Project 11/src/project/pkg11/titanic.txt");
        fileScan = new Scanner(myFile);
    
        PassengerCollection titanic = new PassengerCollection();
        line = fileScan.nextLine();
        
        while(fileScan.hasNext()){
            line = fileScan.nextLine();
            titanic.addPassenger(new Passenger(line));
            
            if(titanic.count == titanic.collection.length-1){
                titanic.increaseSize();
            }
        }
        System.out.println("**********Original Roster**********");
        System.out.println(titanic.toString());
        
        System.out.println("**********Shuffle 1**********");
        titanic.shuffle();        
        System.out.println(titanic.toString());
        
        System.out.println("**********Filter \"love\"**********");
        PassengerCollection love = titanic.filter("love");
        System.out.println(love.toString());
 
        System.out.println("**********Filter \"NJ\"**********");
        PassengerCollection NJ = titanic.filter("NJ");
        System.out.println(NJ.toString());

        System.out.println("**********Survived**********");
        PassengerCollection survived = titanic.filterSurvivors();
        System.out.println(survived.toString());
        
    }
}


package project.pkg11;

/*
@author AnthonyBFreay
Dr. Mary-Angela Papalaskari
CSC 1051 - 002
5 December 2016
Project 11 - Titanic
*/

import java.io.*;
import java.util.*;

public class PassengerCollection {
    //Attributes
    public Passenger[] collection;
    public int count;
    
    //Constructors
    public PassengerCollection(){
        collection = new Passenger[1000];
        count = 0;
    }
    
    //Methods
    public String toString(){
        String out = "";
        for(int i = 0; i<collection.length; i++){
            if(collection[i]!=null)
                out+=collection[i].toString();
        }
        return out;
    }
    public void addPassenger(int c, boolean s, String n, String sx, double a, String i){
        if(count == collection.length){
            increaseSize();
        }
        
        collection[++count] = new Passenger(c, s, n, sx, a, i);
    }
    public void addPassenger(String all){
        collection[++count] = new Passenger(all);
    }
    public void addPassenger(Passenger a){
        if(count == collection.length){
            increaseSize();
        }
        collection[++count] = a;
    }
    public void increaseSize(){
        Passenger[] temp = new Passenger[collection.length*100];
        
        for(int p = 0; p<collection.length; p++){
            temp[p] = collection[p];
        }
        collection = temp;
    }
    public void shuffle(){
        for(int shuf = 0; shuf<collection.length; shuf++){
            int a = (int)(Math.random()*(collection.length-1));
            int b = (int)(Math.random()*(collection.length-1));
            
            Passenger temp = collection[a];
            collection[a] = collection[b];
            collection[b] = temp;
        }
    }
    
    public PassengerCollection filter(String s){
        PassengerCollection a = new PassengerCollection();
        
        for(int i = 0; i<collection.length; i++){
            if(collection[i] != null){
                String info = collection[i].getInfo();
                String nam = collection[i].getName();

                if(info.contains(s) || nam.contains(s)){
                    a.addPassenger(collection[i].getPClass(),
                            collection[i].getSurvived(),collection[i].getName(),
                            collection[i].getSex(), collection[i].getAge(),
                            collection[i].getInfo());
                }
            }
        }
        return a;
    }
    
    public PassengerCollection filterSurvivors(){
        PassengerCollection b = new PassengerCollection();
        
        for(int i = 0; i<collection.length; i++){
            if(collection[i] != null){
                boolean sur = collection[i].getSurvived();

                if(sur){
                    b.addPassenger(collection[i].getPClass(),
                            collection[i].getSurvived(),collection[i].getName(),
                            collection[i].getSex(), collection[i].getAge(),
                            collection[i].getInfo());
                }
            }
        }
        return b;
    }
    
}

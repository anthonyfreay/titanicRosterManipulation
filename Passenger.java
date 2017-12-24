
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

public class Passenger {
    //Attributes
    public int pclass;
    public boolean survived;
    public String name;
    public String sex;
    public double age;
    public String info;
    
    //Constructors
    public Passenger(int cl, boolean sur, String nam, String sx, double a, String i){
        
        pclass = cl;
        survived = sur;
        name = nam;
        sex = sx;
        age = a;
        info = i;
    }
    public Passenger(String all){

        Scanner scanLine = new Scanner(all);
        pclass = scanLine.nextInt();
            scanLine.useDelimiter("\t");
        if(scanLine.nextInt() == 1){
            survived = true;
        }else{
            survived = false;
        }
        name = scanLine.next();
        sex = scanLine.next();
        if(scanLine.hasNextDouble()){
            age = scanLine.nextDouble();
        }else{
            age = -1;
        }
            info = scanLine.nextLine();
    }
    
    //Methods
    public int getPClass(){
        return pclass;
    }
    public void setPClass(int pc){
        pclass = pc;
    }
    public boolean getSurvived(){
        return survived;
    }
    public void setSurvived(boolean s){
        survived = s;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String s){
        sex = s;
    }
    public double getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getInfo(){
        return info;
    }
    public void setInfo(String i){
        info = i;
    }
    public String toString(){
        String out = "\n";
        
        if(survived){
            out+="***Survived***\t";
        }else{
            out+="***Deceased***\t";
        }
        
        out+="Class: "+pclass+"\t";
        
        out+="Age: "+age+"\t";
        
        out+="Sex: "+sex+"\t";
        
        out+="Name: "+name+"\t";
        
        out+="Additional Info: "+info;
        
        return out;
    }
}

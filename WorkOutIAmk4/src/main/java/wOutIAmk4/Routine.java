/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wOutIAmk4;

/**
 *
 * @author mesaj
 */
public class Routine {
    //old
    private String routineName;
    private int numExercises;
    private String[] rNames;


    public Routine(String[] r, int exNums, String routName ){
        numExercises = exNums;
        routineName = routName;
        rNames = r;
        /*new name old name
        old name new name
         */
    }
    
    public String getrName(){
        return routineName;
    }
    
    public String getexeList(){
       String listasString = "Exercises in " + routineName + " : ";
        for (int i = 0; i < rNames.length; i++) {
           listasString = (listasString + (i + 1)+ ") " + rNames[i] + "  ");
            
        }
        
        
        listasString = (listasString + " ,Good Luck with youtr clients, Trainers!");
        
        return listasString;
    }
    
    public String geteListForEdit(){
         String listasString = "Exercises in " + routineName + " : ";
        for (int i = 0; i < rNames.length; i++) {
           listasString = (listasString + (i + 1)+ ") " + rNames[i] + "  ");
           
        }
        
        return listasString;
    }
    
    public int getnumExercises(){
        return numExercises;
    }
}

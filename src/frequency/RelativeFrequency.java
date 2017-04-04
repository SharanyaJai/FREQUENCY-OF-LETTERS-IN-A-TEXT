/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Invokes the Object of Frequency class to calculate Relative Frequency of passed file
 * @author sharanya
 */
public class RelativeFrequency {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        
        try{
            Frequency obj= new Frequency(); //Intialises new Frequency class Object
        obj.readFile(); //Invokes method to read file
        obj.callculateRelativeFrequency(); //Invokes method to calculate relative frequency
        obj.displayRelativeFrequency(); // Invokes method to display the calculated relative frequency
        }
        catch(FileNotFoundException e)
        {
            System.out.println("please enter a valid file name in the source code package");
        }
}
}

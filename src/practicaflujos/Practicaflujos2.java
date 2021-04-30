/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaflujos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Eloy Malaver_Web
 */
public class Practicaflujos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
  
        File f = new File("C:\\Users\\Eloy Malaver_Web\\Desktop\\hola.txt");
        
        Scanner s = null;
    
    
    try{
        
        System.out.println("... leemos el contenido del fichero ...");
        s = new Scanner(f);
        
        while (s.hasNextLine()){
            
            String linea = s.nextLine();
            System.out.println(linea);
        }
        
    } catch(Exception ex){
        
        System.out.println("mensaje " + ex.getMessage());
    }
    
    }
    
}

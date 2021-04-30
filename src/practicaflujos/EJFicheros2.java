/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaflujos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Eloy Malaver_Web
 */
public class EJFicheros2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
    
    
    String ficheroA = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\FicheroA.txt");
    String op;
    
    
        try {
            
            BufferedReader fc = new BufferedReader (new FileReader (ficheroA));
            op = fc.readLine();
            op= op.replaceAll(" ", "");
            System.out.println(op);
            
        }catch (FileNotFoundException er){
            
            System.out.println("fichero no encontrado");
        
        }catch(IOException er){
            
            System.out.println("Error");
        }
           
    }

    }
    


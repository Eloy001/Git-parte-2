/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaflujos;

/**
 *
 * @author Eloy Malaver_Web
 */
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Practicaflujos {

    /**
     * @param args the command line arguments
     */
 
         
    public static void main(String[] args) {
        // TODO code application logic here
       
        File f =new File ("C:\\Users\\Eloy Malaver_Web\\Desktop\\hola.txt");
        
        leer_fichero();
    
   
    }
   
    public static void leer_fichero()  {

    int caracter;
    char letra;
  
    try{
        
       FileReader entrada= new FileReader("C:\\Users\\Eloy Malaver_Web\\Desktop\\hola.txt"); 
       do{
           caracter=entrada.read(); 
           letra=(char) caracter;
           System.out.print(letra);
      
       
       }while(caracter != -1);
           System.out.println(caracter);
                  
    
    }catch (FileNotFoundException ex){
        
        System.out.println("¡Fichero no encontrado! ");
    }
    catch (IOException ex){
        
        System.out.println("¡No se puede leer el fichero! ");
    }
    
    } //fin del metodo leer fichero
    
public static void escribir_fichero(File f){
    
    Random r =new Random();
    double d = 18.76353;
    
   // try{
        
    //    FileOutputStream fis = new FileOutputStream (f);
      //  DataInputStream dis = new DataInputStream (fis);
        
    }
    
    
    
}
    
    
    
   

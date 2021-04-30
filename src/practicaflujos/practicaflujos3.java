/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaflujos;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Eloy Malaver_Web
 */
public class practicaflujos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      File f =new File ("C:\\Users\\Eloy Malaver_Web\\Desktop\\hola.txt");
        escribir_fichero(f);
        leer_fichero(f);
    
   
    }
   
    public static void leer_fichero(File f)  {
       
    int caracter=0;
    char letra;
    String ruta = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\hola.txt");
 
    try{
        
       FileInputStream sal = new FileInputStream (ruta);
   //    FileWriter fichero= new FileWriter("C:\\Users\\Eloy Malaver_Web\\Desktop\\hola.txt"); 
        DataInputStream dat = new DataInputStream (sal);
   
       do{
           caracter= ruta.hashCode(); 
           letra=(char) caracter;
           System.out.print(letra);
      
       
       }while(caracter != -1);
           System.out.println(caracter);
                  
    
    }catch (FileNotFoundException ex){
        
        System.out.println("¡Fichero no encontrado! ");
    }
    catch (java.io.IOException ex){
        
        System.out.println("¡No se puede leer el fichero! ");
    }
    
    } //fin del metodo leer fichero
    
public static void escribir_fichero(File f){
    
    String ruta = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\hola.txt");
    
   for (int i=0; i>=10 ;i++){
    
    try{
        
        FileOutputStream entrada = new FileOutputStream (ruta);
        entrada.write(i);
        
    
    
    }catch (FileNotFoundException er){
        
        System.out.println("error");
    }
    catch (java.io.IOException err){
        
        System.out.println("error");
          }

        
        }
    
        
    }
    
}


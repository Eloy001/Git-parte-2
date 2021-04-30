/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaflujos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Eloy Malaver_Web
 */
public class EJFicheros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
 
      Scanner teclado = new Scanner (System.in);
      int valor1 = 0; 
      int valor2 =0;
    //  String ficheroA = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\FicheroA.txt");  
    //  String ficheroB = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\FicheroB.txt");  
   //   String ficheroU1 = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\FICHEROUNION.txt");
    //  String ficheroU2 = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\FICHEROUNION2.txt");  ubicacion de los ficheros
    String ficheroA;
    String ficheroB;
    String ficheroU1;
    String ficheroU2;
    
      FileReader leerFicheroA;
      FileReader leerFicheroB;
      
      FileWriter escribirFicheroU1;
      FileWriter escribirFicheroU2;
      BufferedReader FA;
      BufferedReader FB;
      FileWriter FU2;
      
                    
          try{
          
        System.out.println("Indique la ruta del Primer Fichero: ");
        ficheroA = teclado.nextLine();
    
        System.out.println("Indique la ruta del Segundo Fichero: ");
        ficheroB = teclado.nextLine();
          
        System.out.println("Indique la ruta Del fichero union (se uniran los ficheros anteriores): ");
        ficheroU1 = teclado.nextLine();
        
         
        
        leerFicheroA = new FileReader (ficheroA);
        leerFicheroB = new FileReader (ficheroB);
          
          escribirFicheroU1 = new FileWriter (ficheroU1);
          
              System.out.println("Creando fichero union: ");
              
          while (valor1 != -1){
              
              valor1 = leerFicheroA.read();
              System.out.print((char) valor1); 
              escribirFicheroU1.write(valor1);
          }
          
                    
          
          while (valor2 != -1){
              
              valor2 = leerFicheroB.read();
              System.out.print((char) valor2); 
              escribirFicheroU1.write(valor2);
          }
          
          escribirFicheroU1.write("\n\n");
         escribirFicheroU1.write("---------");
         escribirFicheroU1.flush();
         escribirFicheroU1.close();
         
      }catch(FileNotFoundException er){
          
          System.out.println("Fichero no encontrado");
          
      }catch(IOException er){
          
          System.out.println("Error");
      }
          
          System.out.println("\n\n");
          System.out.println("Fichero Union1 creado ");
          System.out.println("------------------------------");
        
          
          
          System.out.println("Creando fichero union 2... ");
            
    //fichero union2     
   try{
          
               
      FA = new BufferedReader (new FileReader("C:\\Users\\Eloy Malaver_Web\\Desktop\\FicheroA.txt"));
      FB = new BufferedReader (new FileReader("C:\\Users\\Eloy Malaver_Web\\Desktop\\FicheroB.txt"));
      
      FU2 = new  FileWriter ("C:\\Users\\Eloy Malaver_Web\\Desktop\\FICHEROUNION2.txt");
          System.out.println("Indique la ruta del Segundo Fichero union: ");
       
          ficheroU2 = teclado.nextLine(); 
          escribirFicheroU2 = new FileWriter (ficheroU2);
          String linea1;           
          String linea2;    
          
       
          while (FA.ready() || FB.ready()){
              
              linea1 = FA.readLine();
              linea2 = FB.readLine();
              
                 if (!(linea1 == null)){
              
            FU2.write(linea1);
            FU2.write("\n");
                 }
              
                 if (!(linea2 == null)){
              
             FU2.write(linea2);
              FU2.write("\n");
                 }
                  
               
          }
           
         FU2.flush();
         FU2.close();
         
      }catch(FileNotFoundException er){
          
          System.out.println("Fichero no encontrado");
          
      }catch(IOException er){
          
          System.out.println("Error");
      }
          
          System.out.println("\n");
          System.out.println("Fichero Union2 creado ");
          System.out.println("------------------------------"); 
          
          
        }
    }
      
      
      
      
    
    


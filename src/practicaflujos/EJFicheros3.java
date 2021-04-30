/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaflujos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Eloy Malaver_Web
 */
public class EJFicheros3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
    
    String ficheroN = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\ficheronumeros.txt");
    
   
    
    try{
        
    FileInputStream fis=new FileInputStream(ficheroN);
    FileOutputStream fos=new FileOutputStream(ficheroN);
 
    DataInputStream dis=new DataInputStream(fis);
    DataOutputStream dos=new DataOutputStream(fos);       
        
    
    dos.flush();
        System.out.println(dis.readInt());
    
    
    }catch(FileNotFoundException er){
        
        System.out.println("fichero no encontrado");
    
    }catch(IOException er){
        
        System.out.println("error");
    }
   }
    
    public static void numero() throws FileNotFoundException, IOException{
        
      String ficheroN = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\ficheronumeros.txt");
     
      FileOutputStream fos= new FileOutputStream(ficheroN);
      DataOutputStream dos= new DataOutputStream(fos);
      Scanner sc = new Scanner (System.in);  
      
      int total;
      int numero;
      int contador = 0;

     System.out.println("total de numeros aleatorios a realizar: ");
    total = sc.nextInt();
        
        
     while (contador <= total){
     
    numero=(int) (Math.random()*100);
    dos.writeInt(numero);
         System.out.println(numero);
         contador++;
         
  }
    
     dos.flush();
     dos.close();
     
    } 
    
    public static void leer_fichero() throws FileNotFoundException{
        
        
     String ficheroN = ("C:\\Users\\Eloy Malaver_Web\\Desktop\\ficheronumeros.txt");
     
     FileInputStream fis=new FileInputStream(ficheroN);
     DataInputStream dis=new DataInputStream(fis);
     
     
        
        
    } 
}

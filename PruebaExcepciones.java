/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebaexcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class PruebaExcepciones {
    // le digo a ese metodo que en algun momento ese metodo puede tener un error de tipo FileNotFoundException
    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("‪C:\\Users\\USER\\Documents\\Saludo.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        
        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }
    
    public void leerArchivo2(){
        try{
            leerArchivo();
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor verifique la ruta");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");   
        }
        
        System.out.println("Programa terminado");
        
    }

    public static void main(String[] args) throws IOException{
        PruebaExcepciones prueba = new PruebaExcepciones();
        
        prueba.leerArchivo2();
    }
}

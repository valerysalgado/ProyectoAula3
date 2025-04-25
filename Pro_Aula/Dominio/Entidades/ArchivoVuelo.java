/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Entidades;

import java.io.*;

/**
 *
 * @author valer
 */
public class ArchivoVuelo {
    public static void main (String[] args){
       
        try {
        
        FileWriter archivo = new FileWriter("C:\\Users\\valer\\OneDrive\\Escritorio\\PROYECTOAULA3S\\ProyectoAula3\\Pro_Aula\\Dominio\\Vuelo.txt");
        
        archivo.write("Vuelo 1");
        archivo.close();
        
        FileReader archivoLectura = new FileReader("C:\\Users\\valer\\OneDrive\\Escritorio\\PROYECTOAULA3S\\ProyectoAula3\\Pro_Aula\\Dominio\\Vuelo.txt");
        BufferedReader lectura = new BufferedReader(archivoLectura);
        
        String linea = lectura.readLine();
        
        while(linea!=null){
            
            System.out.print(linea);
            linea = lectura.readLine();
        }
            
            
        
       
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



package com.mycompany.tarea2datos;


import java.io.*;


public class Tarea2datos {
    

    public void frameworks(String Registro){
    File f;
    FileWriter w;
    BufferedReader bw 
    PrintWriter wr;
        try {
    f=new File(Registro);
    w=new FileWriter(f);
    bw=new BufferedReader(w);
    wr=new PrintWriter(bw);
    
    wr.write(inicio);
    wr.append("\n Registro");
    wr.append("\n Final");
    
    wr.close();
    bw.close();
    
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"error"+e);
            
        }
    
        
    }
    
    
   
}

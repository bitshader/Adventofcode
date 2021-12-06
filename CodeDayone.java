package Adventofcode;

import java.io.*;
import java.util.Scanner;
public class CodeDayone{
    public static void main (String[] args){
        try{
        File file = new File("input.txt");
        Scanner in = new Scanner(file);
        int[] dati = new int[2000];
        int j = 0;
        while(in.hasNextLine()){
           
            String dato = in.nextLine();
            dati[j] = Integer.parseInt(dato);
            j++;
            
        }
        /*for(int i=0;i<dati.length;i++){
            System.out.println(dati[i]);
        }*/
        in.close();
        /*int contatore=0;
        
        for(int i=0; i<dati.length-1;i++){
            if(dati[i+1]>dati[i]){
                contatore++;
        }}
        System.out.println(contatore);*/
        int contatore = 0;
        for(int i=0; i<dati.length-3;i++){
            if((dati[i+1]+dati[i+2]+dati[i+3])>(dati[i]+dati[i+1]+dati[i+2])){
                contatore++;
            }
        }
        
        System.out.println(contatore);
    }
    catch(FileNotFoundException e){
        System.out.println("ERROR");

    }

    
}}
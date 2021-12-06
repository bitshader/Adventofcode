package Adventofcode;

import java.io.*;
import java.util.Scanner;
public class CodeDayTree {
   public static void main(String[] args){
            try{
            File file = new File("input2.txt");
            Scanner in = new Scanner(file);
            String[] dati = new String[1000];
            int j = 0;
            while(in.hasNextLine()){
               
                String dato = in.nextLine();
                dati[j] = dato;
                j++;
                
            }
            
            in.close();
            String G = "";
            int p = 0;
            for(int c=0; c<12;c++){
                int contuno = 0;
                int contzero = 0;
                for(int r=0; r<1000; r++){
                    char carattere = dati[r].charAt(p);
                    if(carattere == '1'){
                    }else{
                        contzero++;
                    }
                    
                }
                p++;
            
                if(contuno > contzero){
                    G = G + "1";
                }
                else{
                    G = G + "0";
                }
            
        }
        System.out.println(G);
    }
        catch(FileNotFoundException e){
            System.out.println("ERROR");
    
        }
    
        
    }
   
} 
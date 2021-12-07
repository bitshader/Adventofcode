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
            String ossigeno = "";
            for(int c=0; c<12;c++){
                int contuno = 0;
                int contzero = 0;
                int contanumero = 0;
                for(int r=0; r<1000; r++){
                    char carattere = dati[r].charAt(c);
                    if(carattere == '1'){
                        contuno++;
                        contanumero++;
                    }else if (carattere == '0'){
                        contzero++;
                        contanumero++;
                    }
                    
                }
                
                if(contuno >= contzero){
                    //tutti quelli con lo 0 devono essere cancellati
                    for(int r=0; r<1000; r++){
                        char carattere = dati[r].charAt(c);
                        if(carattere == '0'){
                            dati[r].replace('0', '5');
                            dati[r].replace('1', '5');
                        } 
                    }
                }
                else{
                    //tutti quelli con l'1 devono essere cancellati
                    for(int r=0; r<1000; r++){
                        char carattere = dati[r].charAt(c);
                        if(carattere == '1'){
                            dati[r].replace('0', '5');
                            dati[r].replace('1', '5');
                        }
            
                     }
                }

                if(contanumero == 1){
                    ossigeno = "trovato";
                }
            }
            for(int c=0; c<12;c++){
                for(int r=0; r<1000; r++){
                  System.out.println(dati[r]);  
                }}
            System.out.println(ossigeno);
        }
        
        catch(FileNotFoundException e){
            System.out.println("ERROR");
    
        }
    
        
    }
   
} 
package Adventofcode;

import java.io.*;
import java.util.Scanner;
public class CodeDayTwo {
   public static void main(String[] args){
            try{
            File file = new File("input1.txt");
            Scanner in = new Scanner(file);
            String[] dati = new String[1000];
            int j = 0;
            while(in.hasNextLine()){
               
                String dato = in.nextLine();
                dati[j] = dato;
                j++;
                
            }

            in.close();

            int scelta=0;
            int spostamento = 0;
            int profondita = 0;
            int risultato = 0;
            int aim = 0;
            for(int i=0; i<dati.length;i++){
                char carattere = dati[i].charAt(0);
                if(carattere == 'f'){
                    scelta = 1;
                }
                else if(carattere == 'd'){
                    scelta = 2;
                }else if(carattere == 'u'){
                    scelta = 3;
                }
                if(scelta == 1){
                    String numberOnly = dati[i].replaceAll("[^0-9]", "");
                    int number = Integer.parseInt(numberOnly);
                    spostamento = spostamento + number;
                    profondita = profondita + (aim * number);
                   
                    
                }else if(scelta == 2){
                    String numberOnly = dati[i].replaceAll("[^0-9]", "");
                    int number = Integer.parseInt(numberOnly);
                    aim = aim + number;
                }else if(scelta == 3){
                    String numberOnly = dati[i].replaceAll("[^0-9]", "");
                    int number = Integer.parseInt(numberOnly);
                    aim = aim - number;
                }

            }
            risultato = spostamento * profondita;
            System.out.println(risultato);
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR");
    
        }
    
        
    }
   
}

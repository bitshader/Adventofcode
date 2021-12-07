package Adventofcode;

import java.io.*;
import java.util.Scanner;
public class CodeDay4 {
    public static void main(String[] args){
        
        try{
        File file = new File("input4.txt");
        Scanner in = new Scanner(file);
        int dato =0;
        int[][] matrici = new int[6][5];
        
        while(in.hasNextLine()){
            for(int matrice = 0;matrice<100;matrice++){
                for(int righe=0; righe<6;righe++){
                    for(int colonne=0;colonne<5;colonne++){
                        dato = in.nextInt();
                        matrici[righe][colonne] = dato;
                    }
                }
            }
            
        }
        for(int matrice = 0;matrice<100;matrice++){
            for(int righe=0; righe<6;righe++){
                for(int colonne=0;colonne<5;colonne++){
                 System.out.println(matrici[righe][colonne]);
                }
            }
        }
        in.close();
       
    }
    
    catch(FileNotFoundException e){
        System.out.println("ERROR");

    }

    
}

} 


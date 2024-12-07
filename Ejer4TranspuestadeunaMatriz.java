/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer4transpuestadeunamatriz;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer4TranspuestadeunaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("ingrese la dimension de la matriz: ");
        System.out.println("dimension 1: ");int d1 = teclado.nextInt(); 
        System.out.println("dimension 2: ");int d2 = teclado.nextInt(); 
        int matriz [][] = new int [d1][d2];
        
        System.out.println("INGRESE LOS ELEMENTOS: ");
        
        for (int i=0;i<d1;i++){
            for (int j=0;j<d2;j++){
                matriz[i][j]=teclado.nextInt(); 
            }
        }
        
        //mostrar matriz 
        for (int i=0;i<d1;i++){
            for (int j=0;j<d2;j++){
                System.out.print("["+ matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        //TRANSPUESTA:
        
        System.out.println("TRANSPUESTA DE LA MATRIZ");
        
        for (int j=0;j<d2;j++){
            for (int i=0;i<d1;i++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        
        
    }
    
}

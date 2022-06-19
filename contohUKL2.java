/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.progdas;

/**
 *
 * @author asus
 */
public class contohUKL2 {
   public static void main(String[] args){
       int awal = 16;
       int beda = 9;
       int u = awal;
       int s = awal;
       System.out.println("Deret Aritmatikanya adalah ");
       for(int i = 0; i <= 4; i++){
           for(int j = 0; j <= 3; j++){
               System.out.print(u + "\t");
               u += beda;
               s += u;
           }
           System.out.println();
       }
       s -= u;
       System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
   }
}

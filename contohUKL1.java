/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.progdas;

/**
 *
 * @author asus
 */
public class contohUKL1 {
    public static void main(String[] args){
        int awal = 16;
        int beda = 9;
        int akhir = 12;
        int u = awal;
        int s = awal;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i = 0; i <= akhir; i++){
            if(i >= 2){
                 System.out.println("Deret ke-" + i);
                 System.out.println(" = " + u);
                  u += beda;
                  s += u;
            }
        }
        s -= u;
        System.out.println("Jumlah deret aritmatikanya adalah " + s);
    }
}
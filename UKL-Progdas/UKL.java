/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.progdas;

/**
 *
 * @author asus
 */
public class UKL {
    public static void main(String[] args) {
        //Jika diket matriks a 2 baris 1 kolom * matriks b 1 baris 2 kolom
        int a[][] = {
            {5},
            {3}
        };
        
        int b[][] = {{8, 3}};
        int h[][] = new int[2][2];
        System.out.println("Hasil A x B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 1; k++) {
                    h[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                 System.out.print(h[i][j] + "\t");
            }
            System.out.println();    
        }
    }
}

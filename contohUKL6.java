/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.progdas;

/**
 *
 * @author asus
 */
public class contohUKL6 {
    public static void main(String[] args){
        int a[][] = {
            {5, 3, 8, -9},
            {1, 6, -3, 7},
            {8, -7, 3, 6}
        };
        
        int b[][] = {
            {9, 8, 7},
            {1, 2, 4},
            {5, 6, 7},
            {2, 3, 5}
        };
        
        int h[][] = new int[3][3];
        System.out.println("Hasil A x B");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 4; k++){
                 h[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for(int i = 0;  i < 3; i++){
            for(int j = 0; j < 3; j++){
             System.out.print(h[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
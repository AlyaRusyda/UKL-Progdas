/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.progdas;

/**
 *
 * @author asus
 */
public class contohUKL5 {
    public static void main(String[] args){
        int a[][] = {
            {5, 3, 8, -9, 2, 4},
            {1, 6, -3, 7, 9, 2},
            {8, -7, 3, 6, 2, 4},
            {9, -5, -1, 8, 7, 6},
            {5, -7, 3, 4, 7, 8}
        };
        
        int b[][] = {
            {9, 8, 7, 6, 5, 9},
            {1, 2, 4, 6, -3, 5},
            {5, 6, 7, 8, 9, 4},
            {2, 3, 5, 7, 8, -4},
            {-1, -2, -5, -7, -3, 9}
        };
        
        System.out.println("Hasil A + B");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(a[i][j] + b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

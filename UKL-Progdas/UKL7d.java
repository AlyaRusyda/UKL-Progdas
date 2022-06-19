/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.progdas;

import java.util.Scanner;
/**
 *
 * @author asus
 */
public class UKL7d {
    public static void seleksi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Cottage yang dipilih: ");
        String cottage = scan.next();
        if (cottage.equalsIgnoreCase("duku")) {
            System.out.println("Masukkan Hari yang dipilih (weekday/weekend/holiday):");
            String jenisHari = scan.next();
            System.out.println("Jumlah Hari: ");
            int jumlahHari = scan.nextInt();
            int total;
            if (jenisHari.equalsIgnoreCase("weekday")) {
                total = jumlahHari * 915000;
                System.out.println("Total yang harus dibayarkan:" + total);
            } else if (jenisHari.equalsIgnoreCase("weekend")) {
                total = jumlahHari * 1025000;
                System.out.println("Total yang harus dibayarkan:" + total);

            } else if (jenisHari.equalsIgnoreCase("holiday")) {
                total = jumlahHari * 1225000;
                System.out.println("Total yang harus dibayarkan:" + total);
            }
        } else if (cottage.equalsIgnoreCase("jeruk")) {
            System.out.println("Masukkan Hari yang dipilih (weekday/weekend/holiday):");
            String jenisHari = scan.next();
            System.out.println("Jumlah Hari: ");
            int jumlahHari = scan.nextInt();
            int total;
            if (jenisHari.equalsIgnoreCase("weekday")) {
                total = jumlahHari * 915000;
                System.out.println("Total yang harus dibayarkan:" + total);
            } else if (jenisHari.equalsIgnoreCase("weekend")) {
                total = jumlahHari * 1025000;
                System.out.println("Total yang harus dibayarkan:" + total);

            } else if (jenisHari.equalsIgnoreCase("holiday")) {
                total = jumlahHari * 1225000;
                System.out.println("Total yang harus dibayarkan:" + total);
            }
        } else if (cottage.equalsIgnoreCase("alpukat")) {
            System.out.println("Masukkan Hari yang dipilih (weekday/weekend/holiday):");
            String jenisHari = scan.next();
            System.out.println("Jumlah Hari: ");
            int jumlahHari = scan.nextInt();
            int total;
            if (jenisHari.equalsIgnoreCase("weekday")) {
                total = jumlahHari * 575000;
                System.out.println("Total yang harus dibayarkan:" + total);
            } else if (jenisHari.equalsIgnoreCase("weekend")) {
                total = jumlahHari * 695000;
                System.out.println("Total yang harus dibayarkan:" + total);

            } else if (jenisHari.equalsIgnoreCase("holiday")) {
                total = jumlahHari * 895000;
                System.out.println("Total yang harus dibayarkan:" + total);
            }
        } else if (cottage.equalsIgnoreCase("jambuair")) {
            System.out.println("Masukkan Hari yang dipilih (weekday/weekend/holiday):");
            String jenisHari = scan.next();
            System.out.println("Jumlah Hari: ");
            int jumlahHari = scan.nextInt();
            int total;
            if (jenisHari.equalsIgnoreCase("weekday")) {
                total = jumlahHari * 575000;
                System.out.println("Total yang harus dibayarkan:" + total);
            } else if (jenisHari.equalsIgnoreCase("weekend")) {
                total = jumlahHari * 695000;
                System.out.println("Total yang harus dibayarkan:" + total);
            } else if (jenisHari.equalsIgnoreCase("holiday")) {
                total = jumlahHari * 895000;
                System.out.println("Total yang harus dibayarkan:" + total);
            }

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int id[]={1,2,3,4,5};
        String namaPelanggan[] = {"Ali", "Budi", "Dani", "Edi", "Umar"};
        System.out.println("Masukkan Id Pelanggan");
        int id = scan.nextInt();
        System.out.println("Nama Pelanggan " + namaPelanggan[id-1]);
        seleksi();
    }
}


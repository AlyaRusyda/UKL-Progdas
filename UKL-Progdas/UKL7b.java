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
public class UKL7b {
  
  public static String kategoripendapatan(int pendapatan){
  if (pendapatan < 2000000){
      return "A";
    } else if (pendapatan >= 2000000 && pendapatan <= 10000000){
      return "B";
    } else {
      return "C";
    }
   }
  public static int tarif(String jalurmasuk, String kategori, int bulan, int hasil, int id, String data[][]){
  id = 0;
  jalurmasuk = data[id][2];
  int snmptn[][] = {
    {5000000, 500000},
    {15000000, 1000000},
    {30000000, 2000000}
  };

  int sbmptn[][] = {
    {7000000, 500000},
    {17000000, 1000000},
    {35000000, 2000000}
  };

  int mandiri[][] = {
    {10000000, 100000},
    {25000000, 2000000},
    {50000000, 3000000}
  };

  hasil = 0;

  if (jalurmasuk.equals("SNMPTN")){
    if (kategori.equals("A")){
      hasil = snmptn[0][0] + snmptn[0][1] * bulan;
    } else if (kategori.equals("B")){
      hasil = snmptn[1][0] + snmptn[1][1] * bulan;
    }  else {
      hasil = snmptn[2][0] + snmptn[2][1] * bulan;
      }
    } else if (jalurmasuk.equals("SBMPTN")){
      if (kategori.equals("A")){
        hasil = sbmptn[0][0] + sbmptn[0][1] * bulan;
    } else if (kategori.equals("B")){
      hasil = sbmptn[1][0] + sbmptn[1][1] * bulan;
    }  else {
      hasil = sbmptn[2][0] + sbmptn[2][1] * bulan;
      }
    } else {
      if (kategori.equals("A")){
        hasil = mandiri[0][0] + mandiri[0][1] * bulan;
      } else if (kategori.equals("B")){
        hasil = mandiri[1][0] + mandiri[1][1] * bulan;
      } else {
        hasil = mandiri[2][0] + mandiri[2][1] * bulan;
        }
      }
      return hasil;
  }

  public static void main(String[] args) {
    String data[][] = {
    {"", "", "", ""}, 
    {"1", "Mira", "SBMPTN", "Sawojajar"},
    {"2", "Nina", "SNMPTN", "Kedungkandang"},
    {"3", "Oemar", "Mandiri", "Ijen"},
    {"4", "Pena", "SBMPTN", "Dinoyo"}
    };

    Scanner scan = new Scanner(System.in);
    System.out.print("ID Mahasiswa : ");
    int id = scan.nextInt();
    System.out.print("Pendapatan Orang Tua : Rp ");
    int pendapatan = scan.nextInt();
    System.out.print("Jumlah bulan yang akan dibayarkan : ");
    int bulan = scan.nextInt();

    if (id < 1 || id > data.length){
      System.out.println("ID Mahasiswa tidak ada");
    }

    int hasil = 0;
    String kategori = kategoripendapatan(pendapatan);
    String jalurmasuk = data[id][2];
    int bayar = tarif(jalurmasuk, kategori, bulan, hasil, id, data);

    System.out.println("----------------------------------------------");
    System.out.println("ID Mahasiswa : " + data[id][0]);
    System.out.println("Nama Mahasiswa : " + data[id][1]);
    System.out.println("Jalur Masuk : " + data[id][2]);
    System.out.println("Kategori Pendapatan : " + kategori); 
    System.out.println("Jumlah Biaya yang dikeluarkan : Rp " + bayar);
    System.out.println("Alamat : " + data[id][3]);

    }
}
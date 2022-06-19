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
public class UKL7c {
      public static void main(String[] args) {
    
    System.out.println("Tarif Tol dengan ketentuan golongan kendaraan sebagai berikut : ");
     System.out.println("1. Sedan, Jip, Pickup");
     System.out.println("2. Truk dengan 2 sumbu roda");
     System.out.println("3. Truk dengan 3 sumbu roda");
     System.out.println("4. Bus");
     System.out.println("5. Lainnya");
     
     Scanner scan = new Scanner(System.in);
     System.out.println("Masukkan daerah asal : ");
     String asal = scan.next();
     System.out.print("Masukkan daerah tujuan : ");
     String tujuan = scan.next();
     
     int bayar = 0;
     int golongan = 0;
     if (asal.equalsIgnoreCase("Dupak") && tujuan.equalsIgnoreCase("Waru")) {
       System.out.print("Masukkan golongan kendaraan : ");
       golongan = scan.nextInt();
       if (golongan == 1) {
         bayar = 5000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 2) || (golongan == 3)){
         bayar = 8000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 4) || (golongan == 5)){
         bayar = 10500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else {
         System.out.println("Golongan kendaraan yang anda masukkan tidak ada");
       }
     } else if (asal.equalsIgnoreCase("Waru") && tujuan.equalsIgnoreCase("Sidoarjo")) {
       System.out.print("Masukkan golongan kendaraan : ");
       golongan = scan.nextInt();
       if (golongan == 1){
         bayar = 6000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 2) || (golongan == 3)){
         bayar = 9000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 4) || (golongan == 5)){
         bayar = 12000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else {
         System.out.println("Golongan kendaraan yang anda masukkan tidak ada");
       }
     } else if (asal.equalsIgnoreCase("Waru") && tujuan.equalsIgnoreCase("Porong")) {
       System.out.print("Masukkan golongan kendaraan : ");
       golongan = scan.nextInt();
       if (golongan == 1){
         bayar = 9000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 2) || (golongan == 3)){
         bayar = 14000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 4) || (golongan == 5)){
         bayar = 18500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else {
         System.out.println("Golongan kendaraan yang anda masukkan tidak ada");
       }
     } else if (asal.equalsIgnoreCase("Sidoarjo") && tujuan.equalsIgnoreCase("Waru")) {
       System.out.print("Masukkan golongan kendaraan : ");
       golongan = scan.nextInt();
       if (golongan == 1){
         bayar = 6000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 2) || (golongan == 3)){
         bayar = 9000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 4) || (golongan == 5)){
         bayar = 12000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else {
         System.out.println("Golongan kendaraan yang anda masukkan tidak ada");
       }
     } else if (asal.equalsIgnoreCase("Sidoarjo") && tujuan.equalsIgnoreCase("Porong")) {
       System.out.print("Masukkan golongan kendaraan : ");
       golongan = scan.nextInt();
       if (golongan == 1){
         bayar = 5500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 2) || (golongan == 3)){
         bayar = 8500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 4) || (golongan == 5)){
         bayar = 11500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else {
         System.out.println("Golongan kendaraan yang anda masukkan tidak ada");
       }
     } else if (asal.equalsIgnoreCase("Porong") && tujuan.equalsIgnoreCase("Sidoarjo")) {
       System.out.print("Masukkan golongan kendaraan : ");
       golongan = scan.nextInt();
       if (golongan == 1){
         bayar = 5500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 2) || (golongan == 3)){
         bayar = 8500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 4) || (golongan == 5)){
         bayar = 11500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else {
         System.out.println("Golongan kendaraan yang anda masukkan tidak ada");
       }
     } else if (asal.equalsIgnoreCase("Porong") && tujuan.equalsIgnoreCase("Waru")) {
       System.out.print("Masukkan golongan kendaraan : ");
       golongan = scan.nextInt();
       if (golongan == 1){
         bayar = 9000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 2) || (golongan == 3)){
         bayar = 14000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 4) || (golongan == 5)){
         bayar = 18500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else {
         System.out.println("Golongan kendaraan yang anda masukkan tidak ada");
       }
     } else if (asal.equalsIgnoreCase("Porong") && tujuan.equalsIgnoreCase("Kejapanan")) {
       System.out.print("Masukkan golongan kendaraan : ");
       golongan = scan.nextInt();
       if (golongan == 1){
         bayar = 6000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 2) || (golongan == 3)){
         bayar = 8500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 4) || (golongan == 5)){
         bayar = 11500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else {
         System.out.println("Golongan kendaraan yang anda masukkan tidak ada");
       }
     } else if (asal.equalsIgnoreCase("Kejapanan") && tujuan.equalsIgnoreCase("Gempol")) {
       System.out.print("Masukkan golongan kendaraan : ");
       golongan = scan.nextInt();
       if (golongan == 1){
         bayar = 3000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 2) || (golongan == 3)){
         bayar = 5000;
         System.out.println("Tarif tol adalah = " + bayar);
       } else if ((golongan == 4) || (golongan == 5)){
         bayar = 6500;
         System.out.println("Tarif tol adalah = " + bayar);
       } else {
         System.out.println("Golongan kendaraan yang anda masukkan tidak ada");
       }
     } else {
       System.out.println("Maaf, daerah yang anda masukkan tidak ada");
     }
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javafundamental.inputoutput;

import java.util.Scanner;

/**
 *
 * @author rudigigihprabowo
 */
public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan Sederhana");
        System.out.print("Masukan Angka Pertama : ");
        int value1 = scanner.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        int value2 = scanner.nextInt();
        int result = value1 + value2;
        System.out.println("Hasilnya Adalah = " + result);
    }
    
}

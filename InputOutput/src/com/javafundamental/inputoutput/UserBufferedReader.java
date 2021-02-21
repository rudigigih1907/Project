/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author rudigigihprabowo
 */
public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader streamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(streamreader);
        System.out.println("Program Penjumlahan Sederhana");
        int value1 = 0;
        int value2 = 0;
        try {
            System.out.print("Masukan Angka Pertama : " );
            value1 = Integer.parseInt(bufferedreader.readLine());
            System.out.print("Masukan Angka Kedua : ");
            value2 = Integer.parseInt(bufferedreader.readLine());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        int result = value1 + value2;
        System.out.println("Hasilnya Adalah : "+result);
        
        
    }
    
}

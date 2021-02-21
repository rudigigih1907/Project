/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabasic;

import Kendaraan.*;
import com.javabasic.musik.Gitar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author rudigigihprabowo
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello...World");
        
        Gitar.bunyi();
        
        Mobil.jumlahban();
        Motor.jumlahban();
        Kereta.jumlahban();
        
        Date today = new Date();
        System.out.println("Hari ini = "+ today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = "+ tomorrow);
    }
}

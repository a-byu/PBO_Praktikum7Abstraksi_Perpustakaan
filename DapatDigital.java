/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum7_absraksi;

/**
 *
 * @author wajdie
 */
public interface DapatDigital {
    //method abstrak
    void aksesEBook(String url);
    
    //default method
    default void infoDigital() {
        System.out.println("Anggota ini dapat mengakses e-book.");
    }
    
    //konstanta
    int MAX_DOWNLOAD_PER_HARI = 10;
}

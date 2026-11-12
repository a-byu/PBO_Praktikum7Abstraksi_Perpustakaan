/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum7_absraksi;

/**
 *
 * @author wajdie
 */
public class MahasiswaDigital extends Mahasiswa implements DapatDigital{
    public MahasiswaDigital(String id, String nama, String nim) {
        super(id, nama, nim);
    }
    
    @Override
    public void aksesEBook(String url) {
        System.out.println("Mahasiswa " + getNama() + " mengakses e-book di: " + url);
        System.out.println("Maksimal download per hari" + MAX_DOWNLOAD_PER_HARI + " file.");
    }
    
    public String getNama() {
        return super.nama;
    }
}
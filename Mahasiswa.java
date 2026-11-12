/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum7_absraksi;

/**
 *
 * @author wajdie
 */
public class Mahasiswa extends Anggota{
    //atribut
    private String nim;
    
    //constructor
    public Mahasiswa(String id, String nama, String nim) {
        super(id, nama);
        this.nim = nim;
    }
    
    //method
    @Override
    public int getLimitPinjamBuku() {
        return 5;
    }
    
    @Override
    public double hitungDenda(int terlambatHari) {
        return terlambatHari * 1000;
    }
}

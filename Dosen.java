/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum7_absraksi;

/**
 *
 * @author wajdie
 */
public class Dosen extends Anggota{
    //atribut
    private String nidn;
    
    //constructor
    public Dosen(String id, String nama, String nidn) {
        super(id, nama);
        this.nidn = nidn;
    }
    
    //method
    @Override
    public int getLimitPinjamBuku() {
        return 10;
    }
    
    @Override
    public double hitungDenda(int terlambatHari) {
        return terlambatHari * 500;
    }
}

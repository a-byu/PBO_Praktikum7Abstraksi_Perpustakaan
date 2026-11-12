/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum7_absraksi;

/**
 *
 * @author wajdie
 */
public abstract class Anggota {
    //atribut
    protected String id;
    protected String nama;
    
    //constructor
    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    
    //method konkrit
    public void tampilkanInfo() {
        System.out.println("ID  : " + id);
        System.out.println("Nama: " + nama);
    }
    
    //method abstrak
    public abstract int getLimitPinjamBuku();
    public abstract double hitungDenda(int terlambatHari);
}

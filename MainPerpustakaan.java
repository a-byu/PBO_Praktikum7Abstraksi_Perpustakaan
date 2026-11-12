/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum7_absraksi;

/**
 *
 * @author wajdie
 */
import java.util.ArrayList;

public class MainPerpustakaan {
    public static void main(String[] args) {
        //polimorfisme via abstract class
        ArrayList<Anggota> anggotaList = new ArrayList<>();
        anggotaList.add(new Mahasiswa("A001", "Budi", "2023001"));
        anggotaList.add(new Dosen("A002", "Pak Andi", "123456"));
        anggotaList.add(new MahasiswaDigital("A003", "Siti", "2023002"));
        
        System.out.println("========= DAFTAR ANGGOTA PERPUSTAKAAN =========");
        for (Anggota a : anggotaList) {
            a.tampilkanInfo();
            System.out.println("Limit Pinjam: " + a.getLimitPinjamBuku() + " buku.");
            
            System.out.println("Denda (5 hari): Rp." + a.hitungDenda(5));
            
            //cek apakah anggota bisa akses digital
            if (a instanceof DapatDigital) {
                System.out.println(">> Anggota Digital!");
                //downcasting untuk memanggil method interface
                DapatDigital dd = (DapatDigital) a;
                dd.aksesEBook("https://perpus.ac.id/ebook/123");
                dd.infoDigital();
            }
            System.out.println("----------------------------------");
        }
        
        //polimorfisme via interface
        System.out.println("====== KELOMPOK ANGGOTA DIGITAL ======");
        ArrayList<DapatDigital> anggotaDigital = new ArrayList<>();
        anggotaDigital.add(new MahasiswaDigital("A004", "Dewi", "2023003"));
        
        for (DapatDigital d : anggotaDigital) {
            d.aksesEBook("https://perpus.ac.id/ebook/456");
            d.infoDigital();
        }
    } 
}

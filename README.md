# Sistem Informasi Manajemen Perpustakaan (Java OOP)

Proyek praktikum Pemrograman Berorientasi Objek (OOP) berbasis Java yang mengimplementasikan konsep **Abstraksi** menggunakan kombinasi **Abstract Class** dan **Interface**, serta penerapan pewarisan (*inheritance*), polimorfisme ganda, dan pengecekan tipe objek saat *runtime*.

## 📌 Struktur & Arsitektur Kelas

Program berada di dalam package `com.mycompany.praktikum7_absraksi` dan terdiri dari 6 komponen utama:

1. **`Anggota.java` (*Abstract Class*)**
   * Berperan sebagai kelas induk (*superclass*) untuk seluruh anggota perpustakaan dengan atribut dasar `id` dan `nama`.
   * Menyediakan metode konkrit `tampilkanInfo()` serta kontrak metode abstrak `getLimitPinjamBuku()` dan `hitungDenda(int terlambatHari)` yang wajib diimplementasikan oleh kelas turunannya.
2. **`Mahasiswa.java` (*Concrete Subclass*)**
   * Mewarisi kelas `Anggota` (`extends`) dengan tambahan atribut spesifik `nim`.
   * Meng-*override* aturan peminjaman khusus mahasiswa: batas peminjaman maksimal **5 buku** dan denda keterlambatan **Rp 1.000/hari**.
3. **`Dosen.java` (*Concrete Subclass*)**
   * Mewarisi kelas `Anggota` (`extends`) dengan tambahan atribut spesifik `nidn`.
   * Meng-*override* aturan peminjaman khusus dosen: batas peminjaman maksimal **10 buku** dan denda keterlambatan **Rp 500/hari**.
4. **`DapatDigital.java` (*Interface*)**
   * Mendefinisikan kontrak perilaku akses digital melalui metode abstrak `aksesEBook(String url)`.
   * Menggunakan fitur **Default Method** (`infoDigital()`) yang sudah memiliki implementasi bawaan, serta konstanta `MAX_DOWNLOAD_PER_HARI = 10`.
5. **`MahasiswaDigital.java` (*Hybrid Subclass*)**
   * Mewarisi kelas `Mahasiswa` (`extends`) sekaligus mengimplementasikan *interface* `DapatDigital` (`implements`).
   * Menggabungkan aturan peminjaman mahasiswa reguler dengan kemampuan mengakses dan mengunduh *e-book*.
6. **`MainPerpustakaan.java` (*Main Class*)**
   * Mengelola koleksi anggota perpustakaan menggunakan `ArrayList<Anggota>` dan kelompok khusus anggota digital menggunakan `ArrayList<DapatDigital>`.
   * Mendemonstrasikan iterasi polimorfik serta pengecekan kemampuan digital menggunakan `instanceof` dan *downcasting*.

---

## 💡 Lessons Learned

Dari pengerjaan praktikum ini, beberapa konsep fundamental Java OOP yang berhasil dipelajari dan dipraktikkan adalah:

* **Kombinasi Abstract Class & Interface (*Multiple Inheritance* Perilaku):**
  * Memahami bagaimana *Abstract Class* (`Anggota`) menyatukan identitas dan atribut dasar yang sama (*"IS-A"*), sementara *Interface* (`DapatDigital`) menyuntikkan kemampuan tambahan (*"CAN-DO"*) pada kelas spesifik (`MahasiswaDigital`) tanpa melanggar aturan *single inheritance* di Java.
* **Kegunaan *Default Method* dan Konstanta pada Interface:**
  * Mempelajari bahwa pada Java 8+, *interface* dapat memiliki *default method* (`infoDigital()`) yang langsung dapat digunakan oleh kelas pengimplementasi tanpa harus ditulis ulang (*override*), serta menyertakan konstanta tetap (`MAX_DOWNLOAD_PER_HARI`) sebagai batasan aturan bisnis.
* **Polimorfisme Ganda (via Superclass & via Interface):**
  * Mengelola berbagai jenis objek berbeda (`Mahasiswa`, `Dosen`, `MahasiswaDigital`) di dalam satu wadah `ArrayList<Anggota>` untuk memanggil metode umum secara dinamis.
  * Mengelompokkan objek berdasarkan kapabilitasnya ke dalam `ArrayList<DapatDigital>` untuk mengeksekusi perilaku spesifik.
* **Runtime Type Checking (`instanceof`) & Safe Downcasting:**
  * Menggunakan `if (a instanceof DapatDigital)` untuk memeriksa apakah suatu objek di dalam daftar umum memiliki fitur akses digital sebelum melakukan *explicit downcasting* (`(DapatDigital) a`) guna menghindari *runtime error* (`ClassCastException`).
 
---


## Output
<img width="665" height="453" alt="Screenshot from 2026-11-12 08-20-38" src="https://github.com/user-attachments/assets/d237191d-7f18-4595-af75-4e475a0b9dfc" />

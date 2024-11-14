/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManajemenPerpustakaan;

/**
 *
 * @author Mumtaz
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perpustakaan {

    static List<Buku> bukuList = new ArrayList<>();
    static List<Anggota> anggotaList = new ArrayList<>();


    // Menambah Buku Baru
    static void tambahBuku(Scanner scanner) {
        System.out.println("\n=== MENAMBAH BUKU BARU ===");
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); // Membuang newline
        System.out.print("Masukkan ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Apakah Jenis Digital?y/n: ");
        String jenis = scanner.nextLine();
        
        if(jenis.toLowerCase().equals("y")){
            System.out.print("Masukan ukuran file: ");
            String filesize = scanner.nextLine();
            System.out.print("Masukan format file: ");
            String fileformat = scanner.nextLine();
            BukuDigital digital = new BukuDigital(judul, pengarang,tahunTerbit, isbn, filesize, fileformat);
            bukuList.add(digital);
            System.out.println("Buku berhasil ditambahkan.");
        }else{
            Buku bukuBaru = new Buku(judul, pengarang,tahunTerbit, isbn);
            bukuList.add(bukuBaru);
            System.out.println("Buku berhasil ditambahkan.");
        }
    }

    
    // Mendaftarkan Anggota Baru
    static void daftarAnggota(Scanner scanner) {
        System.out.println("\n=== MENDAFTARKAN ANGGOTA BARU ===");
        System.out.print("Masukkan nama anggota: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nomor anggota: ");
        int nomorAnggota = scanner.nextInt();
        scanner.nextLine(); // Membuang newline
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        Anggota anggotaBaru = new Anggota(nama, nomorAnggota, alamat, false);
        anggotaList.add(anggotaBaru);
        System.out.println("Anggota berhasil didaftarkan.");
    }

    // Meminjam Buku
    static void pinjamBuku(Scanner scanner) {
        System.out.println("\n=== MEMINJAM BUKU ===");
        System.out.print("Masukkan nomor anggota: ");
        int nomorAnggota = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        Anggota anggota = cariAnggota(nomorAnggota);
        if (anggota != null) {
            System.out.print("Masukkan judul buku yang dipinjam: ");
            String judulBuku = scanner.nextLine();
            Buku buku = cariBuku(judulBuku);
            if (buku != null) {
                anggota.tambahBukuDipinjam(buku);
                buku.setStatus(false);
                System.out.println("Buku berhasil dipinjam.");
            } else {
                System.out.println("Buku tidak ditemukan.");
            }
        } else {
            System.out.println("Anggota tidak ditemukan.");
        }
    }

    // Mengembalikan Buku
    static void kembalikanBuku(Scanner scanner) {
        System.out.println("\n=== MENGEMBALIKAN BUKU ===");
        System.out.print("Masukkan nomor anggota: ");
        int nomorAnggota = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        Anggota anggota = cariAnggota(nomorAnggota);
        if (anggota != null) {
            System.out.print("Masukkan judul buku yang dikembalikan: ");
            String judulBuku = scanner.nextLine();
            // Logika untuk menghapus buku dari daftar pinjaman anggota
            // (Implementasi tidak ditampilkan di sini)
            System.out.println("Buku berhasil dikembalikan.");
        } else {
            System.out.println("Anggota tidak ditemukan.");
        }
    }

    // Menampilkan Daftar Buku
    static void tampilkanDaftarBuku() {
        System.out.println("\n=== DAFTAR BUKU TERSEDIA===");
        for(Buku buku : bukuList){
            if(buku.getStatus()){
                buku.tampilkanInfo();
            }
        }
    }

    // Menampilkan Informasi Anggota
    static void tampilkanInfoAnggota(Scanner scanner) {
        System.out.println("\n=== INFORMASI ANGGOTA ===");
        System.out.print("Masukkan nomor anggota: ");
        int nomorAnggota = scanner.nextInt();
        Anggota anggota = cariAnggota(nomorAnggota);
        if (anggota != null) {
            anggota.tampilkanInfo();
        } else {
            System.out.println("Anggota tidak ditemukan.");
        }
    }

    // Mencari Anggota berdasarkan nomor
    static Anggota cariAnggota(int nomorAnggota) {
        for (Anggota anggota : anggotaList) {
            if (anggota.getNomorAnggota() == nomorAnggota) {
                return anggota;
            }
        }
        return null;
    }

    // Mencari Buku berdasarkan judul
    static Buku cariBuku(String judul) {
        for (Buku buku : bukuList) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            } else {
            }
        }
        return null;
    }
   
}
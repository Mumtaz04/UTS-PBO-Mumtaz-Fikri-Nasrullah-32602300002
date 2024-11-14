/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManajemenPerpustakaan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mumtaz
 */
public class Anggota {
    // Properti dengan enkapsulasi
    private String nama;
    private int nomorAnggota;
    private String alamat;
    private boolean daftarPinjaman;
    private List<Buku> bukuDipinjam = new ArrayList<>(); // Daftar buku yang dipinjam

    // Konstruktor dengan parameter (Overloading Constructor)
    public Anggota(String nama, int nomorAnggota, String alamat, boolean daftarPinjaman) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.daftarPinjaman = daftarPinjaman;
    }

    // untuk properti nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // untuk properti nomorAnggota
    public int getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(int nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }
    // untuk properti alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    // untuk properti daftarPinjaman
    public boolean getDaftarPinjaman() {
        return daftarPinjaman;
    }

    public void setDaftarPinjaman(boolean daftarPinjaman) {
        this.daftarPinjaman = daftarPinjaman;
    }

    // Method untuk menambahkan buku yang dipinjam
    public void tambahBukuDipinjam(Buku buku) {
        bukuDipinjam.add(buku);
        daftarPinjaman = true; // Set daftarPinjaman menjadi true jika ada buku yang dipinjam
    }

    // Method untuk menampilkan informasi anggota
    public void tampilkanInfo() {
        System.out.println("Nama Anggota: " + nama);
        System.out.println("Nomor Anggota: " + nomorAnggota);
        System.out.println("Alamat: " + alamat);
        System.out.println("Daftar Pinjaman: " + daftarPinjaman);
        System.out.println("Buku yang Dipinjam: ");
        bukuDipinjam.forEach((Buku buku) -> {
            System.out.println("- " + buku.getJudul()); // Asumsi Buku memiliki metode getJudul()
        });
    }
}
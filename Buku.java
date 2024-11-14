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

public class Buku {
    // Properti dengan enkapsulasi
    private String judul;
    private String pengarang;
    private int Tahun;
    private String ISBN;
    private boolean Status; // true jika dipinjam, false jika tersedia

    
    
    // Konstruktor dengan parameter (Overloading Constructor)
    public Buku(String judul, String pengarang, int Tahun, String ISBN) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.Tahun = Tahun;
        this.ISBN = ISBN;
        this.Status = true;
    }
    


    // Method untuk meminjam buku
    public void pinjamBuku() {
        if (!Status) {
            Status = true; // Mengubah status menjadi dipinjam
            System.out.println("Buku '" + judul + "' telah dipinjam.");
        } else {
            System.out.println("Buku '" + judul + "' tidak tersedia untuk dipinjam.");
        }
    }
    
    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun: " + Tahun);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Status: " + (Status ? "Tersedia" : "Dipinjam") + "\n");
    }

    String getJudul() {
        return this.judul;
     }
    
    public void setStatus(boolean status){
        this.Status = status;
    }
    
    boolean getStatus(){
        return this.Status;
    }
    
   }
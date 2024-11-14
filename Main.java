/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManajemenPerpustakaan;
import static ManajemenPerpustakaan.Perpustakaan.daftarAnggota;
import static ManajemenPerpustakaan.Perpustakaan.kembalikanBuku;
import static ManajemenPerpustakaan.Perpustakaan.pinjamBuku;
import static ManajemenPerpustakaan.Perpustakaan.tambahBuku;
import static ManajemenPerpustakaan.Perpustakaan.tampilkanDaftarBuku;
import static ManajemenPerpustakaan.Perpustakaan.tampilkanInfoAnggota;
import java.util.Scanner;

/**
 *
 * @author Mumtaz
 */
public class Main {
    // Other methods remain the same...

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== APLIKASI PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Daftar Anggota Baru");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Daftar Buku Yang Tersedia");
            System.out.println("6. Tampilkan Informasi Anggota");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    tambahBuku(scanner);
                    break;
                case 2:
                    daftarAnggota(scanner);
                    break;
                case 3:
                    pinjamBuku(scanner);
                    break;
                case 4:
                    kembalikanBuku(scanner);
                    break;
                case 5:
                    tampilkanDaftarBuku();
                    break;
                case 6:
                    tampilkanInfoAnggota(scanner);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi Perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        } while (pilihan != 0);
    }
}

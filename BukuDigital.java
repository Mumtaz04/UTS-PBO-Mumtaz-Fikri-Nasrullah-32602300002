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
public class BukuDigital extends Buku {
    protected String fileSize; // in MB
    protected String fileFormat; // e.g., PDF, EPUB
    
    public BukuDigital(String judul, String pengarang, int Tahun, String ISBN, String fileSize, String fileFormat) {
        super(judul, pengarang, Tahun, ISBN);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("File Format: " + fileFormat);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas11;

/**
 *
 * @author dhiya
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan(10);

        Buku buku1 = new Buku("malioboro at midnight");
        Buku buku2 = new Buku("negeri para bedebah");

        Pengarang pengarang1 = new Pengarang("Skyspire");
        Pengarang pengarang2 = new Pengarang("Tere Liye");

        buku1.tambahPengarang(pengarang1);
        buku2.tambahPengarang(pengarang2);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}

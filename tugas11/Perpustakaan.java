/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas11;

/**
 *
 * @author dhiya
 */
public class Perpustakaan {
    private Buku[] bukuList;
    private int count;

    public Perpustakaan(int kapasitas) {
        bukuList = new Buku[kapasitas];
        count = 0;
    }

    public void tambahBuku(Buku buku) {
        if (count < bukuList.length) {
            bukuList[count] = buku;
            count++;
        } else {
            System.out.println("Perpustakaan sudah penuh!");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Informasi Buku di Perpustakaan:");
        for (int i = 0; i < count; i++) {
            bukuList[i].infoBuku();
        }
    }
}

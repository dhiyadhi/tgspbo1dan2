/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo5;

/**
 *
 * @author dhiya
 */
public class Kendaraan {
    final String nama;
    final int kecepatan;

    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

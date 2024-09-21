/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;
/**
 *
 * @author dhiya
 */
public class Mobil extends Kendaraan {
    private final int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfoMobil() {
        tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Mobil: " + getNama());
        System.out.println("Kecepatan: " + getKecepatan() + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public String getNama() {
        return nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }
}
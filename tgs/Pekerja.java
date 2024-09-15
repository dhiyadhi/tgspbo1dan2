/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs4.tgs;

/**
 *
 * @author dhiya
 */
class Pekerja extends Manusia {
    private double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter untuk gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan informasi
    @Override
    public String toString() {
        return "Nama: " + getNama() + 
               ", Usia: " + usia + 
               ", Pekerjaan: " + pekerjaan + 
               ", Gaji: " + gaji;
    }
}

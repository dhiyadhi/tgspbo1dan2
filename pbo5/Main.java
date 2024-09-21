/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

/**
 *
 * @author dhiya
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("kereta", 50);
        kendaraan.tampilkanInfo();

        Mobil mobil = new Mobil("isuzu panther", 125, 5);
        mobil.tampilkanInfoMobil();

        SepedaMotor sepedaMotor = new SepedaMotor("Honda vario", 125, "Mesin 4 Tak");
        sepedaMotor.tampilkanInfoSepedaMotor();
    }
}
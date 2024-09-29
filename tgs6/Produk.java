/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs6;

/**
 *
 * @author dhiya
 */
abstract class Produk {
    double harga;

    public Produk(String nama, double harga) {
        this.harga = harga;
    }

    abstract double hitungDiskon();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs6;

/**
 *
 * @author dhiya
 */
class pakaian extends Produk {
    public pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    double hitungDiskon() {
        return harga * 0.15; 
    }
}

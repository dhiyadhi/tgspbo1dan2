/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs6;
/**
 *
 * @author dhiya
 */

import java.util.ArrayList;

class Keranjang {
    ArrayList<Produk> produkList = new ArrayList<>();

    void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    double totalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.hitungDiskon();
        }
        return total;
    }
}


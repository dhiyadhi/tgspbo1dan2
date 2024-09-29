/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs6;

/**
 *
 * @author dhiya
 */
public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Buku Dasar Pemrograman", 200000);
        Elektronik elektronik = new Elektronik("Laptop", 8000000);
        pakaian pakaian = new pakaian("Jeans", 300000);

        // Membuat objek Keranjang
        Keranjang keranjang = new Keranjang(); 
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        // Memanggil metode totalHargaSetelahDiskon() melalui objek keranjang
        System.out.println("Total harga setelah diskon: " + keranjang.totalHargaSetelahDiskon());
    }
}


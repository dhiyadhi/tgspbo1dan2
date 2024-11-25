/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author dhiya
 */
public class Main {
    public static void main(String[] args) {

        Klub klub = new Klub("Klub Melukis");

        Anggota anggota1 = new Anggota("Antonio Blanco");
        Anggota anggota2 = new Anggota("Nyoman Nuarta");

        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);

        klub.infoKlub();
    }
}


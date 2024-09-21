/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs5;

/**
 *
 * @author dhiya
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kucing", "Anggora");
        kucing.tampilkanInfo();

        Anjing anjing = new Anjing("Anjing", "Pitbul");
        anjing.tampilkanInfo();
    }
}

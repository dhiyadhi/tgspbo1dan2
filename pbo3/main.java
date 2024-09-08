/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo3;

/**
 *
 * @author dhiya
 */
public class main {
public static void main(String[] args) {
        // Create two objects from Mobil class
        Mobil mobil1 = new Mobil("Isuzu", "Panther Miyabi", 1997, "Green");
        Mobil mobil2 = new Mobil("GM", "Chevrolet Camaro", 1969, "Red");

        // Display information of each object
        mobil1.displayInfo();
        mobil2.displayInfo();

        // Start engine for each object
        mobil1.startEngine();
        mobil2.startEngine();

        // Change the color of mobil1 and display the change
        mobil1.setWarna("Green");
        mobil1.displayInfo();
    }
}

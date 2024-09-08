/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak3;

/**
 *
 * @author dhiya
 */
public class main {
    public static void main(String[] args) {
            hewan kucing = new hewan("suti", 5);
            kucing.suara();
            kucing.info();
            
            hewan anjing = new hewan("jiji", 1);
            anjing.suara();
            anjing.info();
    }    
}

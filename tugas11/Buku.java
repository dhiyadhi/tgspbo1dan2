/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhiya
 */
public class Buku {
    private String judul;
    private List<Pengarang> pengarangList;

    public Buku(String judul) {
        this.judul = judul;
        this.pengarangList = new ArrayList<>();
    }

    public void tambahPengarang(Pengarang pengarang) {
        pengarangList.add(pengarang);
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        for (Pengarang pengarang : pengarangList) {
            pengarang.infoPengarang();
        }
    }
}

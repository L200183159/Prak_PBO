/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Balok extends BangunRuang {
    int panjang = 7;
    int lebar = 5;
    int tinggi = 10;

    public int Volume() {
        return panjang * lebar * tinggi;
    }

    public int LuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}

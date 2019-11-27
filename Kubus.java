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
public class Kubus extends BangunRuang {
    int sisi = 5;

    public int Volume() {
        return sisi * sisi * sisi;
    }

    public int LuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
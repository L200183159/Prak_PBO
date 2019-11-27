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
public class Bola extends BangunRuang {
    int pi = 22/7;
    int r = 7;

    public int Volume() {
        return 4/3 * pi * (r * r * r);
    }

    public int LuasPermukaan() {
        return 4 * pi * (r * r);
    }
}
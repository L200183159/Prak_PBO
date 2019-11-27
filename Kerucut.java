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
public class Kerucut extends BangunRuang {
    int pi = (22/7);
    int r = 7;
    int s = 10;
    int t = 13;

    public int Volume() {
        return ((1/3) * pi * (r * r) * t);
    }

    public int LuasPermukaan() {
        return pi * r * (r + s);
    }
}

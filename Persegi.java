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
public class Persegi extends BangunDatar {
    protected double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        luas = sisi * sisi;
        System.out.println("Luas Persegi = " + luas);

    }

    public void hitungKeliling() {
        keliling = (sisi + sisi) * 2;
        System.out.println("Keliling Persegi = " + keliling);
    }
    
}

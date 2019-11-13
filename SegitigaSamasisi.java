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
class SegitigaSamaSisi extends Segitiga {
    protected double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungKeliling() {
        alas = sisi;
        keliling = alas * 3;
        System.out.println("Keliling Segitiga Sama Sisi = " + keliling);
    }
    
}

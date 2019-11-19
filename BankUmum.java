/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Exp3;

/**
 *
 * @author ASUS
 */
public class BankUmum extends Bank {
    protected int getRasioBunga() {
        return Bunga;
    }

    public void setRasioBunga(int Bunga) {
        this.Bunga = Bunga;
    }
}
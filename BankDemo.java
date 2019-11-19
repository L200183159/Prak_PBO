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
public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setRasioBunga(8);
        System.out.println(b1.getRasioBunga());
        System.out.println();

        BankPribadi b2 = new BankPribadi();
        b2.setRasioBunga(10);
        System.out.println(b2.getRasioBunga());
        System.out.println();

        BankUmum b3 = new BankUmum();
        b3.setRasioBunga(12);
        System.out.println(b3.getRasioBunga());
        System.out.println();

        BankPasar b4 = new BankPasar();
        b4.setRasioBunga(28);
        System.out.println(b4.getRasioBunga());
        System.out.println();

        BankSyariah b5 = new BankSyariah();
        b5.setRasioBunga(29);
        System.out.println(b5.getRasioBunga());
        System.out.println();
    }
}
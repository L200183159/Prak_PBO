/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan {
    String bergerak = "Bergerak di darat";
    String bahanBakar = "menggunakan bahan bakar";

    public void MessageA() {
        System.out.println("Mobil " + roda + " dan bergerak " + bergerak);
    }

    public void MessageB() {
        System.out.println("Mobil " + penumpang + " dan " + bahanBakar);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import modul4.PublicModifier;

public class Tes5 {
    public static void main(String[] args) {
        PublicModifier publicmodifier = new PublicModifier();
        publicmodifier.kali();
        publicmodifier.tambah();
        publicmodifier.kurang();
        publicmodifier.bagi();
        publicmodifier.rata();
    }
}
/* method kali() dapat diakses karena type data public dapat diakses pada semua class yang menggunakan class yang berisi variabel tersebut, meskipun berada pada package yang berbeda */


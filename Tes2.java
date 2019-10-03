/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import modul4.DefaultModifier;

public class Tes2 {
    public static void main(String[] args) {
        DefaultModifier defaultmodifier = new DefaultModifier();
        defaultmodifier.jumlah();
    }
}
/* method jumlah() tidak dapat diakses karena type default hanya dapat diakses oleh class yang berada dalam package yang sama */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonvoidmethod;

/**
 *
 * @author ASUS
 */
public class NonVoidMethod {
    
    public String Nama() {
        String nama = "Naura Salsabila";
        return nama;
    }

    public String NIM() {
        String nim = "L200183159";
        return nim;
    }

    public static void main(String[] args) {
        NonVoidMethod nonvoidmethod = new NonVoidMethod();
        System.out.println("Nama : " + nonvoidmethod.Nama());
        System.out.println("NIM : " + nonvoidmethod.NIM());
    }
}

  

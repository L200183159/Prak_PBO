/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class NestedClass {
    String nama = "Naura Salsabila";
    String nim = "L200183159";
    
    public void printNama() {
        System.out.println(nama + " : " + nim);
    }
    
    static class StaticNestedClass {
        static String jurusan = "Informatika";
    }
    
    class InnerClass {
        public String getJurusan() {
            return StaticNestedClass.jurusan;
        }
    }
}

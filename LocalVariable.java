

    package localVariable;

import java.io.PrintStream;

    public class LocalVariable {

    private int usia;
    private String beratBadan;
    private PrintStream PrintStream;
        public void hitungUsia() {
        int umur = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 2000;
        
        usia = tahunSekarang - tahunLahir;
        
        System.out.println("Usia saya : " + usia);
    }
    public void beratBadan(){
        int berat = 0;
        int beratLahir = 3;
        
        berat = beratLahir + (usia/2);
        
    }
    public static void main (String[] args){
        LocalVariable dis = new LocalVariable();
        dis.hitungUsia();
        dis.beratBadan();
    }
}
/*
For the question on the modul is "Is the "usia" variable can be called on void
beratBadan()??
- No it wont be called cause it is located on the outside of the class method of 
hitungUsia
*/
    


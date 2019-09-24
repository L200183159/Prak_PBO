/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    String nama;
    int NIP;
    double gaji;
    String Alamat;
    String jabatan;
    String ttl;
    
    public void peg(String namaPeg,double GajiPeg, int NIPPeg, String AlamatPeg
    , String JabatanPeg, String TTLPeg){
        this.nama = namaPeg;
        this.gaji= GajiPeg;
        this.NIP = NIPPeg;
        this.Alamat = AlamatPeg;
        this.jabatan = JabatanPeg;
        this.ttl = TTLPeg;
        System.out.println("Nama Pegawai :"+nama+ "\n" + "Gaji      :" +gaji+ " \nNIP Pegawai :"
            + NIP + "\nAlamat Rumah:" +Alamat+ "\nJabatan      :" +jabatan+ "\nTTL          :"
            +ttl+"\n");
             
    }
    
    public static void main (String[] args){
        Pegawai pns = new Pegawai();
        Pegawai pns1 = new Pegawai();
        Pegawai pns2 = new Pegawai();
        Pegawai pns3 = new Pegawai();
        Pegawai pns4 = new Pegawai();
        Pegawai pns5 = new Pegawai();
        pns.peg("Naura Salsabila", 5500000, 26371, "linggau", "direktur", 
                "3 agustus 2000");
        pns1.peg("lolak", 2500000, 132423, "bengkulu", "diriktor juga dong", 
                "13 agustus 1995");
        pns2.peg("bambang sukinem", 2000000, 19395325, "padang", "bawahan", 
                "12 November 1983");
        pns3.peg("suep melati", 1500000, 18426, "palembang", "atasannya lolak", 
                "1 Januari 2000");
        pns4.peg("sukina", 9999990, 1323423, "medan horas bah", "bawahannya suep", 
                "lupa");
        pns5.peg("iinkuning", 3100000, 132423, "merasi yellow", "middle of bambang dan lola", 
                "21 Januari 1985");
    }
}

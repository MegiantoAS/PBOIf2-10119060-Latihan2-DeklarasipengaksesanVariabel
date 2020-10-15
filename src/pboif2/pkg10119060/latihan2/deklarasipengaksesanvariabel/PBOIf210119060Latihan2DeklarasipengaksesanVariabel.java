/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan2.deklarasipengaksesanvariabel;

/**
 *
 * @author asus
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program ini berisi program Deklarasi pengaksesan varaibel
 */
public class PBOIf210119060Latihan2DeklarasipengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai variabel
        nilaiInt = 80;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan hasil
        System.out.println();
        System.out.println("Isi Variabel nilai = " + nilaiInt);
        System.out.println("Isi Variabel PHI = " + PHI);
        System.out.println("Isi Variabel Logika = " + nilaiLogika);
        System.out.println("isi Variabel Karakter =" + nilaiKarakter);
    }
    
}

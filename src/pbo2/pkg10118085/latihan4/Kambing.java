/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan4;

/**
 * @author 
 * NAMA                 : RISKY IRFRANSYAH
 * KELAS                : IF-2
 * NIM                  : 10118085
 * DESKRIPSI PROGRAM    : Kambing
 * @author RISKY
 */
public class Kambing {
    
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0 ;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}

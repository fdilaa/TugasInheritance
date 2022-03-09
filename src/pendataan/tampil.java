/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class tampil {
    public static void main(String[] args) {
        Pembagian x = new Pembagian();
        Scanner scan = new Scanner (System.in);
        System.out.println("---Identifikasi Pekerjaan Masyarakat Indonesia---");
        System.out.println("Nama Pekerjaan: ");
        String pekerjaan = scan.nextLine();
        System.out.println("Cara Bekerja: ");
        String cara = scan.nextLine();
        System.out.println("Tempat Bekerja: ");
        String tempat = scan.nextLine();
        System.out.println("Hasil Produksi: ");
        String produksi = scan.nextLine();
        System.out.println("Termasuk Pekerjaan bidang: ");
        String pilihan = scan.nextLine();
        System.out.println("Masukkan Gaji: ");
        int gaji = scan.nextInt();
        x.BagianPekerjaan();
        System.out.println("Gaji yang didapatkan: " + x.JumlahGaji(gaji));
        System.out.println("Hasil Gaji tambahan apabila bekerja ekstra: " + x.JumlahGaji(gaji)*2);
        
        
       
    }
}

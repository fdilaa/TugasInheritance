/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataan;

import java.util.Scanner;

/**
 *
 * @author d
 */
public class Pembagian extends Pekerjaan {
    
    public String pekerjaan, cara, tempat, produksi, pilihan;
    public int gaji;
    
    //@overriding
    public void IdentitasPekerjaan() {
        System.out.println("Nama Pekerjaan: " + pekerjaan);
        System.out.println("Cara Bekerja: " + cara);
        System.out.println("Tempat Bekerja: " + tempat);
        System.out.println("Hasil Produksi: " + produksi);  
        System.out.println("Termasuk Bidang Pekerjaan: " + pilihan);
    }
    
    public void BagianPekerjaan(){
        System.out.println("Bidang pekerjaan: " + super.jenis_pekerjaan);
    }
    
    //Overloading
    public int JumlahGaji(int gaji){
        this.gaji=gaji;
        return gaji;
    }
    
    public void JumlahGaji (double kebutuhan ){
        System.out.println("Biaya yang dibutuhkan untuk Bekerja: " + kebutuhan);
    }
}

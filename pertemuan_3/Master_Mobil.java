/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */
public class Master_Mobil {
    public static void main(String[] args) {
     // Membuat objek mobil sedan
        PBO_Mobil sedan = new PBO_Mobil();

        // Mengisi atribut
        sedan.karakteristik = "Kenyamanan, Desain Body Futuristik";
        sedan.merkMobil = "Suzuki";
        sedan.tahunPembuatan = 2000;
        sedan.warnaMobil = "Putih";
        
        //Informasi 
        System.out.println("1. Mobil sedan");
        System.out.println("karakteristik : " + sedan.karakteristik);
        System.out.println("Merk Mobil: " + sedan.merkMobil);
        System.out.println("Tahun Pembuatan: " + sedan.tahunPembuatan);
        System.out.println("Warna Mobil: " + sedan.warnaMobil);
       
        //method
        sedan.jalan();
        sedan.berhenti();
    }  
    }

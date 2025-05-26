/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */
class PBO_Mobil {
    String karakteristik;
    String merkMobil;
    int tahunPembuatan;
    String warnaMobil;
    
    
    public void jalan (){
        System.out.println("Mobil sedang berjalan...");
    }
    
    public void berhenti(){
        System.out.println("Mobil berhenti.");
    }
}
//method main ()
    public class Master_Mobil  {
    public static void main(String[] args) {
     // Membuat objek mobil sedan
        PBO_Mobil sedan = new PBO_Mobil ();
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
 //public → supaya bisa diakses dari luar class

//static → bisa dijalankan tanpa membuat objek dari class-nya

//void → tidak mengembalikan nilai

//main → nama method khusus yang dikenali Java sebagai titik awal eksekusi

//String[] args → argumen dari command line (boleh kosong kalau tidak dipakai)





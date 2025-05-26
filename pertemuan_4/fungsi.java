 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author isna
 */
public class fungsi {
    
    // Fungsi untuk menjumlahkan dua angka
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Fungsi untuk menampilkan pesan
    public static void cetakPesan(String pesan) {
        System.out.println("Pesan: " + pesan);
    }

    public static void main(String[] args) {
        // Memanggil fungsi tambah
        int hasil = tambah(5, 3);
        System.out.println("Hasil Penjumlahan: " + hasil);

        // Memanggil fungsi cetakPesan
        cetakPesan("Halo, Isnaa Chaan disini > _ <!");
    }
}

//dipelajari ulang perbedaan prosedur dan fungtion
//perbedaan method dan parameter

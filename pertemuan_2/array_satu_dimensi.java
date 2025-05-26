/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;


public class array_satu_dimensi {
    
    
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array dengan ukuran 5
        int[] angka = new int[5];

        // Mengisi array dengan nilai
        angka[0] = 10;
        angka[1] = 20;
        angka[2] = 30;
        angka[3] = 40;
        angka[4] = 50;

        // Menampilkan isi array
        System.out.println("Isi array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Angka pada indeks " + i + ": " + angka[i]);
        }

        // Contoh lain: Inisialisasi langsung
        String[] nama = {"Alice", "Bob", "Charlie"};

        // Menampilkan isi array lain
        System.out.println("\nIsi array nama:");
        for (String n : nama) {
            System.out.println(n);
        }
    }  
    
    
}




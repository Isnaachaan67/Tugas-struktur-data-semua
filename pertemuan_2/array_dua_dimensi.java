/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author isna
 */
public class array_dua_dimensi {

    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array dua dimensi
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Menampilkan elemen array
        System.out.println("Isi array dua dimensi:");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println(); // Baris baru setelah setiap baris array
        }
    }
}

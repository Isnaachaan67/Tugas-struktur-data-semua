/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author isna
 */
   import java.util.LinkedList;
    import java.util.Queue;

public class Q_Transportasi {
    public static void main(String[] args) {
        Queue<String> Q_Transportasi = new LinkedList<>();

        // Menambahkan kendaraan ke dalam antrian
        Q_Transportasi.add("Bus");
        Q_Transportasi.add("Taksi");
        Q_Transportasi.add("Kereta");
        Q_Transportasi.add("Motor");

        System.out.println("Antrian Kendaraan: " + Q_Transportasi);

        // Menghapus kendaraan dari antrian (servis pertama)
        String servicedVehicle = Q_Transportasi.poll();
        System.out.println("Kendaraan keluar: " + servicedVehicle);
        System.out.println("Antrian Kendaraan setelah servis: " + Q_Transportasi);

        // Melihat kendaraan pertama dalam antrian
        String nextVehicle = Q_Transportasi.peek();
        System.out.println("Kendaraan berikutnya: " + nextVehicle);
    }
}
    
 
//- Queue (Antrian) adalah struktur data yang mengikuti prinsip FIFO (First In, First Out), artinya kendaraan yang masuk pertama akan keluar lebih dulu.
//- Kita menggunakan LinkedList sebagai implementasi Queue karena mendukung operasi antrian dengan efisien.
//- Metode add() digunakan untuk menambahkan kendaraan ke dalam antrian.
//- Metode poll() digunakan untuk mengeluarkan kendaraan pertama dari antrian.
//- Metode peek() digunakan untuk melihat kendaraan pertama yang masih dalam antrian tanpa mengeluarkannya.
//- Setiap kali kendaraan keluar dari antrian, sistem akan menampilkan kondisi terbaru dari daftar kendaraan.//
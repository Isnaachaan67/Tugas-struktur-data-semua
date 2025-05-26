/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author isna
 */
import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean stuck = true;
            
            System.out.println("🚦 Kendaraan Anda terjebak di persimpangan! 🚗");
            while (stuck) {
                System.out.print("Masukkan perintah (jalan/menunggu/bantuan): ");
                String command = scanner.nextLine().toLowerCase();
                
                switch (command) {
                    case "jalan" -> {
                        System.out.println("🚙 Kendaraan mulai bergerak! Anda tidak macet lagi.");
                        stuck = false;
                    }
                    case "menunggu" -> System.out.println("⏳ Masih menunggu... Kendaraan tetap terjebak.");
                    case "bantuan" -> {
                        System.out.println("📞 Bantuan datang! Polisi mengatur lalu lintas.");
                        stuck = false;
                    }
                    default -> System.out.println("❌ Perintah tidak dikenali. Coba lagi!");
                }
            }
            System.out.println("✅ Keluar dari kemacetan!");
        }
    }
}


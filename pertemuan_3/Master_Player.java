/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */
public class Master_Player {
        
     // Atribut
    String name;
    int speed;
    int healthPoin;

    // Method untuk menjalankan aksi 'run'
    void run() {
        System.out.println(name + " is running...");
        System.out.println("Speed: " + speed);
    }

    // Method untuk mengecek apakah pemain sudah mati
    boolean isDead() {
        return healthPoin <= 0;
    }
    
    public static void main(String[] args) {
        Master_Player petani = new Master_Player();
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 100;

        petani.run();

        if (petani.isDead()) {
            System.out.println("Game Over");
        } else {
            System.out.println("Masih hidup, lanjutkan!");
        }
    }
}



    


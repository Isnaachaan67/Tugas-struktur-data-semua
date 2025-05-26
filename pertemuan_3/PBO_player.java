/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */
public class PBO_player {
    public static void main(String[] args) {
        
        
        //membuat objek player
        Master_Player petani = new Master_Player ();
        
        //mengisi atribut palyer
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 100;
        
        //menjalankan method
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over");
        }
    }
}

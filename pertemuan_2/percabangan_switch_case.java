/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author isna
 */
public class percabangan_switch_case {
    public static void main(String[] args) {
      
        int day = 3; //isi angka input yang diinginkan
        String dayString;

        dayString = switch (day) {
            case 1 -> "Minggu";
            case 2 -> "Senin";
            case 3 -> "Selasa";
            case 4 -> "Rabu";
            case 5 -> "Kamis";
            case 6 -> "Jumat";
            case 7 -> "Sabtu";
            default -> "Hari tidak valid";
        };

        System.out.println("Hari ke-" + day + " adalah hari " + dayString);
    }
}
   


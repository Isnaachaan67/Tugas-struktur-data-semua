/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */
class BangunDatar {
    public class Main {
    // Kelas Induk
    
        public double hitungLuas() {
            return 0;
        }

        public double hitungKeliling() {
            return 0;
        }
    }

    // Kelas Turunan: Lingkaran
    static class Lingkaran extends BangunDatar {
        private double jariJari;

        public Lingkaran(double jariJari) {
            this.jariJari = jariJari;
        }

        public double getJariJari() {
            return jariJari;
        }

        public void setJariJari(double jariJari) {
            this.jariJari = jariJari;
        }

       
        public double hitungLuas() {
            return Math.PI * jariJari * jariJari;
        }

      
        public double hitungKeliling() {
            return 2 * Math.PI * jariJari;
        }
    }

    // Method main
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7); // jari-jari 7

        System.out.println("Jari-jari Lingkaran: " + lingkaran.getJariJari());
        System.out.println("Luas Lingkaran     : " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran : " + lingkaran.hitungKeliling());
    }
}



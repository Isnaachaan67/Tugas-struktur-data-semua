/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */
public class PBO_Lingkaran {

    // Atribut
    private double jariJari;

    // Konstruktor
    public PBO_Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // Getter dan Setter (opsional)
    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}


    
    


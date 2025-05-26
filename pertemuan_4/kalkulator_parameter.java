/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

import java.io.InputStream;

/**
 *
 * @author isna
 */

import java.util.Scanner;

public class kalkulator_parameter {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double angka1, angka2, hasil;
            char operator;
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan operator (+, -, *, /): ");
            operator = input.next().charAt(0);
            System.out.print("Masukkan angka kedua: ");
            angka2 = input.nextDouble(); // Fixed the typo
             switch (operator) {
                case '+' -> hasil = angka1 + angka2;
                case '-' -> hasil = angka1 - angka2;
                case '*' -> hasil = angka1 * angka2;
                case '/' -> {
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol!");
                        return;
                    }
                }
                default -> {
                    System.out.println("Operator tidak valid!");
                    return;
                }
            }
System.out.println("Hasil: " + hasil);
            // Good practice to close Scanner
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author isna
 */
public class Transposisi_Matriks_3x3 {
    public static void main(String[] args) {
        int [][] matriks = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println("Transposisi Matriks: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println(matriks[j][i]+"");
            }
            System.out.println();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author isna
 */
public class Cek_Matriks_Identitas {
    public static void main(String[] args) {
        int [][]matriks = {
            {1,0,0},
            {0,1,0},
            {0,0,1},
        };
         boolean isIdentity = true;
         for (int i = 0; i <3; i++){
             for (int j=0; j<3; j++){
                 if (i==j&&matriks[i][j]!=1){
                     isIdentity = false;
                 } else if (i!=j&&matriks[i][j]!=0){
                     isIdentity = false;
                 }
                 }
             }
         if (!isIdentity){
             System.out.println("BUKAN Matriks Identitas.");
         } else {
             System.out.println("Matriks adalah Identitas.");
         }
    }
}

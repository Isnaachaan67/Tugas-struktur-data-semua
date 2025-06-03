/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author isna
 */
public class Menggabungkan_Dua_Array {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5};
        int []arr2 ={6,7,8,9,10};
        int []merged = new int [arr1.length + arr2.length];
        
        for (int i = 0; i< arr1.length; i++){merged[i] = arr1[i];}
        for (int i = 0; i< arr2.length; i++){merged[arr1.length + i] =arr2[i];}
        System.out.print("Gabungkan Array: ");
        for (int num : merged ){
            System.out.print(num+" ");
        
        }
    }
}

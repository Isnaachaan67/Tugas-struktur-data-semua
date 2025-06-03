/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6;

import java.util.Arrays;

/**
 *
 * @author isna
 */
public class Mengurutkan_Array_Nama {
    public static void main(String[] args) {
        String[] nama = {"Dina","Budi","Ali","Imam","Eko","Dwi","Rizki"};
        
        System.out.println("Insertion: ");
        insertion(nama.clone());
        
        System.out.println("Selection: ");
        selection(nama.clone());
        
        System.out.println("Bubble: ");
        bubble(nama.clone());
    }
    static void insertion(String[]arr){
        for (int i=1; i<arr.length; i++){
            String key = arr[i];
            int j=i-1;
            while(j>=0&&arr[j].compareTo(key)> 0){arr[j+1]=arr[j];
            j--;
            }
             arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
     
    static void selection(String[] arr){
        for (int i=0; i<arr.length -1; i++){
            int minIdx =i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j].compareTo(arr[minIdx])<0){
                    
                    minIdx =j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }  
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubble(String[]arr){
        for (int i=0; i<arr.length - 1; i++){
        for (int j=0; j<arr.length -i-1; j++){
            if (arr[j].compareTo(arr[j+1])>0){
                String temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
            }
          }
        }
        System.out.println(Arrays.toString(arr));        
    }
   
}
 
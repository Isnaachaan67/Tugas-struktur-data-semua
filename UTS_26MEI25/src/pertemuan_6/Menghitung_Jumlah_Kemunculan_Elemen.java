/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author isna
 */
public class Menghitung_Jumlah_Kemunculan_Elemen {
    public static void main(String[] args) {
        int[] arr= {1,2,1,3,4,2,1};
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i< arr.length; i++){
            if (! visited[i]){
                int count = 1;
                for (int j = i+1; j< arr.length; j++){
                    if (arr[i]== arr[j]){ 
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " Kemunculan " + count + " kali ");
            }
        }
    }
}

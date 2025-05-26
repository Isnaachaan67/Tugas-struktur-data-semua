/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author isna
 */
public class Method_example {
  
    public static void main(String[] args) {

      Method_example contoh =new Method_example();
      contoh.luasLingkaranProsedur ();
      contoh.luasLingkaranFungsi () ;
      
      
    }
    //method prosedur
    // ditandai dengan void
  public void luasLingkaranProsedur (){
      double jari2 = 10;
      double phi = 3.14;
      double luas = phi*jari2*jari2;
      System.out.println("Luas Lingkaran Prosedur: "+ luas);
    
}
  // method dg fungsi
  // ditandai dgn nilai balik 'return' dan diawali dengan tipe data
  
    double luasLingkaranFungsi(){
        float jari2 = 16;
        float phi = (float) 3.14;
        float luas = phi*jari2*jari2;
        System.out.println("Luas Lingkaran Fungsi = "+ luas);
        return luas;
    }
}
    
//method dg prosedur
//  


    
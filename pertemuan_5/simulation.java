/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author isna
 */
public class simulation {
    public static void main(String[] args) {
        S_WOLibrary.VehicleQueue tollGate = new S_WOLibrary.VehicleQueue(5);

        tollGate.enqueue("Mobil A");
        tollGate.enqueue("Mobil B");
        tollGate.enqueue("Truk C");
        tollGate.displayQueue();

        System.out.println(tollGate.peek());
        System.out.println(tollGate.dequeue());
        tollGate.displayQueue();

        tollGate.enqueue("Motor D");
        tollGate.enqueue("Mobil E");
        tollGate.enqueue("Mobil F"); // Akan ditolak karena antrian penuh
        tollGate.displayQueue();
    }
}

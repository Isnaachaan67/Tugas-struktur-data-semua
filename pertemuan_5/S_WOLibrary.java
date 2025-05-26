/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author isna
 */
public class S_WOLibrary {

    static class VehicleQueue {
        private final String[] queue;
    private int front;
    private int rear;
        private int size, capacity;
//konstruktor
        public VehicleQueue (int capacity) {
            this.capacity = capacity;
            this.queue = new String[capacity];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }
//tambah kendaraan
        public void enqueue(String vehicle) {
            if (size < capacity) {
                queue[++rear] = vehicle;
                size++;
                System.out.println(vehicle + " masuk ke antrian.");
            } else {
                System.out.println("⚠️ Antrian penuh! " + vehicle + " tidak bisa masuk.");
            }
        }
//keluarkan kendaraaan
        public String dequeue() {
            if (size > 0) {
                String vehicle = queue[front++];
                size--;
                return vehicle + " keluar dari antrian.";
            }
            return "⚠️ Antrian kosong!";
        }
//lihat kendaraan pertama
        public String peek() {
            if (size > 0) {
                return "Kendaraan pertama dalam antrian: " + queue[front];
            }
            return "⚠️ Antrian kosong!";
        }
//semua antrian
        public void displayQueue() {
            System.out.print("Antrian kendaraan saat ini: ");
            if (size > 0) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("⚠️ Tidak ada kendaraan dalam antrian.");
            }
        }
    }
   //main method simulasi
    public static void main(String[] args) {
        VehicleQueue antrianKendaraan = new VehicleQueue(3);
        
        antrianKendaraan.enqueue("Mobil A");
        antrianKendaraan.enqueue("Truk B");
        antrianKendaraan.enqueue("Motor C");
        antrianKendaraan.enqueue("Bus D");
        
        antrianKendaraan.displayQueue();
        
        System.out.println(antrianKendaraan.peek());
        System.out.println(antrianKendaraan.dequeue());
        antrianKendaraan.displayQueue();
    }
}

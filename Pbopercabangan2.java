/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbopercabangan2;
/**
 *
 * @author salsabila husaini
 */
import java.util.Scanner; // Membaca inputan dari user

public class Pbopercabangan2 { // deklarasi kelas pada program
    public static void main(String[] args) { // program dieksekusi
        Scanner input = new Scanner(System.in); // untuk membaca inputan dari user

        // Memasukkan nilai-nilai komponen
        System.out.print("Masukkan nilai UTS: "); // mencetak pesan untuk meminta inputan user
        double uts = input.nextDouble(); // agar bisa menginput semua jenis bilangan

        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double tugas = input.nextDouble();

        // Menghitung nilai akhir (NA)
        double na = (0.35 * uts) + (0.45 * uas) + (0.20 * tugas);

        // Menentukan nilai indeks akhir berdasarkan NA
        char nilaiIndeks;

        if (na >= 80 && na <= 100) {
            nilaiIndeks = 'A';
        } else if (na >= 70 && na < 80) {
            nilaiIndeks = 'B';
        } else if (na >= 50 && na < 70) {
            nilaiIndeks = 'C';
        } else {
            nilaiIndeks = 'E';
        }

        // Menampilkan hasil
        System.out.println("Nilai Akhir (NA): " + na);
        System.out.println("Indeks Akhir: " + nilaiIndeks);
    }
}
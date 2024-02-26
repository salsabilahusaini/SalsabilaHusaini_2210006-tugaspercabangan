/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbopercabangan3;

/**
 *
 * @author salsabila husaini
 */
import java.util.Scanner;

public class Pbopercabangan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan jumlah peserta
        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = input.nextInt();
 
        // Menghitung jumlah mobil yang diperlukan
        int jumlahMobil = jumlahPeserta / 7; // Pembagian jumlah peserta dengan kapasitas mobil

        // Memeriksa apakah ada sisa penumpang
        if (jumlahPeserta % 7 != 0) { // Jika ada sisa penumpang
            jumlahMobil++; // Menambah jumlah mobil jika ada sisa penumpang
        }

        // Menampilkan hasil
        System.out.println("Mobil yang diperlukan: " + jumlahMobil);
    }
}

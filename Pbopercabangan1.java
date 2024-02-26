/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbopercabangan1;

/**
 *
 * @author salsabila husaini
 */
import java.util.Scanner; // Membaca inputan dari user

public class Pbopercabangan1 { // deklarasi kelas pada program
    public static void main(String[] args) { // program dieksekusi
        Scanner input = new Scanner(System.in); // untuk membaca inputan dari user

        // Menerima masukan pertama
        System.out.print("Masukkan bilangan pertama: "); // mencetak pesan untuk meminta inputan user
        int bilangan1 = input.nextInt(); // memasukkan inputan

        // Menerima masukan kedua
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        // Menentukan apakah kedua bilangan genap atau ganjil menggunakan operator modulus
        boolean genap1 = bilangan1 % 2 == 0;
        boolean genap2 = bilangan2 % 2 == 0;

        // Melakukan pengecekan kondisi dan menampilkan hasil
        if (genap1 && genap2) {
            int hasil = bilangan1 + bilangan2;
            System.out.println("Kedua bilangan adalah genap, hasil penjumlahannya: " + hasil);
        } else if (!genap1 && !genap2) {
            int hasil = bilangan1 * bilangan2;
            System.out.println("Kedua bilangan adalah ganjil, hasil perkaliannya: " + hasil);
        } else {
            System.out.println("Hasil tidak ditemukan karena kedua bilangan memiliki sifat yang berbeda.");
        }
    }
}

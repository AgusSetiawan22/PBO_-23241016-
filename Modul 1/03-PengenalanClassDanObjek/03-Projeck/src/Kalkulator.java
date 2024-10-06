import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        // Inisialisasi scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Variabel untuk mengontrol apakah pengguna ingin melanjutkan operasi
        char lanjutkan = 'y';
        
        // Perulangan while, terus berjalan selama pengguna memilih 'y'
        while (lanjutkan == 'y') {
            // Menampilkan menu pilihan operasi kepada pengguna
            System.out.println("====== Pilih Operasi ======");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus");
            
            // Meminta pengguna untuk memasukkan pilihan operasi
            System.out.print("Masukkan pilihan anda (1-5): ");
            int pilihan = scanner.nextInt();
            
            // Meminta pengguna untuk memasukkan angka pertama
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            
            // Meminta pengguna untuk memasukkan angka kedua
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            
            // Variabel untuk menyimpan hasil perhitungan
            double hasil = 0;
            
            // Switch case untuk menentukan operasi berdasarkan pilihan pengguna
            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;  // Penjumlahan
                    System.out.println("Hasil penjumlahan: " + hasil);
                    break;
                case 2:
                    hasil = angka1 - angka2;  // Pengurangan
                    System.out.println("Hasil pengurangan: " + hasil);
                    break;
                case 3:
                    hasil = angka1 * angka2;  // Perkalian
                    System.out.println("Hasil perkalian: " + hasil);
                    break;
                case 4:
                    // Mengecek apakah angka kedua nol untuk menghindari pembagian dengan nol
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;  // Pembagian
                        System.out.println("Hasil pembagian: " + hasil);
                    } else {
                        System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                case 5:
                    hasil = angka1 % angka2;  // Modulus
                    System.out.println("Hasil modulus: " + hasil);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-5.");
            }
            
            // Menanyakan kepada pengguna apakah ingin melakukan operasi lagi
            System.out.print("Apakah ingin melakukan operasi lagi? (y/n): ");
            lanjutkan = scanner.next().charAt(0);
        }
        
        // Menutup program ketika pengguna memilih untuk tidak melanjutkan
        System.out.println("Perhitungan selesai. Terima kasih!");
        scanner.close();
    }
}
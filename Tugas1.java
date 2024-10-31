import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlahNilai = scanner.nextInt();
        
        
        int[] nilaiMahasiswa = new int[jumlahNilai];
        
       
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }
        
        
        System.out.println("\nNilai mahasiswa yang telah dimasukkan:");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print(nilaiMahasiswa[i] + " ");
        }
        System.out.println();
        
        
        int total = 0;
        for (int i = 0; i < jumlahNilai; i++) {
            total += nilaiMahasiswa[i];
        }
        double rataRata = (double) total / jumlahNilai;
        System.out.println("Nilai rata-rata: " + rataRata);
        
        
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        
        for (int i = 1; i < jumlahNilai; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}

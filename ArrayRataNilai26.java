import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs= new int [jumlahMahasiswa];
        double totalLulus = 0, rata2, totalTidaklulus = 0;
        int countLulus = 0, countTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahMahasiswa; i++){
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidaklulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }
        double rata2Lulus = (countLulus > 0) ? totalLulus / countLulus : 0;
        double rata2TidakLulus = (countTidakLulus > 0) ? totalTidaklulus / countTidakLulus : 0;

        System.out.println("\nRata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);

    }
}

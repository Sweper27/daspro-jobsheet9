import java.util.Scanner;

public class SearchNilai26 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Masukkan banyak elemen array: ");
        int n = sc.nextInt();
        int [] arrNilai = new int [n];

       for (int i = 0; i < n; i++) {
        System.out.print("Masukkan nilai elemen ke-" + i + " : ");
        arrNilai[i] = sc.nextInt();
       }
       System.out.print("Masukkan nilai yang ingin dicari (key): ");
       int key = sc.nextInt();

       int hasil = -1;

       for (int i = 0; i < arrNilai.length; i++) {
        if (key == arrNilai[i]) {
            hasil = i;
            break;
        }
       }
       if (hasil != -1) {
        System.out.println("Nilai " + key + " ditemukan di indeks ke-" + hasil);
       } else {
        System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
       }
    }
}

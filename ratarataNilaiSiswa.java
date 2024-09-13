package Perulangan;
import java.util.Scanner;
public class ratarataNilaiSiswa {
    public static void main(String[] args) {
        int jumlahSiswa, nilaiSiswa, totalNilai;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jumlah Siswa");
        jumlahSiswa = s.nextInt();
        int total = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa: " + i );
            int nilai = s.nextInt();
            total += nilai;

        }
            double rataRata = (double) total / jumlahSiswa;
            System.out.println("total Nilai: " + total);
            System.out.println("rata-rata Nilai: " + rataRata);


 }

}


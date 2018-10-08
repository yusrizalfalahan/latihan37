
package pbo2.pkg10117043.latihan37.program.rata.rata.nilai;

import java.util.Scanner;

/**
 *NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program data nilai
 * @author acer
 */
public class DataNilai {

    int nBanyak, jml, nilai[];
    float rata, jumlah = 0;

    public void inputNilaiMHS(int parBanyak, int parNilai[], float parJumlah, float parRata) {
        Scanner scanner = new Scanner(System.in);

        parNilai = new int[parBanyak];

        for (int i = 0; i <= parBanyak - 1; i++) {
            System.out.print("Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            parNilai[i] = scanner.nextInt();
        }

        for (int j = 0; j <= parBanyak - 1; j++) {
            parJumlah = parJumlah + parNilai[j];
        }

        parRata = parJumlah / parBanyak - 1;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " + parRata);
        System.out.println("Developed by : Alwi Yahya Muljabar");
    }

}

//NAMA       : YUSRIZAL FALAHAN
 //* KELAS      : IF-2
 //* MATAKULIAH : PBO2
 //* NIM        : 10117043
 //* DESKRIPSI PROGRES : Program ini berisi program menghitung lingkaran

package pbo2.pkg10117043.latihan37.program.rata.rata.nilai;

import java.util.Scanner;

public class PBO210117043LATIHAN37PROGRAMRATARATANILAI {

    public static void main(String[] args) {
        DataNilai inputdata = new DataNilai();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        inputdata.jumlah = input.nextInt();

        inputdata.inputNilaiMHS((int) inputdata.jumlah, inputdata.nilai, inputdata.jumlah, inputdata.rata);

    }

}

package Minggu7;
import java.util.Scanner;

public class MahasiswaMain28 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs28 data = new PencarianMhs28();
        int jumMhs = 5;

        System.out.println("------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa28 m = new Mahasiswa28(nim, nama, umur, ipk);
            data.tambah(m);
        }

            System.out.println("------------------------------------------");
            System.out.println("Data keseluruhan mahasiswa : ");
            data.tampil();

            System.out.println("______________________");
            System.out.println("______________________");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan nim mahasiswa yang dicari : ");
            System.out.println("NIM : ");
            int cari = s.nextInt();
            System.out.println("==========================================");
            System.out.println("Menggunakan sequential search");
            int posisi = data.FindSeqSearch(cari);

            data.TampilPosisi(cari, posisi);
            data.TampilData(cari, posisi);

            System.out.println("==========================================");
            System.out.println("Menggunakan binary search");
            data.FindSeqSearch(cari);
            if (posisi != -1) {
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);
            }
    }
}

           
            
package Minggu7;

public class Mahasiswa28 {
    int nim;
    String nama;
    int umur;
    double ipk;

    public Mahasiswa28(int ni, String n, int u, double i) {

        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }
    void tampil() {
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("Ipk = " + ipk);
    }

    public class PencarianMhs {
        Mahasiswa28[] listMhs = new Mahasiswa28[5];
        int idx;
    
        void tambah(Mahasiswa28 m) {
            if (idx < listMhs.length) {
                listMhs[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh !!");
            }
        }
        void tampil() {
            for(Mahasiswa28 m : listMhs) {
                m.tampil();
                System.out.println("--------------------");
            }
        }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void Tampilposisi(int x,int pos) 
    {
        if (pos!= -1) {
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
    
    public void TampilData(int x,int pos)
    {
        if (pos!= -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("Ipk\t : "+listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}
}

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("--Sistem Perpustakaan--");
        System.out.print("Masukkan nama Anda: ");
        String namaAnggota = num.nextLine();
        System.out.print("Masukkan ID Anggota: ");
        String idAnggota = num.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String alamatAnggota = num.nextLine();

        Anggota anggota = new Anggota(namaAnggota, idAnggota, alamatAnggota);
        Admin.addkekolaanggota();

        System.out.println("Selamat datang, " + anggota.getDetails());

        List<Peminjaman> daftarPeminjaman = new ArrayList<>();

        while (true) {
            System.out.println("\nPilih Menu");
            System.out.println("1. Meminjam Buku");
            System.out.println("2. Mengembalikan Buku");
            System.out.println("3. Keluar");

            int pilih = num.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    num.nextLine();
                    String judulBuku = num.nextLine();

                    System.out.print("Masukkan Nama Pengarang: ");
                    String pengarangBuku = num.nextLine();

                    System.out.print("Masukkan Nomor ISBN: ");
                    String nomorISBNBuku = num.nextLine();

                    Buku buku = new Buku(judulBuku, pengarangBuku, nomorISBNBuku);

                    Peminjaman peminjaman = new Peminjaman(buku, anggota, 7, 24);
                    daftarPeminjaman.add(peminjaman);

                    System.out.println("Anda telah meminjam buku: " + buku.getDetails());
                    System.out.println("Harus dikembalikan dalam " + peminjaman.calculateDurasiPeminjaman() + " hari.");
                    Admin.kekolaBuku();
                    Notifikasi notifikasiPeminjaman = new Notifikasi("Peminjaman berhasil!", anggota);
                    System.out.println("Notifikasi: " + notifikasiPeminjaman.getPesan());
                    break;

                case 2:
                    System.out.print("Masukkan Judul Buku yang akan dikembalikan: ");
                    num.nextLine(); // Consume the newline character
                    String judulBukuKembali = num.nextLine();
                    Peminjaman peminjamanKembali = null;
                    for (Peminjaman p : daftarPeminjaman) {
                        if (p.getBuku().getJudul().equals(judulBukuKembali) && p.getAnggota().equals(anggota)) {
                            peminjamanKembali = p;
                            break;
                        }
                    }
                    if (peminjamanKembali != null) {
                        pengembalian pengembalianBuku = new pengembalian(peminjamanKembali.getBuku(), anggota, new Date());
                        daftarPeminjaman.remove(peminjamanKembali);
                        Notifikasi notifikasiPengembalian = new Notifikasi("Pengembalian berhasil!", anggota);
                        Admin.generateLaporan();
                        System.out.println("Notifikasi: " + notifikasiPengembalian.getPesan());
                    } else {
                        System.out.println("Buku tidak ditemukan dalam daftar peminjaman Anda.");
                    }
                    break;
                case 3:
                    System.out.println("Terima Kasih Sudah menggunjungi Perpustakaan kami");
                    break;
                    default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
